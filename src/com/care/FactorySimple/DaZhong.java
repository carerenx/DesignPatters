package com.care.FactorySimple;

//具体的大众汽车来实现汽车接口
public class DaZhong implements Car{

    @Override
    public void name() {
        System.out.println("this is shang hai dazhong");
    }
}
