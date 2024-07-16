package ru.chernov.currnecy_conversion_ui.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import ru.chernov.currnecy_conversion_ui.dto.CurrencyCodesResponse;
import ru.chernov.currnecy_conversion_ui.service.CurrencyCodesService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@AllArgsConstructor
public class CurrencyCodesController {
    private final CurrencyCodesService currencyCodesService;

    @GetMapping("/codes")
    public CurrencyCodesResponse getCurrencyCodes() {
        return currencyCodesService.getCurrecnyCodes();
    }
    
}
