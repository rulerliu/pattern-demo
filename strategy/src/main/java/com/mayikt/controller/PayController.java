package com.mayikt.controller;

import com.mayikt.context.PayStrategyContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Autowired
    private PayStrategyContext payStrategyContext;

    @RequestMapping("/toPayHtml")
    public  String toPayHtml(String payCode){
        if(StringUtils.isEmpty(payCode)){
            return "渠道code不能为空!";
        }
        return payStrategyContext.toPayHtml(payCode);
    }
}
