package com.mayikt.strategy.impl;

import com.mayikt.strategy.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 3:10
 * @version: V1.0
 */
@Component
public class YinlianPayStrategy implements PayStrategy {

    @Override
    public String toPayHtml() {
        return "银联支付HTML";
    }
}
