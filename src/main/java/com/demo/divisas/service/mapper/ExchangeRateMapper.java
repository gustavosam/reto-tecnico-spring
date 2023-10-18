package com.demo.divisas.service.mapper;

import com.demo.divisas.dto.ExchangeRateDetailDto;
import com.demo.divisas.dto.ExchangeRateDto;
import com.demo.divisas.entities.ExchangeRate;

public class ExchangeRateMapper {

  public static ExchangeRateDto fromEntityToDto(ExchangeRate exchangeRate, Double amount){

    ExchangeRateDto exchangeRateDto = new ExchangeRateDto();
    exchangeRateDto.setCurrencyOrigin(exchangeRate.getCurrencyOrigin());
    exchangeRateDto.setCurrencyDestination(exchangeRate.getCurrencyDestination());
    exchangeRateDto.setAmountRate(exchangeRate.getAmountRate());
    exchangeRateDto.setAmount(amount);
    exchangeRateDto.setTotalAmount(amount*exchangeRate.getAmountRate());

    return exchangeRateDto;
  }

  public static ExchangeRateDetailDto fromEntityToDtoDetail(ExchangeRate exchangeRate){

    ExchangeRateDetailDto exchangeRateDetailDtoDto = new ExchangeRateDetailDto();
    exchangeRateDetailDtoDto.setId(exchangeRate.getId());
    exchangeRateDetailDtoDto.setCurrencyOrigin(exchangeRate.getCurrencyOrigin());
    exchangeRateDetailDtoDto.setCurrencyDestination(exchangeRate.getCurrencyDestination());
    exchangeRateDetailDtoDto.setAmountRate(exchangeRate.getAmountRate());

    return exchangeRateDetailDtoDto;
  }
}
