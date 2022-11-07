package com.example.spring_boot_jpa.vo;

import com.example.spring_boot_jpa.entity.Board;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequestVO {
    private Long id;
    private String title;
    private String content;
    private String registerId;

    public Board toEntity() {
        return Board.builder()
                .title(title)
                .content(content)
                .registerId(registerId)
                .build();
    }

    public BoardRequestVO() {

    }
}
