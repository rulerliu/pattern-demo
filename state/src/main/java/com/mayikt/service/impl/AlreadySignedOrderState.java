package com.mayikt.service.impl;

import com.mayikt.service.OrderStateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AlreadySignedOrderState implements OrderStateService {
    @Override
    public void orderService() {
        log.info(">>>切换为已经签收状态..");
    }
}