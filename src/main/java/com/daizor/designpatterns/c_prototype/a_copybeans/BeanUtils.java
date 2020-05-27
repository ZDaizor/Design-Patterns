package com.daizor.designpatterns.c_prototype.a_copybeans;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 工具类，copy bean属性
 *
 * @author Daizor
 * @date 2020/5/27 0:05:45
 */
public class BeanUtils {
    public static Object copy(Object o) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = o.getClass();
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object o1 = declaredConstructor.newInstance();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field :
                declaredFields) {
            field.setAccessible(true);
            field.set(o1, field.get(o));
        }
        return o1;
    }
}