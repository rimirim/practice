package com.example.demo.entity.order32;

import lombok.Data;

import java.util.Date;

@Data
public class Board {

    // Mysql - Board 테이블 내에 column들
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;

}
