package com.example.testcode.service;

import com.example.testcode.entity.UserEntity;
import com.example.testcode.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> searchAll() {
        return userRepository.findAll();
    }
//
//    @Override
//    public List<UserEntity> searchParam(int member_age) {
//        return entityManager.createQuery("select m from TEST_MEMBER m where m.member_age > :member_age", UserEntity.class)
//                .setParameter("member_age", member_age)
//                .getResultList();
//    }
//
//    @Override
//    public List<UserEntity> searchParamRepo(Long member_idx) {
//        return userRepository.searchParamRepo(member_idx);
//    }
//
//    @Override
//    public String insertUser(UserEntity user) {
//        if (userRepository.findById(user.getMember_id()).isPresent()) {
//            return "동일한 계정이 있습니다.";
//        } else {
//            userRepository.save(user);
//            return "가입이 완료 되었습니다.";
//        }
//    }
//
//    @Override
//    public String updateUser(UserEntity user) {
//        if (!userRepository.findById(user.getMember_id()).isPresent()) {
//            return "계정이 존재하지 않습니다.";
//        } else {
//            userRepository.save(user);
//            return "비밀번호가 변경 되었습니다.";
//        }
//    }

    @Override
    public String deleteUser(String member_idx) {
        return null;
    }
}
