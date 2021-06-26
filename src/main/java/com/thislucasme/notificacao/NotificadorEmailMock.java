package com.thislucasme.notificacao;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.thislucasme.model.Cliente;

@Profile("dev")
@TipoDoNotificador(value = NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMock implements Notificador{
	
	public NotificadorEmailMock() {
		System.out.println("Notificador email: MOCK");
	}
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Mock: Notificaçao seria enviado %s : através do EMAIL %s\n", cliente.nome, mensagem);
	}
	
	
}
