package ru.chernov.currnecy_conversion_ui.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(name = "Container for currency codes from API responses")
public class CurrencyCodesResponse {
    @JsonProperty("supported_codes")
    @Schema(name = "Поддерживаемые коды валют")
    List<List<String>> currencyCodes;
}
