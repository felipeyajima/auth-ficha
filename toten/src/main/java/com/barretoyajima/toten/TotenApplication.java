package com.barretoyajima.toten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TotenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TotenApplication.class, args);
	}

}
