package com.example.dao.impl;

import com.example.dao.StudentDao;
import com.example.entity.StudentTBl;
import com.example.mapper.StudentTBlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Date:     2020/1/2 13:26
 * History:
 * author:  ZCP
 * desc:
 */
@Component
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private StudentTBlMapper studentTBlMapper;

    @Override
    public int deleteByPrimaryKey(Integer studentId) {
        return studentTBlMapper.deleteByPrimaryKey(studentId);
    }

    @Override
    public int insert(StudentTBl record) {
        return studentTBlMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentTBl record) {
        return studentTBlMapper.insertSelective(record);
    }

    @Override
    public StudentTBl selectByPrimaryKey(Integer studentId) {
        return studentTBlMapper.selectByPrimaryKey(studentId);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentTBl record) {
        return studentTBlMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentTBl record) {
        return studentTBlMapper.updateByPrimaryKey(record);
    }
}
