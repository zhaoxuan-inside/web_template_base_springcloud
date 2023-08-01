package org.zhaoxuan.display;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zhaoxuan.*.data.mapper")
public class DisplayApplication {
    public static void main(String[] args) {
        SpringApplication.run(DisplayApplication.class, args);
    }

}