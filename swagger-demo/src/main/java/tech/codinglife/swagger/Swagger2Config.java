package tech.codinglife.swagger;

import de.pentabyte.springfox.ApiEnumDescriptionPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@Import(ApiEnumDescriptionPlugin.class)
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("tech.codinglife"))
            .paths(PathSelectors.any())
            .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("彭洪伟", "http://codinglife.tech", "pengisgood@gmail.com");

        return new ApiInfoBuilder()
            .title("Spring boot swagger demo")
            .description("Restful API 文档")
            .termsOfServiceUrl("http://codinglife.tech")
            .contact(contact)
            .version("0.0.1")
            .build();
    }
}
