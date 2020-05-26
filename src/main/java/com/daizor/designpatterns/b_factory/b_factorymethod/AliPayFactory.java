package com.daizor.designpatterns.b_factory.b_factorymethod;

/**
 * @author Daizor
 * @date 2020/5/26 0:07:31
 */
public class AliPayFactory implements FactoryMethod {
    @Override
    public Payment create() {
        return new AliPay();
    }
}
