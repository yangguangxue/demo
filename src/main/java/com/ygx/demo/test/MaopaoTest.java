package com.ygx.demo.test;

public class MaopaoTest {
    public static void main(String[] args) {
        int[] arrays = {12,23,4,2,45,36,8,1};
        for (int i = 0; i < arrays.length-1; i++) {
            for (int j = 0; j < arrays.length-i-1; j++) {
                if (arrays[j]>arrays[j+1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        for (int array : arrays) {
            System.out.println(array);
        }
    }
}
