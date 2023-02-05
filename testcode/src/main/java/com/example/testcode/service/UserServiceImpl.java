package com.example.testcode.service;

import com.example.testcode.entity.UserEntity;
import com.example.testcode.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity findById(String email) {
        return userRepository.findById(email);
    }

    @Transactional
    @Override
    public Long join(UserEntity user) {
        user.setMember_role("USER");

//        System.out.println(resultUser);
//        int result = 0;
//        if (resultUser.getMember_email().isEmpty()) {
//            result = 1;
//        }
        return userRepository.save(user).getMember_idx();
    }
}
