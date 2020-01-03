package com.example.eurekaconsumer;

import com.example.eurekaconsumer.FeignClient.StudentFeign;
import com.example.eurekaconsumer.entity.StudentTBl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;

@SpringBootTest
class EurekaconsumerApplicationTests {
    @Autowired
    private StudentFeign studentFeign;
    @Test
    void contextLoads() {
        StudentTBl student = studentFeign.getStudent(10);
        System.out.println(student);

    }

}
