package com.Draymond.Decorate;

public class ConcreteComponent implements Component{

    public ConcreteComponent() {
        System.out.println("ConcreteComponent for Component");
    }

    @Override
    public void operation() {
        System.out.println("ConcreteComponent for operation");
    }
}
