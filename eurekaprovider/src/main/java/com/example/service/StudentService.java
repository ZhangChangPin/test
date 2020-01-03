package com.example.service;

import com.example.entity.StudentTBl;
import org.springframework.stereotype.Service;


public interface StudentService {

    int deleteByPrimaryKey(Integer studentId);

    int insert(StudentTBl record);

    int insertSelective(StudentTBl record);

    StudentTBl selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(StudentTBl record);

    int updateByPrimaryKey(StudentTBl record);
}
