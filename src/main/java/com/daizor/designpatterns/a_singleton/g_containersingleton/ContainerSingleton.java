package com.daizor.designpatterns.a_singleton.g_containersingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 *
 * @author Daizor
 * @date 2020/5/24 22:31:27
 */
public class ContainerSingleton {
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static Object getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        synchronized (ContainerSingleton.class) {
            if (!ioc.containsKey(className)) {
                Class<?> aClass = Class.forName(className);
                Object o = aClass.newInstance();
                ioc.put(className, o);
            }
        }
        return ioc.get(className);
    }
}
