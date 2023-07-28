package org.zhaoxuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DisplayApplication {
    public static void main(String[] args) {
        SpringApplication.run(DisplayApplication.class, args);
    }

}