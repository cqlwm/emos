package org.lpro.emos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;
/**
 * @author lwm
 * @date 2021-02-21 15:59
 * @description
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        // API文档信息
        ApiInfo webApiInfo = new ApiInfoBuilder()
                .title("EMOS在线办公系统")
                .description("系统开发过程中的所有API都可以通过该文档找到")
                .version("1.0")
                .contact(new Contact(
                        "EMOS",
                        "http://127.0.0.1:8080/emos/swagger-ui.html",
                        "cqlwm_dev@aliyun.com"
                ))
                .build();

        // 在请求头中设置token参数
        Parameter ticketPar = new ParameterBuilder()
                .name("token")
                .defaultValue("token")
                .description("描述：token用于身份认证")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();

        // 保存参数设置的集合
        List<Parameter> parameterList = new ArrayList<Parameter>();
        parameterList.add(ticketPar);

        return new Docket(DocumentationType.SWAGGER_2)
                .globalOperationParameters(parameterList)
                .apiInfo(webApiInfo)
                // ApiSelectorBuilder 用来设置哪些类中的方法会生成到REST API中
                .select()
                //所有包下的类，可以采用正则表达式
                .paths(PathSelectors.any())
                .build();
    }

}
