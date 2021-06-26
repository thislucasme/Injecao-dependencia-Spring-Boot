package com.thislucasme;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thislucasme.notificacao.NotificadorEmail;
import com.thislucasme.services.AtivacaoClienteService;

//@Configuration
public class ThislucasConfig {
	
	@Bean
	public  NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador =  new NotificadorEmail("smtp.thislucasme.com.br");
		notificador.setCaixaAlta(true);
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
	
}
