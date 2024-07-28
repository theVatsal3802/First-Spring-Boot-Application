package com.vatsaladhiya.vatsal.firstProject.firstProject;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "development")
public class DevDB implements DB {
    @Override
    public String getData() {
        return "Dev Data";
    }
}
