package com.example.demo.mapper;

import com.example.demo.entity.ArticleEntity;
import com.example.demo.entity.ArticleEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleEntityMapper {
    long countByExample(ArticleEntityExample example);

    int deleteByExample(ArticleEntityExample example);

    int insert(ArticleEntity record);

    int insertSelective(ArticleEntity record);

    List<ArticleEntity> selectByExampleWithBLOBs(ArticleEntityExample example);

    List<ArticleEntity> selectByExample(ArticleEntityExample example);

    int updateByExampleSelective(@Param("record") ArticleEntity record, @Param("example") ArticleEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleEntity record, @Param("example") ArticleEntityExample example);

    int updateByExample(@Param("record") ArticleEntity record, @Param("example") ArticleEntityExample example);
}