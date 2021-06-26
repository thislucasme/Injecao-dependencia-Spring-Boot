package com.thislucasme.model;

public class Cliente {
	
	public String nome;
	public boolean ativado = false;
	public Cliente(String nome) {
		this.nome =  nome;
	}
	public void ativar() {
		this.ativado = true;
	}

}
