package com.ygx.demo.test;

import com.ygx.demo.entity.Student;

import java.io.*;

public class SerializableTest {

    public static void main(String[] args) throws Exception{
//        serialize();
        deserialize();
    }

//    public static void serialize()throws IOException {
//        Student student = new Student(100,"CodeSheep",18);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("student.txt")));
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();
//        System.out.println("序列化完毕--------------------------------");
//    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("student.txt")));
        Student student = (Student) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("反序列化完毕");
        System.out.println(student);
    }






}
