package com.kc.febs.visitor.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kc.febs.visitor.dao.CardRecordMapper;
import com.kc.febs.visitor.domin.CreditCardRecord;
import com.kc.febs.visitor.domin.CreditCardRecordView;
import com.kc.febs.visitor.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("recordService")
public class RecordServiceImpl implements RecordService {

    @Autowired
    private CardRecordMapper cardRecordMapper;

    @Override
    public void saveCardRecord(CreditCardRecord creditCardRecord) {
        cardRecordMapper.saveCardRecord(creditCardRecord);
    }

    @Override
    public Page<CreditCardRecord> queryCardRecord(Integer pageSize, Integer pageNum, String cardNumber) {
        PageHelper.startPage(pageNum,pageSize);
        return  cardRecordMapper.queryCardRecord(cardNumber);
    }
}
