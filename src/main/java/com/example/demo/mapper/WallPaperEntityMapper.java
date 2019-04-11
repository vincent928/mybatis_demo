package com.example.demo.mapper;

import com.example.demo.entity.WallPaperEntity;
import com.example.demo.entity.WallPaperEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WallPaperEntityMapper {
    long countByExample(WallPaperEntityExample example);

    int deleteByExample(WallPaperEntityExample example);

    int insert(WallPaperEntity record);

    int insertSelective(WallPaperEntity record);

    List<WallPaperEntity> selectByExample(WallPaperEntityExample example);

    int updateByExampleSelective(@Param("record") WallPaperEntity record, @Param("example") WallPaperEntityExample example);

    int updateByExample(@Param("record") WallPaperEntity record, @Param("example") WallPaperEntityExample example);
}