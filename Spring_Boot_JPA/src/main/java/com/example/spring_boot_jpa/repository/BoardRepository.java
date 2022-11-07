package com.example.spring_boot_jpa.repository;

import com.example.spring_boot_jpa.entity.Board;
import com.example.spring_boot_jpa.vo.BoardRequestVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface BoardRepository extends JpaRepository<Board, Long> {

    String UPDATE_BOARD = "UPDATE board" +
            "SET TITLE = :#{boardRequestVO.title}, " +
            "CONTENT = :#{boardRequestVO.content}, " +
            "UPDATE_TIME = NOW() " +
            "WHERE ID = :#{boardRequestVO.id}";

    // 선언적 트랜잭선을 사용한다.
    @Transactional
    // @Query Annotation으로 작성 된 변경, 삭제 쿼리를 사용할 때 사용한다.
    @Modifying
    // SQL을 JPQL로 작성할 수 있고, nativeQuery=ture 옵션으로 네이티브 쿼리도 사용 가능하게 한다.
    @Query(value = UPDATE_BOARD, nativeQuery = true)
    public int updateBoard(@Param("boardRequestVO")BoardRequestVO boardRequestVO);
}
