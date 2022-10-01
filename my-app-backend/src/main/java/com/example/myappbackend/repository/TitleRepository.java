package com.example.myappbackend.repository;

import com.example.myappbackend.model.Title;

import java.util.List;

public interface TitleRepository {
    List<Title> getTitle();

    void addTitle(Title title);

    void editTitle(Title title);

    void deleteTitle(Long id);
}
