package com.chentao.echi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chentao.echi.po.FsHumbas;
import com.chentao.echi.po.FsHumbasExample;
import com.github.pagehelper.Page;

public interface FsHumbasMapper {
    long countByExample(FsHumbasExample example);

    int deleteByExample(FsHumbasExample example);

    int deleteByPrimaryKey(String humbasNo);

    int insert(FsHumbas record);

    int insertSelective(FsHumbas record);

    List<FsHumbas> selectByExample(FsHumbasExample example);

    FsHumbas selectByPrimaryKey(String humbasNo);

    int updateByExampleSelective(@Param("record") FsHumbas record, @Param("example") FsHumbasExample example);

    int updateByExample(@Param("record") FsHumbas record, @Param("example") FsHumbasExample example);

    int updateByPrimaryKeySelective(FsHumbas record);

    int updateByPrimaryKey(FsHumbas record);
    
}