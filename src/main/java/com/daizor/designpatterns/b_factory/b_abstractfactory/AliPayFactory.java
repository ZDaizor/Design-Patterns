package com.daizor.designpatterns.b_factory.b_abstractfactory;

/**
 * @author Daizor
 * @date 2020/5/26 0:07:31
 */
public class AliPayFactory implements AbstractFactory {
    @Override
    public Payment create() {
        return new AliPay();
    }
}
