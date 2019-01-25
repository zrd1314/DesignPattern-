package com.etc.designpattern.decorator.impl;

import com.etc.designpattern.decorator.Text;
import com.etc.designpattern.decorator.TextAbstract;

/**
 * 增加html功能
 */
public class HtmlTextImpl extends TextAbstract {
    public HtmlTextImpl(Text text){
        super(text);
    }

    public String printText() {
        super.printText();
        //添加额外的功能
        System.out.println("增加了额外的html代码");

        return null;
    }
}
