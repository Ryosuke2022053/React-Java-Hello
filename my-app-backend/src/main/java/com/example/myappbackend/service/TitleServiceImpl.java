package com.example.myappbackend.service;

import com.example.myappbackend.model.Title;
import com.example.myappbackend.repository.TitleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TitleServiceImpl implements TitleService{
    private final TitleRepository titleRepository;

    @Override
    public List<Title> getTitle() {
        return titleRepository.getTitle();
    }
}
