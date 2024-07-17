package ru.chernov.currnecy_conversion_ui.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(name = "Container for currency conversion responses from API")
public class CurrencyConversionResponse {
    @JsonProperty("time_last_update_unix")
    @Schema(name = "Время последнего обновления курса")
    private Long timeLastUpdate;

    @JsonProperty("time_next_update_unix")
    @Schema(name = "Время следующего обновления курса")
    private Long timeNextUpdate;

    @JsonProperty("current_unix_time")
    @Schema(name = "Текущее время")
    private Long currentTime;

    @JsonProperty("base_code")
    @Schema(name = "Код конвертируемой валюты")
    private String baseCode;
    
    @JsonProperty("amount")
    @Schema(name = "Количетсво конвертируемой валюты")
    private BigDecimal amount;

    @JsonProperty("target_code")
    @Schema(name = "Код нужной валюты")
    private String targetCode;

    @JsonProperty("result")
    @Schema(name = "Результат конвертации")
    private BigDecimal result;
}
