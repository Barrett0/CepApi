package com.cep.api.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	public RestTemplate restemplate ( RestTemplateBuilder  builder) {
		return builder.build();
	}

}
