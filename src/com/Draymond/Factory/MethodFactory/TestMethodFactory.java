package com.Draymond.Factory.MethodFactory;

import org.junit.Test;

/*
* • 工厂方法模式要点：
*    – 为了避免简单工厂模式的缺点，不完全满足OCP。
*    – 工厂方法模式和简单工厂模式最大的不同在于，简单工厂模式只有一个（对于一个项目 或者一个独立模块而言）工厂类，
*       而工厂方法模式有一组实现了相同接口的工厂类。
* */
public class TestMethodFactory {

    @Test
    public void test(){
        BeanzFactory beanzFactory=new BeanzFactory();
        beanzFactory.produceCar().show();

        BydFactory bydFactory=new BydFactory();
        bydFactory.produceCar().show();
    }
}
