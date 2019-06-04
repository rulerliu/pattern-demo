package com.mayikt.service;

import com.mayikt.mapper.PaymentTransactionMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaymentService {

    public void updatePaymentStatus() {
        new PaymentTransactionMapper() {
            @Override
            public void updatePaymentStatus() {
                log.info(">>>第二个模块:修改订单状态为已经支付>>>>>");
            }
        }.updatePaymentStatus();
    }


}
