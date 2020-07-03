package com.ygx.demo.dao;

import com.ygx.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("studentMapper")
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    ArrayList<Student> getStudent(Student student);
}