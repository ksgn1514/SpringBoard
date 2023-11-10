package com.study.springboard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.springboard.service.MemberService;

@SpringBootTest
public class MemberServiceTests {
    
    @Autowired
    MemberService memberService;

    @Test
    void findByLoginIdTest() {
        System.out.println(memberService.login("test", "test1234").getLoginId());
    }

}
