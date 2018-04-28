package com.example.demo;

import com.example.demo.entity.SnapComposite;
import com.example.demo.entity.SnapFinding;
import com.example.demo.entity.SnapFindingResult;
import com.example.demo.mapper.SnapCompositeMapper;
import com.example.demo.mapper.SnapFindingMapper;
import com.example.demo.mapper.SnapFindingResultMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@MybatisTest
@ActiveProfiles("test")
public class SnapCompositeMapperTest {

    @Autowired
    SnapCompositeMapper snapCompositeMapper;

    @Autowired
    SnapFindingResultMapper snapFindingResultMapper;

    @Autowired
    SnapFindingMapper snapFindingMapper;

    @Test
    public void givenSnapComposit_whenQuery_thenReturnComposite() {
        snapFindingResultMapper.insert(new SnapFindingResult()
                .withId(1L)
                .withApplication("appTest")
                .withUser("test-user")
                .withCreatedBy("test-user")
                .withCreatedDate(new Date())
                .withModifiedBy("modby-test")
                .withModifiedDate(new Date()));

        snapFindingMapper.insert(new SnapFinding()
                .withId(20L)
                .withGrouping("grp-test")
                .withCharacteristic("grp-char")
                .withDescription("desc-test")
                .withCreatedBy("created-by-test")
                .withCreatedDate(new Date())
                .withModifiedBy("modby-test")
                .withModifiedDate(new Date())
                .withSnapFindingResultId(1L));

        snapFindingMapper.insert(new SnapFinding()
                .withId(10L)
                .withGrouping("grp-test-2")
                .withCharacteristic("grp-char")
                .withDescription("desc-test")
                .withCreatedBy("created-by-test")
                .withCreatedDate(new Date())
                .withModifiedBy("modby-test")
                .withModifiedDate(new Date())
                .withSnapFindingResultId(1L));

        SnapComposite snapComposite = snapCompositeMapper.selectByPrimaryKey(1L);

        assertThat(snapComposite).isNotNull();
        assertThat(snapComposite.getSnapFindingResult()).isNotNull();
        assertThat(snapComposite.getSnapFindingList().size()).isEqualTo(2);
    }

}
