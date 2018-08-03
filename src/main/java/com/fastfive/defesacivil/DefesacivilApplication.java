package com.fastfive.defesacivil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.fastfive.defesacivil.core.model"})
public class DefesacivilApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefesacivilApplication.class, args);
	}
}
