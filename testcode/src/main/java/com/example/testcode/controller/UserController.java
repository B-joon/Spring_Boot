package com.example.testcode.controller;

import com.example.testcode.entity.UserEntity;
import com.example.testcode.repository.UserRepository;
import com.example.testcode.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/all")
    public List<UserEntity> searchAll() throws Exception {
        return userService.searchAll();
    }

}
