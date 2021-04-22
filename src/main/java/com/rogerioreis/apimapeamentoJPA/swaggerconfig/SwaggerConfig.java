package com.rogerioreis.apimapeamentoJPA.swaggerconfig;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket apimapeamentoJPA() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.rogerioreis.apimapeamentoJPA"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {

		ApiInfo apiInfo = new ApiInfo("API REST MapeamentoJPA", "API REST de Cadastro de aluno, aula, curso, modulo, matricula e "
				+ "pagamento.", "1.0",
				"Terms of Service",
				new Contact("Rogério Reis", "https://github.com/ads4-study-group/Project-Backend-Product", "rogerio.rtr46@gmail.com"),
				"Apache License Version 2.0", "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>());

		return apiInfo;
	}


}
