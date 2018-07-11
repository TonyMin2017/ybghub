package com.sz.yb.designmode;

/**
 * Created by tony on 2018/7/11.
 */
public class SingleTon {
    private static SingleTon singleTon = new SingleTon();  //java设计模式中的饿汉式；
    public static SingleTon getSingleTon(){
        return singleTon;
    }
    private SingleTon(){
        
    }
}
