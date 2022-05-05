package com.care.FactoryAbstract;

public class RouterHuaWei implements Router{
    @Override
    public void name() {
        System.out.println("this is HuaWei Router");
    }

    @Override
    public void findRoute() {
        System.out.println("this is HuaWei Router findRoute function");
    }
}
