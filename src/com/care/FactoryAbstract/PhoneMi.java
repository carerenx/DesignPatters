package com.care.FactoryAbstract;

public class PhoneMi implements Phone{
    @Override
    public void name() {
        System.out.println("this is xiaomi phone");
    }

    @Override
    public void call() {
        System.out.println("this is xiaomi call function");
    }

    @Override
    public void wifi() {
        System.out.println("this is xiaomi wifi function");
    }
}
