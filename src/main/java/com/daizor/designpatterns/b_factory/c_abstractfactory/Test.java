package com.daizor.designpatterns.b_factory.c_abstractfactory;

/**
 * 测试类
 *
 * @author Daizor
 * @date 2020/5/26 18:20:58
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory artFactory = new ArtFactory();
        artFactory.getChair().getAttributes();
        artFactory.getTable().getAttributes();
        AbstractFactory modernFactory = new ModernFactory();
        modernFactory.getChair().getAttributes();
        modernFactory.getTable().getAttributes();
    }
}
