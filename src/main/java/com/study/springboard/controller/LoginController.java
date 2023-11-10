package com.study.springboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboard.entity.Member;
import com.study.springboard.service.MemberService;

@Controller
public class LoginController {

    @Autowired
    private MemberService memberService;

    // 로그인 페이지
    @GetMapping("/")
    public String openLogin() {

        return "login.html";
    }

    // 로그인
    @PostMapping("/login")
    @ResponseBody
    public Member login(HttpServletRequest request) {

        // 1. 회원 정보 조회
        String loginId = request.getParameter("loginId");
        String password = request.getParameter("password");
        Member member = memberService.login(loginId, password);

        // 2. 세션에 회원 정보 저장 & 세션 유지 시간 설정
        if (member != null) {
            HttpSession session = request.getSession();
            session.setAttribute("loginMember", member);
            session.setMaxInactiveInterval(60 * 30);
        }
        
        return member;
    }
}
