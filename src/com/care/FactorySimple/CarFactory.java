package com.care.FactorySimple;

/*
    汽车工厂类，通过客户的需求来生产特定的类实例，然后把该实例返回。
    这样做虽然更麻烦，但是好处是你不需要知道具体汽车的类名，只需要知道
    工厂类的参数就行了。当变化的东西是参数时，就可以引入另外一个好处，
    可以同通过引入配置文件来就修改参数，从而创建不同的汽车的实例。
 */
public class CarFactory {
    public Car porduceCar(String carname){
        if (carname.equals("dazhong"))
            return new DaZhong();
        else if (carname.equals("wulinghongguang"))
            return new WuLingHongGuang();
        else
            return null;
    }
}
