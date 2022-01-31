package com.kpilszak.currencyconverter.currencyconverterexchangeservice.repository;

import com.kpilszak.currencyconverter.currencyconverterexchangeservice.bean.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	
	CurrencyExchange findByFromAndTo(String from, String to);
}
