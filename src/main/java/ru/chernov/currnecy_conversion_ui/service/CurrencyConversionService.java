package ru.chernov.currnecy_conversion_ui.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ru.chernov.currnecy_conversion_ui.client.CurrencyConversionClient;
import ru.chernov.currnecy_conversion_ui.dto.CurrencyConversionResponse;

@Service
@AllArgsConstructor
public class CurrencyConversionService {
    private final CurrencyConversionClient currencyConversionClient;

    public CurrencyConversionResponse convertCurrency(String from, String to, BigDecimal amount) {
        return currencyConversionClient.convertCurrency(from, to, amount);
    }
}
