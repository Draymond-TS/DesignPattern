package com.Draymond.Factory.AbstractFactory;

import org.junit.Test;

/*
* 抽象工厂模式
* – 用来生产不同产品族的全部产品。（对于增加新的产品，无能为力； 支持增加产品族）
* – 抽象工厂模式是工厂方法模式的升级版本，在有多个业务品种、业务 分类时，通过抽象工厂模式产生需要的对象是一种非常好的解决方式
* */
public class TestAbstractFactory {

    @Test
    public void test(){
        EFactory haierFactorty=new HaierFactory();
        haierFactorty.produceAirCondition().changeTemperature();
        haierFactorty.produceTelevison().play();


        EFactory tclFactory=new TCLFactory();
        tclFactory.produceAirCondition().changeTemperature();
        tclFactory.produceTelevison().play();
    }

}
