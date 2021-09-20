package com.example.springcloudlearn.service;

import com.example.springcloudlearn.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    //写
    public int create(Payment payment);

    //读取
    public Payment getPaymentById(@Param("id") Long id);
}