package com.example.myappbackend.model;

import lombok.Data;

@Data
public class BirthStone {
    private static final long serialVersionUID = 1L;
    /** 月 */
    private String month;
    /** 名前 */
    private String name;
    /** 色 */
    private String color;
}
