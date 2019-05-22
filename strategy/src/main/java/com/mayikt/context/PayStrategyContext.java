package com.mayikt.context;

import com.mayikt.strategy.PayStrategy;
import com.mayikt.utils.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 3:12
 * @version: V1.0
 */
@Component
public class PayStrategyContext {

    @Autowired
    private SpringUtils springUtils;

    public String toPayHtml(String payCode) {
        // 1.使用payCode参数查询数据库获取beanid
        Map<String, String> map = new HashMap<>();
        map.put("aliPay", "aliPayStrategy");
        map.put("yinlianPay", "yinlianPayStrategy");

        PayStrategy payStrategy = SpringUtils.getBean(map.get(payCode), PayStrategy.class);
        Assert.notNull(payStrategy, "payStrategy must not be null");
        return payStrategy.toPayHtml();
    }
}
