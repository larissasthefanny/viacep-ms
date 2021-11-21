package com.example.viacepms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ViacepMsApplication {

	public static void main(String[] args){
		SpringApplication.run(ViacepMsApplication.class, args);
	}

}
