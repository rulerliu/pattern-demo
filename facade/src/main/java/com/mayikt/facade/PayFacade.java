package com.mayikt.facade;

import com.mayikt.service.IntegralService;
import com.mayikt.service.LogService;
import com.mayikt.service.MsgService;
import com.mayikt.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayFacade {


    @Autowired
    private LogService logService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private IntegralService integralService;
    @Autowired
    private MsgService msgService;

    public void facadecallback() {

        // 1.第一步 日志收集..
        logService.logService();
        // 2.第二步 修改订单状态
        paymentService.updatePaymentStatus();
        // 3.第三步调用积分服务接口
        integralService.addIntegral();
        // 4.调用消息服务平台
        msgService.sendMsg();

    }
    //  缺点：业务封装增加
}
