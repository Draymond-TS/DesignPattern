package com.Draymond.Observe;

public class Dog implements MyObserve {
    @Override
    public void response() {
        System.out.println("狗也跟着叫");
    }
}
