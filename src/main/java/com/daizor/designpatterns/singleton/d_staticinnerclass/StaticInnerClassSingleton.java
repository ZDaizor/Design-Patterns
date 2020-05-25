package com.daizor.designpatterns.singleton.d_staticinnerclass;

/**
 * 静态内部类单例模式(线程安全)
 * 静态内部类用到的时候才加载
 *
 * @author Daizor
 * @date 2020/5/22 11:56:53
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class innerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return innerClass.staticInnerClassSingleton;
    }
}

class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}