package com.example.demo.mapper;

import com.example.demo.entity.DoubanFilmEntity;
import com.example.demo.entity.DoubanFilmEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoubanFilmEntityMapper {
    long countByExample(DoubanFilmEntityExample example);

    int deleteByExample(DoubanFilmEntityExample example);

    int insert(DoubanFilmEntity record);

    int insertSelective(DoubanFilmEntity record);

    List<DoubanFilmEntity> selectByExample(DoubanFilmEntityExample example);

    int updateByExampleSelective(@Param("record") DoubanFilmEntity record, @Param("example") DoubanFilmEntityExample example);

    int updateByExample(@Param("record") DoubanFilmEntity record, @Param("example") DoubanFilmEntityExample example);
}