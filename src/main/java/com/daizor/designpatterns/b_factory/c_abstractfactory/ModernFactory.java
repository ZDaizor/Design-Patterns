package com.daizor.designpatterns.b_factory.c_abstractfactory;

/**
 * 现代风工厂
 *
 * @author Daizor
 * @date 2020/5/26 18:19:09
 */
public class ModernFactory implements AbstractFactory {
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }
}
