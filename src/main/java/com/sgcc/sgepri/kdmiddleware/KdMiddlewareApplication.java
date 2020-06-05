package com.sgcc.sgepri.kdmiddleware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KdMiddlewareApplication {

	private static final Logger log = LoggerFactory.getLogger(KdMiddlewareApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KdMiddlewareApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			log.info("You can init your code here!");
		};
	}
}
