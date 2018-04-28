package com.example.demo.mapper;

import com.example.demo.entity.SnapFinding;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SnapFindingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SnapFinding record);

    SnapFinding selectByPrimaryKey(Long id);

    List<SnapFinding> selectAll();

    int updateByPrimaryKey(SnapFinding record);
}