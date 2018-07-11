package com.sz.yb.designmode;

/**
 * Created by tony on 2018/7/11.
 */
public class SingleTon2 {
    private static  SingleTon2 s = null;  //懒汉式，线程不安全；
    public  static SingleTon2 getSingleTon2(){
        if(s==null){
            s = new SingleTon2();
        }
        return s;
    }
    private SingleTon2(){

    }
}
