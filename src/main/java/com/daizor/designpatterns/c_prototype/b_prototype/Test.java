package com.daizor.designpatterns.c_prototype.b_prototype;

import java.lang.reflect.InvocationTargetException;

/**
 * 原型模式测试
 *
 * @author Daizor
 * @date 2020/5/27 19:42:04
 */
public class Test {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.setName("原型模式name");
        prototype.setAge(18);
        try {
            Prototype iPrototype = prototype.cloneMethod();
            System.out.println(iPrototype);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
