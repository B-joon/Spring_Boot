package com.example.testcode.controller;

import com.example.testcode.entity.UserEntity;
import com.example.testcode.repository.UserRepository;
import com.example.testcode.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate restTemplate;

    @Autowired
    UserRepository repository;

    @Autowired
    UserService service;

    @AfterEach
    public void afterEach() {
        repository.deleteAll();
    }

    @Test
    void create_test() {
        String email = "aaa23@aaa.com";
        String password = "aa2323";
        String name = "홍길동";
        String address = "서울시 관악구";
        int age = 20;
        String sns_token = "";
        String gender = "M";
        String role = "USER";

        UserEntity user = new UserEntity();

        user.setMember_email(email);
        user.setMember_password(password);
        user.setMember_name(name);
        user.setMember_address(address);
        user.setMember_age(age);
        user.setMember_sns_token(sns_token);
        user.setMember_gender(gender);
        user.setMember_role(role);

        String url = "http://localhost:" + port + "/user/dojoin";

        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, user, Long.class);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);

        UserEntity resultUser = service.findById(email);
        assertThat(resultUser.getMember_email()).isEqualTo(email);
        assertThat(resultUser.getMember_password()).isEqualTo(password);
        assertThat(resultUser.getMember_name()).isEqualTo(name);
        assertThat(resultUser.getMember_address()).isEqualTo(address);
        assertThat(resultUser.getMember_age()).isEqualTo(age);
        assertThat(resultUser.getMember_sns_token()).isEqualTo(sns_token);
        assertThat(resultUser.getMember_gender()).isEqualTo(gender);
        assertThat(resultUser.getMember_role()).isEqualTo(role);
    }

}