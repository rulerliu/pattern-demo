package com.mayikt.service.impl;

import com.mayikt.service.OrderStateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InTransitOrderState implements OrderStateService {
    @Override
    public void orderService() {
        log.info(">>>切换为正在运送状态...");
    }
}