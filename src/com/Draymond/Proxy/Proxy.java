package com.Draymond.Proxy;

public class Proxy implements Subject {

    private RealSubject realSubject=new RealSubject();

    public void preRequest() {
        System.out.println("this is the preRequest of the Proxy");
    }


    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }


    public void postRequest() {
        System.out.println("this is the postRequest of the Proxy");
    }
}
