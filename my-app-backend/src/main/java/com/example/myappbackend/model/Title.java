package com.example.myappbackend.model;

import lombok.Data;

import java.util.Date;

@Data
public class Title {
    private Long id;
    private String title;
    private String content;
    private String imgPath;
    private Long userId;
    private Date updatedAt;
}
