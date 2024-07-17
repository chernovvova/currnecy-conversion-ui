package ru.chernov.currnecy_conversion_ui.controller;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ru.chernov.currnecy_conversion_ui.dto.CurrencyCodesResponse;
import ru.chernov.currnecy_conversion_ui.service.CurrencyCodesService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@AllArgsConstructor
@Tag(name="Controller for currency codes", description = "Получение кодов и названий валют")
public class CurrencyCodesController {
    private final CurrencyCodesService currencyCodesService;

    @GetMapping("/codes")
    @Operation(summary = "Получение кодов и названий валют")
    public CurrencyCodesResponse getCurrencyCodes() {
        return currencyCodesService.getCurrecnyCodes();
    }
    
}
