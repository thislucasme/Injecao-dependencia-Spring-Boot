package com.thislucasme.notificacao;

import com.thislucasme.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}