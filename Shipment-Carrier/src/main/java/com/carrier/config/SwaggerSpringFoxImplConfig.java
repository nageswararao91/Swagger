package com.carrier.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.BasicAuth;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerSpringFoxImplConfig
{

	ApiInfo apiInfo()
	{
		return new ApiInfoBuilder().title("PMD Carriers")
			.description("API for PMD Carriers.").license("").licenseUrl("")
			.termsOfServiceUrl("").version("1.0").contact(new Contact(
				"",
				"",
				""))
			.build();
	}

	@Bean
	public Docket newDocket()
	{

		return new Docket(
			DocumentationType.SWAGGER_2)
				.securitySchemes(Arrays.asList(securityScheme()))
				.securityContexts(Arrays.asList(securityContexts())).select()
				.apis(RequestHandlerSelectors
					.basePackage("com.carrier.shipment.controller"))
				.build()
				.directModelSubstitute(org.joda.time.LocalDate.class,
					java.sql.Date.class)
				.directModelSubstitute(org.joda.time.DateTime.class,
					java.util.Date.class)
				.apiInfo(apiInfo());
	}

	private SecurityContext securityContexts()
	{
		return SecurityContext.builder()
			.securityReferences(Arrays.asList(basicAuthReference()))
			.forPaths(PathSelectors.any()).build();
	}

	private SecurityScheme securityScheme()
	{
		return new BasicAuth(
			"basicAuth");
	}

	private SecurityReference basicAuthReference()
	{
		return new SecurityReference(
			"basicAuth",
			new AuthorizationScope[0]);
	}

}
