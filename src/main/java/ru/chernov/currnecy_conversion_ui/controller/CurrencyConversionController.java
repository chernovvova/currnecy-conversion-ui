package ru.chernov.currnecy_conversion_ui.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ru.chernov.currnecy_conversion_ui.dto.CurrencyConversionResponse;
import ru.chernov.currnecy_conversion_ui.service.CurrencyConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@AllArgsConstructor
@Tag(name="Controller for currency conversion", description = "Конвертация валюты")
public class CurrencyConversionController {
    private final CurrencyConversionService currencyConversionService;
    
    @GetMapping("/convert")
    @Operation(summary = "Конвертация валюты")
    public CurrencyConversionResponse convertCurrency(@RequestParam String from, @RequestParam String to,@RequestParam BigDecimal amount) {
        return currencyConversionService.convertCurrency(from, to, amount);
    }
    
}
