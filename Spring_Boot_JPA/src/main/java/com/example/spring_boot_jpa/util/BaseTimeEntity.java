package com.example.spring_boot_jpa.util;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
// 이 클래스를 상솟하는 엔티티에 매핑되는 테이블에 생성한다.
@MappedSuperclass
// JPA 내부에서 엔티티 객체가 생성/변경되는 것을 감지하는 역할을 한다.
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

    // JPA에서 엔티티의 생성 시간을 처리한다.
    @CreatedDate
    private LocalDateTime registerTime;

    // 최종 수정 시간을 자동으로 처리한다.
    @LastModifiedDate
    private LocalDateTime updateTime;
}
