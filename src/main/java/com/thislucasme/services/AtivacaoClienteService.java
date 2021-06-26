package com.thislucasme.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.thislucasme.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Qualifier("urgente")
	@Autowired
	private Notificador notificador;
	
	public void ativar(com.thislucasme.model.Cliente cliente) {
		cliente.ativar();
		
			notificador.notificar(cliente, "Seu cadastro no sistema est� ativo");
		
	}
}
