package com.example.demo.mapper;

import com.example.demo.entity.SnapFindingMetadata;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SnapFindingMetadataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SnapFindingMetadata record);

    SnapFindingMetadata selectByPrimaryKey(Long id);

    List<SnapFindingMetadata> selectAll();

    int updateByPrimaryKey(SnapFindingMetadata record);
}