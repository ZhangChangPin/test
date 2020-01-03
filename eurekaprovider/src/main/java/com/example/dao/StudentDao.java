package com.example.dao;

import com.example.entity.StudentTBl;
import org.springframework.stereotype.Component;


public interface StudentDao {
    int deleteByPrimaryKey(Integer studentId);

    int insert(StudentTBl record);

    int insertSelective(StudentTBl record);

    StudentTBl selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(StudentTBl record);

    int updateByPrimaryKey(StudentTBl record);
}
