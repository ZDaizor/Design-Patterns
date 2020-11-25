package com.daizor.designpatterns.d_adapter;

/**
 * @author : zhouxingzuo
 * @version : 1.0.0
 * @description : 插头适配器
 * @createTime : 2020年08月25日 15:41:00
 */
public class PlugsAdapter implements TwoPlugsInterface {

    private ThreePlugsInterface threePlugsInterface;

    public PlugsAdapter(ThreePlugsInterface threePlugsInterface) {
        this.threePlugsInterface = threePlugsInterface;
    }

    @Override
    public void recharge() {
        System.out.println("适配");
        threePlugsInterface.recharge();
    }

}
