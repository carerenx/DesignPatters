package com.care.Factory;


//具体产品
//具体的五菱宏光汽车来实现汽车接口
public class WuLingHongGuang implements Car {

    @Override
    public void name() {
        System.out.println("this is WuLingHongGuang");
    }
}
