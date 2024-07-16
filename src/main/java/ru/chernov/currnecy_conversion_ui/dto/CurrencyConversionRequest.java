package ru.chernov.currnecy_conversion_ui.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CurrencyConversionRequest {
    private String from;
    private String to;
    private BigDecimal amount;
}
