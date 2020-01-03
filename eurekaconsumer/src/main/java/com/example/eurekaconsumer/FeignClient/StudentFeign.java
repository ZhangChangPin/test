package com.example.eurekaconsumer.FeignClient;

import com.example.eurekaconsumer.entity.StudentTBl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Date:     2020/1/3 11:25
 * History:
 * author:  ZCP
 * desc:
 */

@FeignClient(name = "")
public interface StudentFeign {
    @GetMapping("/getStudent")
    StudentTBl getStudent(Integer studentId);
}
