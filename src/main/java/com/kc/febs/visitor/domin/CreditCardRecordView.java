 package com.kc.febs.visitor.domin;

 import com.fasterxml.jackson.annotation.JsonFormat;

 import java.io.Serializable;
 import java.util.Date;


 public class CreditCardRecordView implements Serializable {

     private static final long serialVersionUID = 5609053316118517845L;

     private CreditCardRecord creditCardRecord;
     private Long recordId;

     private Long id;

     private String cardNumber;

     private  Integer cardStatus;

     private  Integer cardType;

     private String channelCode;

     private String channelName;

     private String deptName;

     private String deviceCode;

     private String deviceName;

     private Integer enterOrExit;

     private Integer openResult;

     private Integer openType;

     private String paperNumber;

     private String personCode;

     private Long personId;

     private String personName;

     @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
     private Date swingTime;
     private String recordImage;
     private String recordImageName;

     public CreditCardRecordView(CreditCardRecord record) {
        this.creditCardRecord  = record;
     }


     public String getRecordImageName() {
         return recordImageName;
     }

     public void setRecordImageName(String recordImageName) {
         this.recordImageName = recordImageName;
     }





     public Long getRecordId() {
         return recordId;
     }

     public void setRecordId(Long recordId) {
         this.recordId = recordId;
     }

     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

     public String getCardNumber() {
         return cardNumber;
     }

     public void setCardNumber(String cardNumber) {
         this.cardNumber = cardNumber;
     }

     public Integer getCardStatus() {
         return cardStatus;
     }

     public void setCardStatus(Integer cardStatus) {
         this.cardStatus = cardStatus;
     }

     public Integer getCardType() {
         return cardType;
     }

     public void setCardType(Integer cardType) {
         this.cardType = cardType;
     }

     public String getChannelCode() {
         return channelCode;
     }

     public void setChannelCode(String channelCode) {
         this.channelCode = channelCode;
     }

     public String getChannelName() {
         return channelName;
     }

     public void setChannelName(String channelName) {
         this.channelName = channelName;
     }

     public String getDeptName() {
         return deptName;
     }

     public void setDeptName(String deptName) {
         this.deptName = deptName;
     }

     public String getDeviceCode() {
         return deviceCode;
     }

     public void setDeviceCode(String deviceCode) {
         this.deviceCode = deviceCode;
     }

     public String getDeviceName() {
         return deviceName;
     }

     public void setDeviceName(String deviceName) {
         this.deviceName = deviceName;
     }

     public Integer getEnterOrExit() {
         return enterOrExit;
     }

     public void setEnterOrExit(Integer enterOrExit) {
         this.enterOrExit = enterOrExit;
     }

     public Integer getOpenResult() {
         return openResult;
     }

     public void setOpenResult(Integer openResult) {
         this.openResult = openResult;
     }

     public Integer getOpenType() {
         return openType;
     }

     public void setOpenType(Integer openType) {
         this.openType = openType;
     }

     public String getPaperNumber() {
         return paperNumber;
     }

     public void setPaperNumber(String paperNumber) {
         this.paperNumber = paperNumber;
     }

     public String getPersonCode() {
         return personCode;
     }

     public void setPersonCode(String personCode) {
         this.personCode = personCode;
     }

     public Long getPersonId() {
         return personId;
     }

     public void setPersonId(Long personId) {
         this.personId = personId;
     }

     public String getPersonName() {
         return personName;
     }

     public void setPersonName(String personName) {
         this.personName = personName;
     }

     public Date getSwingTime() {
         return swingTime;
     }

     public void setSwingTime(Date swingTime) {
         this.swingTime = swingTime;
     }

     public String getRecordImage() {
         return recordImage;
     }

     public void setRecordImage(String recordImage) {
         this.recordImage = recordImage;
     }

     @Override
     public String toString() {
         return "测试" + "CreditCardRecord{" +
                 "recordId=" + recordId +
                 ", id=" + id +
                 ", cardNumber='" + cardNumber + '\'' +
                 ", cardStatus=" + cardStatus +
                 ", cardType=" + cardType +
                 ", channelCode='" + channelCode + '\'' +
                 ", channelName='" + channelName + '\'' +
                 ", deptName='" + deptName + '\'' +
                 ", deviceCode='" + deviceCode + '\'' +
                 ", deviceName='" + deviceName + '\'' +
                 ", enterOrExit=" + enterOrExit +
                 ", openResult=" + openResult +
                 ", openType=" + openType +
                 ", paperNumber='" + paperNumber + '\'' +
                 ", personCode='" + personCode + '\'' +
                 ", personId=" + personId +
                 ", personName='" + personName + '\'' +
                 ", swingTime=" + swingTime +
                 ", recordImage='" + recordImage + '\'' +
                 '}';
     }
 }
