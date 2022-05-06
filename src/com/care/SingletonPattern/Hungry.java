package com.care.SingletonPattern;

public class Hugger {
    private static Hugger hugger=new Hugger();
    private Hugger(){

    }
    public Hugger getInstance() {
        System.out.println("hugger.getClass() = " + hugger.getClass());
        System.out.println("hugger.toString() = " + hugger.toString());
        return hugger;
    }
}
