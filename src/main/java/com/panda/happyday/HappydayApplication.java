package com.panda.happyday;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "happy_day",
				version = "1.1",
				description = "API de rotinas",
				contact = @Contact(url = "http://localhost:8080", name = "HAPPY_DAY", email = "luuanaahsouza86@gmail.com")
		)
)
public class HappydayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappydayApplication.class, args);
	}

}
