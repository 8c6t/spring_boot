package com.hachicore.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringInitApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello Spring";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringInitApplication.class, args);
    }

}
