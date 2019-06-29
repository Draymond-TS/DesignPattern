package com.Draymond.Singleton;

/*
* 懒汉式实现
* 优点：只有调用方法才创建对象，不会占用内存
* 缺点：在多线程模式下不安全
* * */
public class SingletonDemo02 {

    private static SingletonDemo02 singletonDemo02;

    //私有化构造器，不给别人创建，确保是单例
    private SingletonDemo02(){};

    //重点于要同步synchronized,因为是第一次创建，别的线程调用，导致创建了两个对象，线程不安全
    public static  synchronized  SingletonDemo02 getInstance(SingletonDemo02 singletonDemo02 ){
        if(singletonDemo02 == null){
            return new SingletonDemo02();
        }
        return singletonDemo02;
    }
}
