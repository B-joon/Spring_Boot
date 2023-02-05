package com.example.testcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TestcodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestcodeApplication.class, args);
    }

}
