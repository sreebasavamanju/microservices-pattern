package com.learn.microservices.reading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@SpringBootApplication
public class ReadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingApplication.class, args);
	}

	@Bean
	public RestTemplate rest(RestTemplateBuilder builder) {
		return builder.build();
	}

}
