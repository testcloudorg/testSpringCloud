package com.lh.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class TestZuulApplication {

	public static void main(String[] args) {
		System.out.println("12312312");
		SpringApplication.run(TestZuulApplication.class, args);
	}

}
