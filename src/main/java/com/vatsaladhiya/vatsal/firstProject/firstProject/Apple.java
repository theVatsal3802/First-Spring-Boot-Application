package com.vatsaladhiya.vatsal.firstProject.firstProject;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {
    void eatApple() {
        System.out.println("I am eating apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed() {
        System.out.println("I am creating the apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroy() {
        System.out.println("Destroying the apple bean");
    }
}
