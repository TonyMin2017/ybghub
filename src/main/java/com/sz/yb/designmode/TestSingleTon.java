package com.sz.yb.designmode;

/**
 * Created by tony on 2018/7/11.
 */
public class TestSingleTon {

    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getSingleTon();
        SingleTon s2 = SingleTon.getSingleTon();
        System.out.println(s1==s2);
    }
}
