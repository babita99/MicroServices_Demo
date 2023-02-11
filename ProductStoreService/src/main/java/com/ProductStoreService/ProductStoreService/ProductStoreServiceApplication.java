package com.ProductStoreService.ProductStoreService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductStoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductStoreServiceApplication.class, args);
		System.out.println("============    Welcome Product Store MicrosErvices =========");

	}

}
