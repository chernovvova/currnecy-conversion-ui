package ru.chernov.currnecy_conversion_ui.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ru.chernov.currnecy_conversion_ui.client.CurrencyConversionClient;
import ru.chernov.currnecy_conversion_ui.dto.CurrencyCodesResponse;

@Service
@AllArgsConstructor
public class CurrencyCodesService {
    private final CurrencyConversionClient currencyConversionClient;

    public CurrencyCodesResponse getCurrecnyCodes() {
        return currencyConversionClient.getCurrencyCodes();
    }
}
