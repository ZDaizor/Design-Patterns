package com.daizor.designpatterns.c_prototype.b_prototype;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Daizor
 * @date 2020/5/27 19:21:43
 */
public interface IPrototype {
    Prototype cloneMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
