package com.daizor.designpatterns.b_factory.b_abstractfactory;

/**
 * @author Daizor
 * @date 2020/5/26 0:02:45
 */
public class WechatPay implements Payment {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }

    @Override
    public void obtainAmount() {
        System.out.println("获取微信钱包余额");
    }
}
