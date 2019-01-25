package com.etc.designpattern.decorator.test;

public class TestSingleton {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = o1;

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

    }
}
