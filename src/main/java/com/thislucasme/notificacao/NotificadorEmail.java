package com.thislucasme.notificacao;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.thislucasme.model.Cliente;

@Profile("prod")
@TipoDoNotificador(value = NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador{
	
	public NotificadorEmail() {
		System.out.println("Notificador email: REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s : usando SMTP %s\n", cliente.nome, mensagem);
	}
	
	
}
