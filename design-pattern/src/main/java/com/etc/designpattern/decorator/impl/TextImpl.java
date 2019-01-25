package com.etc.designpattern.decorator.impl;

import com.etc.designpattern.decorator.Text;

public class TextImpl implements Text {
    public String printText() {
        System.out.println("未被装饰的纯文本内容");
        return  null;
    }
}
