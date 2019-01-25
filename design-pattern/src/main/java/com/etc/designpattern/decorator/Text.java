package com.etc.designpattern.decorator;

/**
 * 装饰者模式使用
 *
 *    （1）抽象组件:定义一个抽象接口，来规范准备附加功能的类
 * （2）具体组件：将要被附加功能的类，实现抽象构件角色接口
 * （3）抽象装饰者：持有对具体构件角色的引用并定义与抽象构件角色一致的接口
 * （4）具体装饰：实现抽象装饰者角色，负责对具体构件添加额外功能。
 */
public interface Text {

    public  String printText();

}


