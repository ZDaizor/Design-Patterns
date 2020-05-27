package com.daizor.designpatterns.c_prototype.b_prototype;

import lombok.Data;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 原型类
 *
 * @author Daizor
 * @date 2020/5/27 19:21:00
 */
@Data
public class Prototype implements IPrototype {
    private String name;
    private Integer age;


    /**
     * 克隆对象，采用反射的方式
     *
     * @return 原型类对象
     */
    @Override
    public Prototype cloneMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Prototype> prototypeClass = Prototype.class;
        Constructor<Prototype> declaredConstructor = prototypeClass.getDeclaredConstructor();
        Prototype prototype = declaredConstructor.newInstance();
        Field[] declaredFields = prototypeClass.getDeclaredFields();
        for (Field field :
                declaredFields) {
            field.setAccessible(true);
            field.set(prototype, field.get(this));
        }
        return prototype;
    }
}
