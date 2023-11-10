package com.study.springboard.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Member {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer member_id;
    private String loginId;
    private String password;
    private String name;
    private String email;
    private String phone;
    private LocalDateTime createdDate;
}
