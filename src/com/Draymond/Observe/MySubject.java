package com.Draymond.Observe;

import java.util.ArrayList;
import java.util.List;

public abstract class MySubject {
    protected List<MyObserve> observes=new ArrayList<>();
    public void attach(MyObserve observe){
        observes.add(observe);
    }
    public  void detach(MyObserve observe){
        observes.remove(observe);
    }
    //抽象方法通知观察者
    public abstract void cry();
}
