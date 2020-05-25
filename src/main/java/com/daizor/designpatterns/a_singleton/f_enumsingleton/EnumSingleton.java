package com.daizor.designpatterns.a_singleton.f_enumsingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 枚举单例
 *
 * @author Daizor
 * @date 2020/5/22 15:28:51
 */
public enum EnumSingleton {
    INSTANCE;

}

class Test {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                EnumSingleton instance = EnumSingleton.INSTANCE;
                System.out.println(instance);
            }
        }).start();
    }
}

/**
 * 反射破坏单例
 */
class ReflectDestroyTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<EnumSingleton> enumSingletonClass = EnumSingleton.class;
        Constructor<EnumSingleton> declaredConstructor = enumSingletonClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumSingleton enumSingleton = declaredConstructor.newInstance();
        System.out.println(enumSingleton);
    }
}