package com.care.Factory;

//具体工厂
public class CarFactoryWuLingHongGuang implements CarFactory {
    @Override
    public Car getcar() {
        return new WuLingHongGuang();
    }
}
