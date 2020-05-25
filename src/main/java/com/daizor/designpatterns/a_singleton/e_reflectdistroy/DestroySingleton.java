package com.daizor.designpatterns.a_singleton.e_reflectdistroy;

import com.daizor.designpatterns.a_singleton.d_staticinnerclass.StaticInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏单例
 *
 * @author Daizor
 * @date 2020/5/22 14:18:56
 */
public class DestroySingleton {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        for (int i = 0; i < 3; i++) {
            Class<StaticInnerClassSingleton> staticInnerClassSingletonClass = StaticInnerClassSingleton.class;
            Constructor<StaticInnerClassSingleton> declaredConstructor = staticInnerClassSingletonClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            StaticInnerClassSingleton staticInnerClassSingleton = declaredConstructor.newInstance();
            System.out.println(staticInnerClassSingleton);
        }
    }
}