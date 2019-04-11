package com.example.demo.mapper;

import com.example.demo.entity.DoubanFilmReviewEntity;
import com.example.demo.entity.DoubanFilmReviewEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoubanFilmReviewEntityMapper {
    long countByExample(DoubanFilmReviewEntityExample example);

    int deleteByExample(DoubanFilmReviewEntityExample example);

    int insert(DoubanFilmReviewEntity record);

    int insertSelective(DoubanFilmReviewEntity record);

    List<DoubanFilmReviewEntity> selectByExampleWithBLOBs(DoubanFilmReviewEntityExample example);

    List<DoubanFilmReviewEntity> selectByExample(DoubanFilmReviewEntityExample example);

    int updateByExampleSelective(@Param("record") DoubanFilmReviewEntity record, @Param("example") DoubanFilmReviewEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") DoubanFilmReviewEntity record, @Param("example") DoubanFilmReviewEntityExample example);

    int updateByExample(@Param("record") DoubanFilmReviewEntity record, @Param("example") DoubanFilmReviewEntityExample example);
}