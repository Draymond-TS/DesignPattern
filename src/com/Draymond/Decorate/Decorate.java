package com.Draymond.Decorate;

public class Decorate implements  Component {

    Component component;

    public Decorate(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
