package com.thislucasme.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thislucasme.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private List<Notificador> notificadores;
	
	public void ativar(com.thislucasme.model.Cliente cliente) {
		cliente.ativar();
		
		for(Notificador notificador: notificadores) {
			notificador.notificar(cliente, "Seu cadastro no sistema est� ativo");
		}
		
	}
}
