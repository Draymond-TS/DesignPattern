package com.Draymond.Observe;

public class Cat extends  MySubject {
    @Override
    public void cry() {
        System.out.println("猫叫了！");

        //并通知观察者
        for(MyObserve observe:observes){
            observe.response();
        }
    }
}
