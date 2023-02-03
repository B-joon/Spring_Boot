package com.example.testcode.service;


import com.example.testcode.entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {

    public UserEntity findById(String email);

    @Transactional
    public Long join(UserEntity user);

}
