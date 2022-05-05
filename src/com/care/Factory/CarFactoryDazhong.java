package com.care.Factory;
/*
    工厂方法模式的主要角色如下。

        抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
        具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
        抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
        具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。

    工厂方法模式的优缺点
        优点：
            用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程。
            灵活性增强，对于新产品的创建，只需多写一个相应的工厂类。
            典型的解耦框架。高层模块只需要知道产品的抽象类，无须关心其他实现类，满足迪米特法则、依赖倒置原则和里氏替换原则。
        缺点：
            类的个数容易过多，增加复杂度
            增加了系统的抽象性和理解难度
            抽象产品只能生产一种产品，此弊端可使用抽象工厂模式解决。

 */

//具体工厂
public class CarFactoryDazhong implements CarFactory {
    @Override
    public Car getcar() {
        return new DaZhong();
    }
}
