package ru.chernov.currnecy_conversion_ui.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import ru.chernov.currnecy_conversion_ui.dto.CurrencyConversionResponse;
import ru.chernov.currnecy_conversion_ui.service.CurrencyConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@AllArgsConstructor
public class CurrencyConversionController {
    private final CurrencyConversionService currencyConversionService;
    
    @GetMapping("/convert")
    public CurrencyConversionResponse convertCurrency(@RequestParam String from, @RequestParam String to,@RequestParam BigDecimal amount) {
        return currencyConversionService.convertCurrency(from, to, amount);
    }
    
}
