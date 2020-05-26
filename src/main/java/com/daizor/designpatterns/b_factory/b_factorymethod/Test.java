package com.daizor.designpatterns.b_factory.b_factorymethod;

/**
 * 工厂方法模式，用来解决简单工厂带来的扩展性不足的问题
 *
 * @author Daizor
 * @date 2020/5/26 0:09:10
 */
public class Test {
    public static void main(String[] args) {
        FactoryMethod aliPayFactory = new AliPayFactory();
        Payment aliPay = aliPayFactory.create();
        aliPay.pay();
        aliPay.obtainAmount();

        FactoryMethod wechatPayFactory = new WechatPayFactory();
        Payment wechatPay = wechatPayFactory.create();
        wechatPay.pay();
        wechatPay.obtainAmount();
    }
}
