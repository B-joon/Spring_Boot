package com.example.spring_boot_jpa.entity;

import com.example.spring_boot_jpa.util.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
// 실제 DB의 테이블과 매칭될 Class임을 명시한다.
// 즉, 테이블과 링크될 클래스임을 나타낸다.
@Entity
public class Board extends BaseTimeEntity {

    // 해당 테이블의 PK필드를 나타낸다.
    @Id
    // PK의 생성 규칙을 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private int readCnt;
    private String registerId;

    // 어느 필드에 어떤 값을 채워야 할지 명확하게 정하여 생성 시점에 값을 채워준다.
    @Builder
    public Board(Long id, String title, String content, int readCnt, String registerId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.readCnt = readCnt;
        this.registerId = registerId;
    }

    public Board() {

    }
}
