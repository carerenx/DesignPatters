package com.care.Singleton;

import com.care.SingletonPattern.Hugger;
import org.junit.Test;

public class TestSingleton {
    @Test
    public void testsingleton(){
        Hugger hugger = new Hugger();
        hugger.getInstance();
    }
}
