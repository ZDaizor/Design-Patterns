package com.daizor.designpatterns.d_adapter;

/**
 * @author : zhouxingzuo
 * @version : 1.0.0
 * @description : 电脑类
 * @createTime : 2020年08月25日 14:26:00
 */
public class Computer {

    void computerRecharge(TwoPlugsInterface twoPlugsInterface) {
        System.out.println("电脑啊充电开始");
        twoPlugsInterface.recharge();
        System.out.println("电脑充电结束");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.computerRecharge(new PlugsAdapter(() -> System.out.println("充电")));
    }
}
