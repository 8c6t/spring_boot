package com.hachicore.springinit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringInitApplication {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(SpringInitApplication.class);
//        app.setBanner((environment, sourceClass, out) -> {
//            out.println("==============================");
//            out.println("Rokuthread");
//            out.println("==============================");
//        });
//        // app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);

        new SpringApplicationBuilder()
                .sources(SpringInitApplication.class)
                .run(args);
    }

}
