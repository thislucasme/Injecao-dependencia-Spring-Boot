package com.thislucasme;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thislucasme.notificacao.Notificador;
import com.thislucasme.services.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}

}
