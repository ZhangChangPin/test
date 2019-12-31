package com.example.demo.testDemo.springMVC.controller;

import com.example.demo.testDemo.springMVC.entity.WsUrRole;
import com.example.demo.testDemo.springMVC.mapper.WsUrRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date:     2019/12/30 16:07
 * History:
 * author:  ZCP
 * desc:
 */
@RestController
public class testController {
    @Autowired
    private WsUrRoleMapper wsUrRoleMapper;
    @GetMapping("/hello")
    public WsUrRole hello (){
       return wsUrRoleMapper.selectByPrimaryKey(101000);
    }
}
