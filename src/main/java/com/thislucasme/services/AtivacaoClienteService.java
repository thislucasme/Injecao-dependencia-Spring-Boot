package com.thislucasme.services;

import org.springframework.stereotype.Component;

import com.thislucasme.notificacao.Notificador;

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println(AtivacaoClienteService.class.getName()+": "+notificador);
	}

	public void ativar(com.thislucasme.model.Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema est� ativo");
		
	}

}
