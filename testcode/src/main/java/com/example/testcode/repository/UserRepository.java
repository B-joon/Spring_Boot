package com.example.testcode.repository;

import com.example.testcode.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("select m from UserEntity m where m.member_email = :email")
    UserEntity findById(String email);

}
