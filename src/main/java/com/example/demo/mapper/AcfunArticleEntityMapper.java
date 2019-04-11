package com.example.demo.mapper;

import com.example.demo.entity.AcfunArticleEntity;
import com.example.demo.entity.AcfunArticleEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcfunArticleEntityMapper {
    long countByExample(AcfunArticleEntityExample example);

    int deleteByExample(AcfunArticleEntityExample example);

    int insert(AcfunArticleEntity record);

    int insertSelective(AcfunArticleEntity record);

    List<AcfunArticleEntity> selectByExampleWithBLOBs(AcfunArticleEntityExample example);

    List<AcfunArticleEntity> selectByExample(AcfunArticleEntityExample example);

    int updateByExampleSelective(@Param("record") AcfunArticleEntity record, @Param("example") AcfunArticleEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") AcfunArticleEntity record, @Param("example") AcfunArticleEntityExample example);

    int updateByExample(@Param("record") AcfunArticleEntity record, @Param("example") AcfunArticleEntityExample example);
}