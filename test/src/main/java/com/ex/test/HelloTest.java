package com.ex.test;

public class HelloTest {

    public static final String A = "123";
    public static final String B;

    static {
        B = "456";
        S = A + B;
    }

    static String S;


    public static void main(String[] args){
        System.out.println(S == "123456");
        System.out.println("更新二");
    }
}
