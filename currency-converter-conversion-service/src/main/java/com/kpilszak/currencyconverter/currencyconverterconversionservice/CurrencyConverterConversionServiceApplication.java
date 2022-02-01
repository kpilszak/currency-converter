package com.kpilszak.currencyconverter.currencyconverterconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConverterConversionServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterConversionServiceApplication.class, args);
	}
	
}
