package com.daizor.designpatterns.b_factory.c_abstractfactory;

/**
 * @author Daizor
 * @date 2020/5/26 18:16:39
 */
public class ModernTable implements Table {
    @Override
    public void getAttributes() {
        System.out.println("现代风桌子");
    }
}
