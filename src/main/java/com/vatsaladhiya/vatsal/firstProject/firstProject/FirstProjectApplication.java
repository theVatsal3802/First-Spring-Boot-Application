package com.vatsaladhiya.vatsal.firstProject.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {

//    @Autowired
//    Apple apple1;
//
//    @Autowired
//    Apple apple2;

    @Autowired
    DBService dbService;

    @Override
    public void run(String... args) throws Exception {
//        apple1.eatApple();
//        apple2.eatApple();
        System.out.println(dbService.getData());

    }


    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);
    }


}
