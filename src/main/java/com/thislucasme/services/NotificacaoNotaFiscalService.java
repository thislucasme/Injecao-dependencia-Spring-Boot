package com.thislucasme.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoNotaFiscalService {
	
	@Value("${notificador.email.host-servidor}")
	private String host;
	@Value("${notificador.email.porta-servidor}")
	private Integer porta;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Porta: "+ porta);
		System.out.println("Emitindo nota fiscal para cliente: "+event.getCliente().nome);
	}
	
}
