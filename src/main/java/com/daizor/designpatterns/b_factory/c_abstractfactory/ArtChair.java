package com.daizor.designpatterns.b_factory.c_abstractfactory;

/**
 * @author Daizor
 * @date 2020/5/26 18:14:47
 */
public class ArtChair implements Chair {

    @Override
    public void getAttributes() {
        System.out.println("艺术风椅子");
    }
}
