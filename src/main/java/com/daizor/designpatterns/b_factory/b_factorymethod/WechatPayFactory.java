package com.daizor.designpatterns.b_factory.b_factorymethod;

/**
 * @author Daizor
 * @date 2020/5/26 0:08:32
 */
public class WechatPayFactory implements FactoryMethod {
    @Override
    public Payment create() {
        return new WechatPay();
    }
}
