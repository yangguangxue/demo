package com.ygx.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("D:\\360极速浏览器下载\\821791-Ada_V_v1.5\\FOLLOW US.jpg"));
            fos = new FileOutputStream(new File("D:\\copy.jpg"));
            byte[] b = new byte[1024];
            int len = fis.read(b);
            while(len != -1){
                fos.write(b,0,len);
                len = fis.read(b);
            }
            System.out.println("copy success");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
