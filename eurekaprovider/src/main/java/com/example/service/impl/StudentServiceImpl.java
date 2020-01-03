package com.example.service.impl;

import com.example.dao.StudentDao;
import com.example.entity.StudentTBl;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Date:     2020/1/2 13:25
 * History:
 * author:  ZCP
 * desc:
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class, readOnly = false)
    public int deleteByPrimaryKey(Integer studentId) {
        return studentDao.deleteByPrimaryKey(studentId);
    }

    @Override
    public int insert(StudentTBl record) {
        return studentDao.insert(record);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class, readOnly = false)
    public int insertSelective(StudentTBl record) {
        return studentDao.insertSelective(record);
    }

    @Override
    public StudentTBl selectByPrimaryKey(Integer studentId) {
        return studentDao.selectByPrimaryKey(studentId);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentTBl record) {
        return studentDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentTBl record) {
        return studentDao.updateByPrimaryKey(record);
    }
}
