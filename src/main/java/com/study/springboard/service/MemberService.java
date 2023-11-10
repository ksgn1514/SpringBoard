package com.study.springboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboard.entity.Member;
import com.study.springboard.repository.MemberRepository;

@Service
public class MemberService {
    
    @Autowired
    private MemberRepository memberRepository;

    public Member login(final String loginId, final String password) {
        Member member = memberRepository.findByLoginId(loginId).get();

        if (member == null || member.getPassword().equals(password) == false) {
            return null;
        }
        return member;
    }
}
