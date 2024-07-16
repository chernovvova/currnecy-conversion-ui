package ru.chernov.currnecy_conversion_ui.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyCodesResponse {
    @JsonProperty("supported_codes")
    List<List<String>> currencyCodes;
}
