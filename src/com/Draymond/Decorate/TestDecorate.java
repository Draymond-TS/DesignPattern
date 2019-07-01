package com.Draymond.Decorate;

import org.junit.Test;


public class TestDecorate {

    @Test
    public void test(){
        Component component=new ConcreteComponent();
        ConcreteDecorationA concreteDecorationA=new ConcreteDecorationA(component);
        concreteDecorationA.operation();
        concreteDecorationA.otherA();

        ConcreteDecorationB concreteDecorationB=new ConcreteDecorationB(component);
        concreteDecorationB.operation();
        concreteDecorationB.otherB();

    }

}
