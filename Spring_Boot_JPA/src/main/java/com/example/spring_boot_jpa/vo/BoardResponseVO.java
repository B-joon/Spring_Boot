package com.example.spring_boot_jpa.vo;

import com.example.spring_boot_jpa.entity.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponseVO {
    private Long id;
    private String title;
    private String content;
    private int readCnt;
    private String registerId;
    private LocalDateTime registerTime;

    public BoardResponseVO(Board entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.readCnt = entity.getReadCnt();
        this.registerId = entity.getRegisterId();
        this.registerTime = entity.getRegisterTime();
    }

    public String toString() {
        return "BoardListVO [id=" + id + ", title=" + title + ", content=" + content
                + ", readCnt=" + readCnt + ", registerId=" + registerId + ", registerTime=" + registerTime + "]";
    }
}
