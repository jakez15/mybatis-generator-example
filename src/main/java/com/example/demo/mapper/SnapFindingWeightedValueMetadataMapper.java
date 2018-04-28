package com.example.demo.mapper;

import com.example.demo.entity.SnapFindingWeightedValueMetadata;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SnapFindingWeightedValueMetadataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SnapFindingWeightedValueMetadata record);

    SnapFindingWeightedValueMetadata selectByPrimaryKey(Long id);

    List<SnapFindingWeightedValueMetadata> selectAll();

    int updateByPrimaryKey(SnapFindingWeightedValueMetadata record);
}