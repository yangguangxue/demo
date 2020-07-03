package com.ygx.demo.test;

public class SingleLetonTest {

    private SingleLetonTest(){

    }

   private static final SingleLetonTest SINGLE_LETON_TEST = new SingleLetonTest();

    public static SingleLetonTest getSingleLetonTest(){
        return SINGLE_LETON_TEST;
    }
}
