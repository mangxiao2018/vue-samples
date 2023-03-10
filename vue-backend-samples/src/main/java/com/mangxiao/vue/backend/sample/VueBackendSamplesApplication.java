package com.mangxiao.vue.backend.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan("com.mangxiao.vue.backend.sample.mapper")
public class VueBackendSamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueBackendSamplesApplication.class, args);
    }

}
