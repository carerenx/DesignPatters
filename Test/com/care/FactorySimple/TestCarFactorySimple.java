package com.care.FactorySimple;

import org.junit.Test;

public class TestCarFactorySimple {
    @Test
    public void testFactorySimple(){
        Car car1 = new CarFactory().porduceCar("wulinghongguang");
        car1.name();
    }
}
