package com.example.demo.mapper;

import com.example.demo.entity.SnapComposite;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SnapCompositeMapper {
    SnapComposite selectByPrimaryKey(Long id);
}

