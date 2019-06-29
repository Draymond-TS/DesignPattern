package com.Draymond.Factory.MethodFactory;

//步骤3： 创建具体产品类（继承抽象产品类）， 定义生产的具体产品；
public class BydCar implements  Car {

    @Override
    public void show() {
        System.out.println("这是比亚迪");
    }
}
