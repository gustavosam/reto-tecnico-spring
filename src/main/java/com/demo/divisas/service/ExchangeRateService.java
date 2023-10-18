package com.demo.divisas.service;

import com.demo.divisas.dto.ExchangeRateDetailDto;
import com.demo.divisas.dto.ExchangeRateDto;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface ExchangeRateService {

  ExchangeRateDto getExchangeRate(String currencyOrigin, String currencyDestination, Double amount);

  List<ExchangeRateDetailDto> getExchangeRateDetail();

}
