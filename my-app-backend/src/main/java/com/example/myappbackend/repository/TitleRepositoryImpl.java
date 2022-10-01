package com.example.myappbackend.repository;

import com.example.myappbackend.entity.TitleEntity;
import com.example.myappbackend.mapper.TitleMapper;
import com.example.myappbackend.model.Title;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class TitleRepositoryImpl implements TitleRepository{
    private final TitleMapper titleMapper;
    private final ModelMapper modelMapper;

    @Override
    public List<Title> getTitle() {
        List<TitleEntity> titleEntities = titleMapper.title();
        return titleEntities.stream()
                .map(model -> modelMapper.map(model, Title.class))
                .collect(Collectors.toList());
    }

    @Override
    public void addTitle(Title title) {
        TitleEntity titleEntity = modelMapper.map(title, TitleEntity.class);
        titleMapper.addTitle(titleEntity);
    }

    @Override
    public void editTitle(Title title) {
        TitleEntity titleEntity = modelMapper.map(title, TitleEntity.class);
        titleMapper.editTitle(titleEntity);
    }
}
