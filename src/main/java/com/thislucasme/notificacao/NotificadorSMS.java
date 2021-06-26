package com.thislucasme.notificacao;

import org.springframework.stereotype.Component;

import com.thislucasme.model.Cliente;

@TipoDoNotificador(value = NivelUrgencia.NORMAL)
@Component
public class NotificadorSMS implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s : usando SMS %s\n", cliente.nome, mensagem);
	}
	
	
}
