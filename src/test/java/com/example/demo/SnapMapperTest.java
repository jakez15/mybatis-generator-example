package com.example.demo;

import com.example.demo.entity.SnapFinding;
import com.example.demo.mapper.SnapFindingMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@MybatisTest
@ActiveProfiles("test")
public class SnapMapperTest {

    @Autowired
    SnapFindingMapper snapFindingMapper;

    @Test
    public void givenMapper_WhenQuery_ThenSnapFinding() {
        snapFindingMapper.insert(new SnapFinding()
                .withId(1L)
                .withGrouping("grp-test")
                .withCharacteristic("grp-char")
                .withDescription("desc-test")
                .withCreatedBy("created-by-test")
                .withCreatedDate(new Date())
                .withModifiedBy("modby-test")
                .withModifiedDate(new Date()));

        SnapFinding snapFinding = snapFindingMapper.selectByPrimaryKey(1L);
        assertThat(snapFinding).isNotNull();
    }

}
