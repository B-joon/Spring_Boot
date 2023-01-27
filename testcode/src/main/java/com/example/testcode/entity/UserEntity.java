package com.example.testcode.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "TEST_MEMBER")
@Table(name = "TEST_MEMBER")
public class UserEntity {

    @Id
    @Column(nullable = false, unique = true)
    private long member_idx;

    @Column(nullable = false)
    private String member_id;

    @Column(nullable = false)
    private String member_password;

    @Column(nullable = false)
    private String member_name;

    @Column(nullable = true)
    private String member_address;

    @Column(nullable = false)
    private Date reg_date;

    @Column(nullable = false)
    private int member_age;

    @Column(nullable = true)
    private String member_sns_token;
}