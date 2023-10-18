package com.demo.divisas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRateDto {

  private String currencyOrigin;

  private String currencyDestination;

  private Double amount;

  private Double amountRate;

  private Double totalAmount;
}
