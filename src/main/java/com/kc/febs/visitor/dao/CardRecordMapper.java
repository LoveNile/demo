package com.kc.febs.visitor.dao;


import com.github.pagehelper.Page;
import com.kc.febs.visitor.domin.CreditCardRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface CardRecordMapper  {
    void saveCardRecord(CreditCardRecord record);

    Page<CreditCardRecord> queryCardRecord(@Param("cardNumber") String cardNumber);
}
