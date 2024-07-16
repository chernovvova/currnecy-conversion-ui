package ru.chernov.currnecy_conversion_ui.client;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ru.chernov.currnecy_conversion_ui.dto.CurrencyConversionResponse;

@FeignClient(name = "currency-conversion-client", url = "${currency-coversion-api.url}")
public interface CurrencyConversionClient {
    @GetMapping("/convert")
    public CurrencyConversionResponse convertCurrency(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("amount") BigDecimal amount);
} 