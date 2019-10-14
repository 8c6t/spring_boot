package com.hachicore.springinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    private String hello;

    @Autowired
    private HachicoreProperties hachicoreProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============================");
        System.out.println(hello);
        System.out.println(hachicoreProperties.getName());
        System.out.println(hachicoreProperties.getFullName());
        System.out.println("==============================");
    }
}
