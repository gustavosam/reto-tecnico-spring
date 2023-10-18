package com.demo.divisas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "exchange_rates")
@Getter
@Setter
public class ExchangeRate implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "currency_origin")
  private String currencyOrigin;

  @Column(name = "currency_destination")
  private String currencyDestination;

  @Column(name = "amount_rate")
  private Double amountRate;

  private static final long serialVersionUID = 1L;
}
