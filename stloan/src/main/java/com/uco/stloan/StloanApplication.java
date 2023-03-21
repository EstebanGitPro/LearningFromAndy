package com.uco.stloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.uco.stloan")
@ComponentScan(basePackages= {"com.uco.stloan"})
@EnableJpaRepositories(basePackages= {"com.uco.stloan.Repository"})
@EntityScan(basePackages= {"com.uco.stloan"})
public class StloanApplication {

	public static void main(String[] args) {
		SpringApplication.run(StloanApplication.class, args);
	}

}
