package com.care.Factory;

import org.junit.Test;

public class TestCarFactory {
    @Test
    public void testFactory(){
        Car daZhong = new CarFactoryDazhong().getcar();
        daZhong.name();
    }
}
