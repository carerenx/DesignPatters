package com.care.FactoryAbstract;

import org.junit.Test;

public class TestFactoryAbstract {
    @Test
    public void testFactoryAbstract(){
        Phone huaweiphone =new FactoryHuaWei().getPhone();
        Router mirouter =new FactoryMi().getRouter();

        huaweiphone.name();
        mirouter.findRoute();
    }

}
