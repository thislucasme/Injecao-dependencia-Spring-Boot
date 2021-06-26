package com.thislucasme.services;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thislucasme.notificacao.NivelUrgencia;
import com.thislucasme.notificacao.Notificador;
import com.thislucasme.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {
	
	@TipoDoNotificador(NivelUrgencia.NORMAL)
	@Autowired
	private Notificador notificador;
	
	@PostConstruct
	public void init() {
		System.out.println("INIT");
	}
	@PreDestroy 
	public void destroy() {
		System.out.println("DESTROY");
	}
	public void ativar(com.thislucasme.model.Cliente cliente) {
		cliente.ativar();
		
			notificador.notificar(cliente, "Seu cadastro no sistema est� ativo");
		
	}
	
}
