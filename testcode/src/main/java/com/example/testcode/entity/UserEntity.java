package com.example.testcode.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity(name = "TEST_MEMBER")
@Table(name = "TEST_MEMBER")
public class UserEntity {

    @Id
    @Column(nullable = false, unique = true, name = "MEMBER_IDX")
    private long member_idx;

    @Column(nullable = false, name = "MEMBER_ID")
    private String member_id;

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
}