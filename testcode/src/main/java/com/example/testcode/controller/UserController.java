package com.example.testcode.controller;

import com.example.testcode.entity.UserEntity;
import com.example.testcode.repository.UserRepository;
import com.example.testcode.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/all")
    public List<UserEntity> searchAll() {
        return userService.searchAll();
    }

}
