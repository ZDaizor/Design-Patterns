package com.daizor.designpatterns.a_singleton.c_safelazy;

/**
 * 线程安全的懒汉式单例模式(双重检验锁)
 *
 * @author Daizor
 * @date 2020/5/22 11:11:25
 */
public class SafeLazy {
    private static volatile SafeLazy safeLazy;

    private SafeLazy() {
    }

    public static SafeLazy getInstance() {
        if (safeLazy == null) {
            synchronized (SafeLazy.class) {
                if (safeLazy == null) {
                    safeLazy = new SafeLazy();
                }
            }
        }
        return safeLazy;
    }
}

class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SafeLazy instance = SafeLazy.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}
