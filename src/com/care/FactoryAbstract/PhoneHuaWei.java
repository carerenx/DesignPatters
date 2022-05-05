package com.care.FactoryAbstract;

public class PhoneHuaWei implements Phone{

    @Override
    public void name() {
        System.out.println("this is HuaWei phone");
    }

    @Override
    public void call() {
        System.out.println("this is a HuaWei call function");
    }

    @Override
    public void wifi() {
        System.out.println("this is HuaWei wifi function");
    }
}
