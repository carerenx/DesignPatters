package com.care.FactoryAbstract;

public class FactoryMi implements Factory {
    @Override
    public Phone getPhone() {
        return new PhoneMi();
    }

    @Override
    public Router getRouter() {
        return new RouterMi();
    }
}
