package com.kc.febs.visitor.controller;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.google.gson.Gson;
import com.kc.febs.visitor.domin.CreditCardRecord;
import com.kc.febs.visitor.domin.CreditCardRecordView;
import com.kc.febs.visitor.domin.ResponseBo;
import com.kc.febs.visitor.service.RecordService;
import com.kc.febs.visitor.util.Base64ImgsUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("card")
public class CardRecordController {

    private static final Logger LOG = LoggerFactory.getLogger(CardRecordController.class);
    @Value("${cardrcord.picposition}")
    private String picPosition ;

    @Autowired
    private RecordService recordService;

    @PostMapping("record")
    @ResponseBody
    public ResponseBo addCreditCardRecordAsJson(@RequestBody CreditCardRecord record) {
        // 1将base64图片解码保存
        LOG.info(record.toString());
        String cardNumber = record.getCardNumber();
        if (StringUtils.isBlank(cardNumber)) {
            return ResponseBo.error("卡号为空，数据错误！");
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddmmHHss");
        String imageName = record.getCardNumber() + "_" + simpleDateFormat.format(date);
        try {
            Base64ImgsUtil.base64StringToImage(record.getRecordImage(), picPosition + imageName);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseBo.error("图片base64解码失败");
        }
        record.setRecordImageName(imageName);
        try {
            recordService.saveCardRecord(record);
        }catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseBo.error("失败，请联系管理员");
        }
        return ResponseBo.ok();
    }

    @PostMapping("queryRecord")
    @ResponseBody
    public Page<CreditCardRecord> queryRecord(@RequestBody String json){
        LOG.info(json);
        try {
            JSONObject jsonObject = JSON.parseObject(json);
            Page<CreditCardRecord> page = recordService.queryCardRecord(jsonObject.getInteger("pageSize"),
                    jsonObject.getInteger("pageNum"),  jsonObject.getString("cardNumber"));
            return page;
        } catch (Exception e) {
            LOG.error(e.getMessage());
        }

        return null;
    }

}
