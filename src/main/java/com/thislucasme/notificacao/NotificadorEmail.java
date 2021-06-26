package com.thislucasme.notificacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.thislucasme.model.Cliente;

@Profile("prod")
@TipoDoNotificador(value = NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador{
	
	@Autowired
	private NotificadorProperties properties;
		
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s : usando SMTP %s\n", cliente.nome, mensagem);
		System.out.println("Host: "+properties.getHostServidor());
		System.out.println("Host: "+properties.getPortaServidor());
		System.out.println("Notificador email: REAL");
	}
	
	
}
