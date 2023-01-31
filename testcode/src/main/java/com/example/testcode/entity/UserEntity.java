package com.example.testcode.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "TEST_MEMBER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, name = "MEMBER_IDX")
    private int member_idx;

    @Column(nullable = false, name = "MEMBER_EMAIL")
    private String member_email;

    @Column(nullable = false, name = "MEMBER_PASSWORD")
    private String member_password;

    @Column(nullable = false, name = "MEMBER_NAME")
    private String member_name;

    @Column(nullable = true, name = "MEMBER_ADDRESS")
    private String member_address;

    @Column(nullable = false, name = "REG_DATE")
    private Date reg_date;

    @Column(nullable = false, name = "MEMBER_AGE")
    private int member_age;

    @Column(nullable = true, name = "MEMBER_SNS_TOKEN")
    private String member_sns_token;

    @Column(nullable = false, name = "MEMBER_GENDER")
    private String member_gender;

    @Column(nullable = false, name = "MEMBER_ROLE")
    private String member_role;
}