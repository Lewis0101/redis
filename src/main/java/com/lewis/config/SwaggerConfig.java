package com.lewis.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : 00222 [liu.yang@unisinsight.com]
 * @description:
 * @date : 2020/1/7 11:47
 * @since: 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket creatRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lewis.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 设置接口信息
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("RESTful API")
                .description("后台api接口文档")
                .version("1.0")
                .build();
    }
}
