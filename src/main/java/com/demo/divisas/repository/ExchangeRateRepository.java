package com.demo.divisas.repository;

import com.demo.divisas.entities.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {

  ExchangeRate findByCurrencyOriginAndCurrencyDestination(String currencyOrigin, String currencyDestination);
}
