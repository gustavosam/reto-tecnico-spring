package com.demo.divisas.service;

import com.demo.divisas.dto.ExchangeRateDetailDto;
import com.demo.divisas.dto.ExchangeRateDto;
import com.demo.divisas.entities.ExchangeRate;
import com.demo.divisas.repository.ExchangeRateRepository;
import com.demo.divisas.service.mapper.ExchangeRateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService{

  @Autowired
  private ExchangeRateRepository exchangeRateRepository;

  @Override
  public ExchangeRateDto getExchangeRate(String currencyOrigin, String currencyDestination, Double amount) {

    ExchangeRate exchangeRate = exchangeRateRepository.findByCurrencyOriginAndCurrencyDestination(currencyOrigin, currencyDestination);

    return ExchangeRateMapper.fromEntityToDto(exchangeRate, amount);
  }

  @Override
  public List<ExchangeRateDetailDto> getExchangeRateDetail() {

    List<ExchangeRate> exchangeRateList = exchangeRateRepository.findAll();
    return exchangeRateList.stream().map(ExchangeRateMapper::fromEntityToDtoDetail).collect(Collectors.toList());
  }
}
