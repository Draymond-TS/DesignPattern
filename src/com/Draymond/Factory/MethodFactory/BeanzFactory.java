package com.Draymond.Factory.MethodFactory;

//步骤4：创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法；
public class BeanzFactory implements  CarFactory {
    @Override
    public Car produceCar() {
        return new BenzCar();
    }
}
