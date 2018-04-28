package com.example.demo.mapper;

import com.example.demo.entity.SelectItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SelectItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SelectItem record);

    SelectItem selectByPrimaryKey(Long id);

    List<SelectItem> selectAll();

    int updateByPrimaryKey(SelectItem record);
}