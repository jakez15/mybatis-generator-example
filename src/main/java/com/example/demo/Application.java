package com.example.demo;

import com.example.demo.entity.SnapFinding;
import com.example.demo.entity.SnapFindingResult;
import com.example.demo.mapper.SnapCompositeMapper;
import com.example.demo.mapper.SnapFindingMapper;
import com.example.demo.mapper.SnapFindingResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    SnapCompositeMapper snapCompositeMapper;

    @Autowired
    SnapFindingResultMapper snapFindingResultMapper;

    @Autowired
    SnapFindingMapper snapFindingMapper;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Configuration
    @EnableSwagger2
    public class SwaggerConfig {
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build();
        }
    }

    @Profile("default")
    @Override
    public void run(String... args) throws Exception {
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
    }
}
