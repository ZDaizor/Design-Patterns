package com.daizor.designpatterns.b_factory.c_abstractfactory;

/**
 * 抽象工厂
 *
 * @author Daizor
 * @date 2020/5/26 18:17:49
 */
public interface AbstractFactory {
    Chair getChair();

    Table getTable();
}
