package com.example.controller;

import com.example.entity.StudentTBl;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:     2020/1/2 13:29
 * History:
 * author:  ZCP
 * desc:
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent")
    public StudentTBl getStudent(Integer studentId) {
        return studentService.selectByPrimaryKey(studentId);
    }

    @PostMapping("/saveStudent")
    public int saveStudent(@RequestBody StudentTBl studentTBl) {
        studentTBl.setCreateTime(new Date());
        studentService.insertSelective(studentTBl);
        return studentTBl.getStudentId();
    }

    @DeleteMapping("/deleteStudent")
    public int deleteStudent(Integer studentId) {
        return studentService.deleteByPrimaryKey(studentId);
    }

    @PutMapping("/updateStudent")
    public int updateStudent(@RequestBody StudentTBl studentTBl) {
        return studentService.updateByPrimaryKey(studentTBl);
    }
}
