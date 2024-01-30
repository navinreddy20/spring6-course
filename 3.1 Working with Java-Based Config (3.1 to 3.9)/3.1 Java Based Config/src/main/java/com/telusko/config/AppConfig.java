package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.telusko.Desktop;

@Configuration
public class AppConfig {

	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
}
