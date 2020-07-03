package com.ygx.demo.test;

public class StringTest {
    public static void main(String[] args) {
        String string = "zszs";
        final String s1 = "zs";
        final String s2 = "zs";
        String s3 = s1+s2;
        System.out.println(string == s3);

        String s4 = "zs";
        String s5 = "zs";
        final String s6 = s4 + s5;
        System.out.println(string == s6);
        System.out.println("this is branch bugfix!");
    }
}
