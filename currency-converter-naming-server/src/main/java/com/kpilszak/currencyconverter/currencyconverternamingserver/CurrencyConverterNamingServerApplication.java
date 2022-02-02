package com.kpilszak.currencyconverter.currencyconverternamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CurrencyConverterNamingServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterNamingServerApplication.class, args);
	}
	
}
