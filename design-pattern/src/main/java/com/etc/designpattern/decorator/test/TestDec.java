package com.etc.designpattern.decorator.test;

import com.etc.designpattern.decorator.Text;
import com.etc.designpattern.decorator.impl.CacheTextImpl;
import com.etc.designpattern.decorator.impl.HtmlTextImpl;
import com.etc.designpattern.decorator.impl.TextImpl;

public class TestDec {
    public static void main(String[] args) {
        Text text = new TextImpl();

        //System.out.println(text.printText());
        //增加html功能
        Text texthtml = new HtmlTextImpl(text);

       // texthtml.printText();

        //还可以在 html功能 基础上再增加 缓存
        Text texthtmlCache = new CacheTextImpl(texthtml);
        texthtmlCache.printText();

    }
}
