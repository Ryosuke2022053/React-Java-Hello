package com.example.myappbackend.entity;

import lombok.Data;

@Data
public class TitleEntity {
    private Long id;
    private String title;
    private String content;
    private String imgPath;
    private Long userId;
}
