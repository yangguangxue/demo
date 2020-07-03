package com.ygx.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ygx.demo.dao.StudentMapper;
import com.ygx.demo.entity.Student;
import com.ygx.demo.service.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements IStudentService {

   private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Object insertStudent(Student student) {
        int result = studentMapper.insert(student);
        log.info("insert---"+ JSONObject.toJSON(student));
        if (result == 1) {
            return "success";
        }else{
            return "false";
        }
    }

    @Override
    public ArrayList<Student> getStudent(Student student) {
        return studentMapper.getStudent(student);
    }
}
