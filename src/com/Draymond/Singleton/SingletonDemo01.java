package com.Draymond.Singleton;

/*
* 饿汉式实现
* 优点： 在多线程模式下是安全的
* 缺点： 没有调用方法前就被加载，会占用内存
* * */
public class SingletonDemo01 {
    //类加载初始化，程序一启动就加载
    private static SingletonDemo01 singletonDemo01=new SingletonDemo01();

    //私有化构造器，不给别人创建，确保是单例
    private   SingletonDemo01(){};

    //类方法，直接通过类名.方法名调用
    public static SingletonDemo01 getInstance(){
        return singletonDemo01;
    }
}
