package com.example.demo.mapper;

import com.example.demo.entity.SnapFindingResult;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SnapFindingResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SnapFindingResult record);

    SnapFindingResult selectByPrimaryKey(Long id);

    List<SnapFindingResult> selectAll();

    int updateByPrimaryKey(SnapFindingResult record);
}