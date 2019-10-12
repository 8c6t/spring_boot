package com.hachicore.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInitApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringInitApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.addListeners(new StartingListener());
        app.run(args);
    }

}
