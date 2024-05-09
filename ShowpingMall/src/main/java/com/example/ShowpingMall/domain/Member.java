package com.example.ShowpingMall.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", updatable = false)
    private Long memberId;

    @Column(name = "password", updatable = false, length = 30)
    private String password;

    @Column(name = "user_name", updatable = false, length = 30)
    private String userName;

    @Column(name = "age")
    private int age;

    @Column(name = "gender", length = 1)
    private String gender;

    @Column(name = "email", updatable = false)
    private String email;

    @Column(name = "phone", updatable = false, length = 14)
    private String phone;

    @Column(name = "address", updatable = false)
    private String address;

    @CreatedDate
    @Column(name = "enroll_date", updatable = false)
    private LocalDateTime enrollDate;

    @LastModifiedDate
    @Column(name = "last_date")
    private LocalDateTime lastUpdate;


}