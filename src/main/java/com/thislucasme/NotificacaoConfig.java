package com.thislucasme;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thislucasme.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {
	
	@Bean
	public  NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador =  new NotificadorEmail("smtp.thislucasme.com.br");
		notificador.setCaixaAlta(true);
		return notificador;
	}
	
}
