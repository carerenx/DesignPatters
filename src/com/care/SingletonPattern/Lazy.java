package com.care.SingletonPattern;

public class Lazy {
    private Lazy lazy =null;
    Lazy(){

    }
    public Lazy getInstance(){
        if(null==lazy){
            lazy=new Lazy();
        }
        System.out.println("lazy.getClass() = " + lazy.getClass());
        System.out.println("lazy.toString() = " + lazy.toString());
        return lazy;
    }
}
