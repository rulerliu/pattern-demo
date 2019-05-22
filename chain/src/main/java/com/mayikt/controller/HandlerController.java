package com.mayikt.controller;

import com.mayikt.factory.GatewayHandlerFactory;
import com.mayikt.handler.GatewayHandler;
import com.mayikt.service.GatewayHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandlerController {

    @Autowired
    private GatewayHandlerService gatewayHandlerService;

    @RequestMapping("/client")
    public String client() {
        GatewayHandler gatewayHandler = GatewayHandlerFactory.getGatewayHandler();
        gatewayHandler.service();
        return "success";
    }

    @RequestMapping("/client2")
    public String client2() {
        GatewayHandler firstGatewayHandler = gatewayHandlerService.getFirstGatewayHandler();
        boolean result = firstGatewayHandler.service();
        return String.valueOf(result);
    }
}