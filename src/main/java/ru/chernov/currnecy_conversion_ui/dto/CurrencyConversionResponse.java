package ru.chernov.currnecy_conversion_ui.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyConversionResponse {
    @JsonProperty("time_last_update_unix")
    private Long timeLastUpdate;

    @JsonProperty("time_next_update_unix")
    private Long timeNextUpdate;

    @JsonProperty("current_unix_time")
    private Long currentTime;

    @JsonProperty("base_code")
    private String baseCode;
    
    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("target_code")
    private String targetCode;

    @JsonProperty("result")
    private BigDecimal result;
}
