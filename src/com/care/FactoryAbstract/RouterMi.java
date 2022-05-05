package com.care.FactoryAbstract;

public class RouterMi implements Router {
    @Override
    public void name() {
        System.out.println("this is xiaomi Router");
    }

    @Override
    public void findRoute() {
        System.out.println("this is xiaomi Router findRoute function");
    }
}
