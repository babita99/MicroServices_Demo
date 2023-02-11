package com.Micro_CustomerServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MicroCustomerServicesApplication {


	public static void main(String[] args) {
		SpringApplication.run(MicroCustomerServicesApplication.class, args);
		System.out.println("=********************Welcome Customer MicrosErvices ************************");
	}

}
