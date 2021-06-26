package com.thislucasme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thislucasme.model.Cliente;
import com.thislucasme.services.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.println("Meu primeiro controller");
	}


	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente Joao = new Cliente("Joao");
		ativacaoClienteService.ativar(Joao);
		return "Olá!!";
	}

}
