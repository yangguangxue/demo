package com.ygx.demo.service;

import com.ygx.demo.entity.Student;

import java.util.ArrayList;

public interface IStudentService {

    Object insertStudent(Student student);

    ArrayList<Student> getStudent(Student student);
}
