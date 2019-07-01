package com.Draymond.Proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("this is the request of the RealSubject");
    }
}
