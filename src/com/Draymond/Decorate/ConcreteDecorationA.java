package com.Draymond.Decorate;

public class ConcreteDecorationA extends Decorate {
    public ConcreteDecorationA(Component component) {
        super(component);
        System.out.println("ConcreteDecorationA for Component");
    }

    public void otherA(){
        System.out.println("ConcreteDecoration for otherA");
    }
}
