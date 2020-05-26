package com.daizor.designpatterns.b_factory.c_abstractfactory;

/**
 * 现代风椅子
 *
 * @author Daizor
 * @date 2020/5/26 18:06:59
 */
public class ModernChair implements Chair {

    @Override
    public void getAttributes() {
        System.out.println("现代风椅子");
    }
}
