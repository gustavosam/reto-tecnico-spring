package com.demo.divisas.controller;

import com.demo.divisas.service.ExchangeRateService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ExchangeRateController {

  @Autowired
  private ExchangeRateService exchangeRateService;

  @GetMapping("/exchange-rate")
  public ResponseEntity<?> getExchangeRate(@RequestParam(value = "fromCurrency") String currencyOrigin ,
                                           @RequestParam(value = "toCurrency") String currencyDestination,
                                           @RequestParam(value = "amount") Double amount){

    return ResponseEntity.ok(exchangeRateService.getExchangeRate(currencyOrigin, currencyDestination, amount));
  }

  @GetMapping("/exchange-rate/detail")
  public ResponseEntity<?> getExchangeRateDetail(){
    return ResponseEntity.ok(exchangeRateService.getExchangeRateDetail());
  }
}
