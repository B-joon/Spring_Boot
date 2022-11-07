package com.example.spring_boot_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*
객체를 생성하거나 수정할 때 생성자와 Setter에 LocalDateTime.now() 등
시간을 나타내는 객체를 넣어 생성일자와 수정일자를 관리할 수 있습니다.

하지만 여러 엔터티에서 이러한 코딩을 매번 하는 것은 단순하고 번거로운 작업이다.

그래서 인스턴스를 생성하거나 수정하는 변화가 있을 시에 이를 감지하여 자동으로 일시를 저장하도록 할 수 있다.
 */
@EnableJpaAuditing
@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }

}
