package com.example.springcloudlearn.service.impl;

import com.example.springcloudlearn.dao.PaymentDao;
import com.example.springcloudlearn.entities.Payment;
import com.example.springcloudlearn.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}