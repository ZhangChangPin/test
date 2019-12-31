package com.example.demo;

import com.example.demo.testDemo.springMVC.entity.WsUrRole;

public interface BaseMapper<T> {
    int deleteByPrimaryKey(Integer wsUrRoleId);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer wsUrRoleId);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
