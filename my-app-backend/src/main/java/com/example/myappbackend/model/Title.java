package com.example.myappbackend.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Title {
    private Long id;
    private String title;
    private String content;
    private String imgPath;
    private Long userId;
}
