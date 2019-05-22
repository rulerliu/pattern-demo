package com.mayikt.enums;

import org.springframework.util.Assert;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 4:02
 * @version: V1.0
 */
public enum PayStrategyEnum {
    ALI_PAY("aliPay", "aliPayStrategy"),
    YINLIAN_PAY("yinlianPay", "yinlianPayStrategy"),
    ;

    private String payCode;
    private String beanName;
    PayStrategyEnum(String payCode, String beanName) {
        this.payCode = payCode;
        this.beanName = beanName;
    }

    public static String get(String payCode) {
        Assert.notNull(payCode, "payCoce must not be null");

        for (PayStrategyEnum payStrategyEnum: PayStrategyEnum.values()) {
            if (payCode.equals(payStrategyEnum.getPayCode())) {
                return payStrategyEnum.getBeanName();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(PayStrategyEnum.get("aliPay"));
        System.out.println(PayStrategyEnum.valueOf("ALI_PAY").getBeanName());
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

}