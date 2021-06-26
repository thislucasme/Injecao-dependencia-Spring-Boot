package com.thislucasme.notificacao;
import org.springframework.stereotype.Component;

import com.thislucasme.model.Cliente;

@TipoDoNotificador(value = NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s : usando SMTP %s\n", cliente.nome, mensagem);
	}
	
	
}
