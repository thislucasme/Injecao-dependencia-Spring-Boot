package com.thislucasme;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thislucasme.services.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService();
	}
	
}
