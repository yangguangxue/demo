package com.ygx.demo.controller;

import com.ygx.demo.entity.Student;
import com.ygx.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("/studentController")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    @PostMapping("/insertStudent")
    public Object insertStudent(@RequestBody @Valid Student student){
        Object object = iStudentService.insertStudent(student);
        return object;
    }

    @RequestMapping("getAllStudent")
    public ArrayList<Student> getStudent(@RequestBody Student student){
        return iStudentService.getStudent(student);
    }

    @RequestMapping("getAll")
    public String getStudent(){
        return "all";
    }



}
