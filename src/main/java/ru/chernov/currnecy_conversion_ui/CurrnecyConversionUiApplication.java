package ru.chernov.currnecy_conversion_ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrnecyConversionUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrnecyConversionUiApplication.class, args);
	}

}
