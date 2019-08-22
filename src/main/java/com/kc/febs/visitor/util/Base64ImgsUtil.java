package com.kc.febs.visitor.util;

import com.google.gson.Gson;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

public class Base64ImgsUtil {
    static BASE64Encoder encoder = new BASE64Encoder();
    static BASE64Decoder decoder = new BASE64Decoder();

    /**
     * @param imgPath
     * @return
     */
    public static String getImageBinary(String imgPath) {
        File f = new File(imgPath.trim());
        BufferedImage bi;
        String prefix = TollUtil.suffixName("jpeg");
        try {
            bi = ImageIO.read(f);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bi, prefix , baos);
            byte[] bytes = baos.toByteArray();

            byte[] picbytes = PicUtils.compressPicForScale(bytes, 100L,"");
            return TollUtil.imgsBase(prefix) + encoder.encodeBuffer(picbytes).trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将二进制转换为图片
     * @param base64String base64转换后的
     * @param outPath 输出的地址
     */
    public static void base64StringToImage(String base64String,String outPath) throws IOException {
//        String header = base64String.substring(0,23);
//        String picPattern = header.substring(header.lastIndexOf("/")+1, header.lastIndexOf(";"));
//        String  pic = base64String.substring(23);
        byte[] bytes = decoder.decodeBuffer(base64String);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        BufferedImage bi1 = ImageIO.read(bais);
        File file = new File(outPath + "." + "jpeg");// 可以是jpg,png,gif格式
        ImageIO.write(bi1, "jpeg", file);// 不管输出什么格式图片，此处不需改动

    }
    public static void main(String[] args) {
       // System.out.println(getImageBinary("C:\\Users\\张凯\\Pictures\\Camera Roll\\603501142786475201.jpg"));
        String a = getImageBinary("C:\\Users\\张凯\\Pictures\\Camera Roll\\566.jpg");
        a = a.replace("\r\n","");
        System.out.println(a);
        Gson gson = new Gson();
        Map map = new HashMap();
        map.put("faceFile",a);
        System.out.println(gson.toJson(map));
    }
}
