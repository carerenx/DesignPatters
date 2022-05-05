package com.care.FactoryAbstract;

/*

一个工厂有多个产品时，适用于抽象工厂模式
抽象工厂模式的扩展有一定的“开闭原则”倾斜性：

    当增加一个新的产品族时只需增加一个新的具体工厂，不需要修改原代码，满足开闭原则。
    当产品族中需要增加一个新种类的产品时，则所有的工厂类都需要进行修改，不满足开闭原则。

另一方面，当系统中只存在一个等级结构的产品时，抽象工厂模式将退化到工厂方法模式。

 */
public interface Factory {
    public Phone getPhone();
    public Router getRouter();
}
