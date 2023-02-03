package com.example.testcode.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserVo {

    private long member_idx;
    private String member_id;
    private String member_password;
    private String member_name;
    private String member_address;
    private String reg_date;
    private int member_age;
    private String member_sns_token;

}
