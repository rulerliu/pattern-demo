package com.mayikt.controller;

import com.mayikt.service.PayCallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
    @Autowired
    private PayCallbackService payCallbackService;

    @RequestMapping("/payCallback")
    public String payCallback() {
        payCallbackService.callback();
        return "success";
    }
}
