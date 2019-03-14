package com.alis.verbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VerbusApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerbusApplication.class, args);
	}

}
