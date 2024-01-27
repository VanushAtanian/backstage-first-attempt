package org.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ${{ values.applicationBaseName | capitalize }}Application {
    public static void main(String[] args) {
        SpringApplication.run(${{ values.applicationBaseName | capitalize }}Application.class, args);
    }
}
