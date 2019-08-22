package com.kc.febs.visitor.service;


import com.github.pagehelper.Page;
import com.kc.febs.visitor.domin.CreditCardRecord;

import java.util.List;

public interface RecordService {

    void saveCardRecord(CreditCardRecord creditCardRecord);

    Page<CreditCardRecord> queryCardRecord(Integer pageSize, Integer pageNum, String cardNumber);
}
