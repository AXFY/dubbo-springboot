package com.pactera.dubbospringconsumerdemo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboSpringConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringConsumerDemoApplication.class, args);
    }

}

