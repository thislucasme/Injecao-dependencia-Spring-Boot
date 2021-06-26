package com.thislucasme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thislucasme.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private Notificador notificador;
	
//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}

	public void ativar(com.thislucasme.model.Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema est� ativo");
		
	}
	
//	@Autowired 
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	

}
