package com.care.FactoryAbstract;

public class FactoryHuaWei implements Factory {

    @Override
    public Phone getPhone() {
        return new PhoneHuaWei();
    }

    @Override
    public Router getRouter() {
        return new RouterHuaWei();
    }
}
