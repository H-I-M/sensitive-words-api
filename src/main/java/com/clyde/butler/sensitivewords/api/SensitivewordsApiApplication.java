package com.clyde.butler.sensitivewords.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Sensitive words API", version = "1.0"))
public class SensitivewordsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SensitivewordsApiApplication.class, args);
	}
}
