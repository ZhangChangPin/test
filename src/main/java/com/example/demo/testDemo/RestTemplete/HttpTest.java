package com.example.demo.testDemo.RestTemplete;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:     2020/1/2 15:15
 * History:
 * author:  ZCP
 * desc:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class HttpTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void getTest(){
        String url ="http://localhost:8070/getStudent?studentId=7";
        JSONObject jsonmsg = restTemplate.getForObject(url, JSONObject.class);
        System.out.println(jsonmsg);
    }
    @Test
    public void postTest(){
        String url ="http://localhost:8070/saveStudent";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","小红");
        jsonObject.put("age",15);
        Integer jsonmsg = restTemplate.postForObject(url,jsonObject,Integer.class);
        System.out.println(jsonmsg);
    }
    @Test
    public void deleteTest(){
        String url ="http://localhost:8070/deleteStudent";
        restTemplate.delete(url,6);
    }
    @Test
    public void putTest(){
        String url ="http://localhost:8070/updateStudent";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("studentId",10);
        jsonObject.put("name","小红");
        jsonObject.put("age",12);
        jsonObject.put("createTime", new Date().getTime());
        restTemplate.put(url,jsonObject);
    }
}