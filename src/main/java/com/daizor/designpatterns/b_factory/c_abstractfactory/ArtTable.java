package com.daizor.designpatterns.b_factory.c_abstractfactory;

/**
 * @author Daizor
 * @date 2020/5/26 18:17:09
 */
public class ArtTable implements Table {
    @Override
    public void getAttributes() {
        System.out.println("艺术风桌子");
    }
}
