package com.example.demo.testDemo.springMVC.mapper;

import com.example.demo.testDemo.springMVC.entity.WsUrRole;
import org.apache.ibatis.annotations.Mapper;

public interface WsUrRoleMapper {
    int deleteByPrimaryKey(Integer wsUrRoleId);

    int insert(WsUrRole record);

    int insertSelective(WsUrRole record);

    WsUrRole selectByPrimaryKey(Integer wsUrRoleId);

    int updateByPrimaryKeySelective(WsUrRole record);

    int updateByPrimaryKey(WsUrRole record);
}