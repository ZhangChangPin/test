package com.example.demo.testDemo.RestTemplete;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

/**
 * Date:     2020/1/2 15:07
 * History:
 * author:  ZCP
 * desc:
 */

@Configuration
public class HttpApiConfig {
    @Bean
    public RestTemplate restTemplate(@Qualifier("SimpleClientHttpRequestFactory") ClientHttpRequestFactory factory) {
        RestTemplate restTemplate = new RestTemplate(factory);
        //设置编码格式 解决中文乱码问题
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        return restTemplate;
    }

    @Bean(name = "SimpleClientHttpRequestFactory")
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        // 建立连接所用的时间
        factory.setReadTimeout(5000);//单位为ms
        // 建立连接后从服务器读取到可用资源所用的时间
        factory.setConnectTimeout(5000);//单位为ms
        return factory;
    }
}
