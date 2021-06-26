package com.thislucasme.notificacao;



import com.thislucasme.model.Cliente;


public class NotificadorEmail implements Notificador{
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println(NotificadorEmail.class.getName());
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s : usando SMTP %s %s\n", cliente.nome, this.hostServidorSmtp, mensagem);
	}


	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
