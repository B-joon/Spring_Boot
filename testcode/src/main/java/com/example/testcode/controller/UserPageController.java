package com.example.testcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("/member")
public class UserPageController {

    @GetMapping("/join")
    public String join() {
        return "join";
    }

}
