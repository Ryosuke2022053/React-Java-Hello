package com.example.myappbackend.mapper;

import com.example.myappbackend.entity.TitleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TitleMapper {
    List<TitleEntity> title();

    void addTitle(TitleEntity titleEntity);

    void editTitle(TitleEntity titleEntity);
}
