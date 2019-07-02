package com.Draymond.Observe;

import org.junit.Test;


public class TestObserve {

    @Test
    public void test() {
        Cat cat=new Cat();
        Dog dog=new Dog();
        Mouse mouse=new Mouse();
        cat.attach(dog);
        cat.attach(mouse);

        cat.cry();
    }

}
