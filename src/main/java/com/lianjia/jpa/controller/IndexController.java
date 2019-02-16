package com.lianjia.jpa.controller;

import com.lianjia.jpa.dao.StudentJpaRepository;
import com.lianjia.jpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class IndexController {

    @Autowired
    private StudentJpaRepository studentJpaRepository;

    @RequestMapping(value = "/index")
    public String index(){
        /*Student student = new Student();
        student.setName("liuzhiyang");
        student.setClassId(1);
        student.setAaa(678);
        studentJpaRepository.save(student);*/
        Optional<Student> optionalStudent = studentJpaRepository.findById(1);
        Student student1 = optionalStudent.get();
        return student1.getName();
    }
}
