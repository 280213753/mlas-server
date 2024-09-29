package com.qcc.fuson;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.qcc.fuson.mapper")
@SpringBootApplication
public class UnitTestDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(UnitTestDemoApplication.class, args);
    }
}
