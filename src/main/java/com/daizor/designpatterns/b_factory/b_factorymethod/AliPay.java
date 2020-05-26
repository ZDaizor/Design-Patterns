package com.daizor.designpatterns.b_factory.b_factorymethod;

/**
 * @author Daizor
 * @date 2020/5/26 0:01:54
 */
public class AliPay implements Payment {
    @Override
    public void pay() {
        System.out.println("阿里支付");
    }

    @Override
    public void obtainAmount() {
        System.out.println("获取支付宝余额");
    }
}
