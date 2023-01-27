package com.example.testcode.repository;

import com.example.testcode.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    @Query(value = "select m from TEST_MEMBER m  where m.member_idx = :member_idx ", nativeQuery = true)
    List<UserEntity> searchParamRepo(@Param("member_idx") Long member_idx);

}
