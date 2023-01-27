package com.example.testcode.service;

import com.example.testcode.entity.UserEntity;

import java.util.List;

public interface UserService {

    public List<UserEntity> searchAll();
    public List<UserEntity> searchParam(int member_age);
    public List<UserEntity> searchParamRepo(Long member_idx);
    public String insertUser(UserEntity user);
    public String updateUser(UserEntity user);
    public String deleteUser(String member_idx);

}
