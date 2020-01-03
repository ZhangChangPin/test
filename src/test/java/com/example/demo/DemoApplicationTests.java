package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private RestTemplate restTemplate;
    @Test
    public void contextLoads() {
        String url ="http://localhost:8070/getStudent?studentId=7";
        String msg = restTemplate.getForObject(url, String.class);
        System.out.println("----------------------------- \n -" + msg);
    }

}
