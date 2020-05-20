package com.daizor.designpatterns.singleton.b_lazy;

/**
 * 懒汉式单例(用到对象的时候再去创建)
 * 线程不安全
 *
 * @author Daizor
 * @date 2020/5/20 23:45:23
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    /**
     * 构造函数私有
     */
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            try {
                //放大效果
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}

