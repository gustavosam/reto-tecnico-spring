package com.demo.divisas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRateDetailDto {

  private Long id;

  private String currencyOrigin;

  private String currencyDestination;

  private Double amountRate;

}
