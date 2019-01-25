package com.etc.designpattern.singleton;

/**
 * 单例模式
 * 1 构造方法私有
 * 2  提供当前类的实例 懒汉式 或者饿汉式
 * 3  提供获取对象的方法
 */
public class Singleton {
    private static  Singleton singleton = null ; //懒汉式

    private Singleton(){}

    //多线程环境会有问题，使用双重检查加锁
    public  static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    return  new Singleton();
                }
            }
        }
        return  null ;
    }

}
