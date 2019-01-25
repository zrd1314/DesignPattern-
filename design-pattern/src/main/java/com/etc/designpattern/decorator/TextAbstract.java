package com.etc.designpattern.decorator;

public abstract  class TextAbstract implements  Text {
    Text text ;
    public  TextAbstract(Text text){
        this.text = text ;
    }

    public String printText() {
        return  text.printText();
    }
}
