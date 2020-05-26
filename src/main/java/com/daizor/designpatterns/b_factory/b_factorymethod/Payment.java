package com.daizor.designpatterns.b_factory.b_factorymethod;

/**
 * 支付方式
 *
 * @author Daizor
 * @date 2020/5/25 23:59:57
 */
public interface Payment {
    void pay();

    void obtainAmount();
}
