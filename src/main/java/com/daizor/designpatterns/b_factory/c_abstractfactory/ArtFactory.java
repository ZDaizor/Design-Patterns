package com.daizor.designpatterns.b_factory.c_abstractfactory;

/**
 * 艺术风工厂
 *
 * @author Daizor
 * @date 2020/5/26 18:20:02
 */
public class ArtFactory implements AbstractFactory {

    @Override
    public Chair getChair() {
        return new ArtChair();
    }

    @Override
    public Table getTable() {
        return new ArtTable();
    }
}
