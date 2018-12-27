package com.heq.no5_subelement_parse.lookupmethod;

/**
 * @Auther: heq
 * @Date: 2018/12/27
 * @Description:
 */
public abstract class Display {
    public void display(){
        getCar().display();
    }
    public abstract Car getCar();
}
