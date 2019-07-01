package com.Draymond.Decorate;

public class ConcreteDecorationB extends Decorate {
    public ConcreteDecorationB(Component component) {
        super(component);
        System.out.println("ConcreteDecorationB for Component");
    }

    public void otherB(){
        System.out.println("ConcreteDecoration for otherB");
    }
}
