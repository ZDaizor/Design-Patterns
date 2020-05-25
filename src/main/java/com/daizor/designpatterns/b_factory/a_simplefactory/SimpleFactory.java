package com.daizor.designpatterns.b_factory.a_simplefactory;

/**
 * 简单工厂模式
 *
 * @author Daizor
 * @date 2020/5/25 16:22:09
 */
public class SimpleFactory {
    public static ICourse getInstance(String name) {
        if (name.equals("java")) {
            return new JavaCourse();
        }
        if (name.equals("python")) {
            return new PythonCourse();
        } else throw new RuntimeException("类型不对");
    }
}

class Test {
    public static void main(String[] args) throws InterruptedException {
        ICourse java = SimpleFactory.getInstance("java");
        ICourse asdf = SimpleFactory.getInstance("python");
        System.out.println(java);
        System.out.println(asdf);
    }
}