package com.example.testcode.controller;

import com.example.testcode.entity.UserEntity;
import com.example.testcode.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/doJoin")
    public Long join(@RequestBody UserEntity user) {
        Map<String, Object> resultMap = new HashMap<>();

        log.info("[UserController] : join Method");

//        if (result == 1) {
//            resultMap.put("code", "000000");
//            resultMap.put("msg", "success");
//        }

        return userService.join(user);
    }

    @GetMapping("/find/{email}")
    public UserEntity findById(@PathVariable String email) {
        return userService.findById(email);
    }

}
