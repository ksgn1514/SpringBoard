package com.study.springboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


    // 로그인 페이지
    @GetMapping("/")
    public String login() {

        return "login.html";
    }

}
