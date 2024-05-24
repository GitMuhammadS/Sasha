package com.sasha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class SashaWebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SashaWebProjectApplication.class, args);
	}

}
