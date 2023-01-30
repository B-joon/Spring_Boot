package com.example.testcode.controller;

import com.example.testcode.entity.UserEntity;
import com.example.testcode.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserEntity> searchAll() throws Exception {
        return userService.searchAll();
    }

}
