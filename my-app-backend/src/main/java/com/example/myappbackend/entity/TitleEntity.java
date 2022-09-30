package com.example.myappbackend.entity;

import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
public class TitleEntity {
    private Long id;
    private String title;
    private String content;
    private String imgPath;
    private Long userId;
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
}
