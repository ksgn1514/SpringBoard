package com.study.springboard.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.springboard.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{

    Optional<Member> findByLoginId(String loginId);
}
