package com.etc.designpattern.decorator.impl;

import com.etc.designpattern.decorator.Text;
import com.etc.designpattern.decorator.TextAbstract;

public class CacheTextImpl extends TextAbstract {

    public CacheTextImpl(Text text) {
        super(text);
    }

    @Override
    public String printText() {
         super.printText();
        System.out.println("增加了缓存的功能");
         return  null ;
    }
}
