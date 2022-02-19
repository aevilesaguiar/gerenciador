package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	//codigo estatico, que adiciona na lista quando a maquina virtual é acionada
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Aevilés Aguiar");
		Empresa email = new Empresa();
		empresa.setEmail("aeviles@email.com");
		lista.add(empresa);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Flavio Tavares");
		Empresa email2 = new Empresa();
		empresa2.setEmail("fts@fts.com.br");
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
