package com.daizor.designpatterns.singleton.a_hungry;

/**
 * 饿汉式单例(类加载的时候在内存中创建对象)
 * JVM保证线程安全
 *
 * @author Daizor
 * @date 2020/5/20 23:21:11
 */
public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    /**
     * 构造函数私有
     */
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}

class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                HungrySingleton instance = HungrySingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}

