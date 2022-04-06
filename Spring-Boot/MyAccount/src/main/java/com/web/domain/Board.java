package com.web.domain;

import com.web.domain.enums.BoardType;

import java.io.Serializable;
import java.time.LocalDateTime; // 자바 도메인 java.time으로 시간 날짜 생성해야함. 그래야 h2에 datetime으로 잘 잡힘.

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter // 생성자로 값을 전달하고 getXXX()으로 값을 리턴하는 구조
@NoArgsConstructor
@Entity
@Table
public class Board implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String title;

    @Column
    private String subTitle;

    @Column
    private String content;

    @Column
    @Enumerated(EnumType.STRING) // enum type(여기선 스트링)을 명시
    private BoardType boardType;

    @Column
    private LocalDateTime createdDate;

    @Column
    private LocalDateTime updatedDate;

    @OneToOne(fetch= FetchType.LAZY) // 1대1 매칭
    private User user;

    @Builder // 생성자
    public Board(String title, String subTitle, String content, BoardType boardType, LocalDateTime createdDate, LocalDateTime updatedDate, User user) {
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this.boardType = boardType;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.user = user;
    }
}
