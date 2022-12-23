package com.mangxiao.vue.backend.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 本配置类主要是为了使用Swagger而写的。设置了扫描controller类所在的包目录
 * Swagger的访问地址：http://localhost:8080/swagger-ui.html
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2) // 1.SWAGGER_2
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mangxiao.vue.backend.sample.web")) // 2.设置扫描路径
                .build();
    }
}
