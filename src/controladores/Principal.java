package controladores;

import interfaces.InterfaceLogin;

public class Principal {

	public static void main(String[] args) {

		Acao acao = new Acao();

		acao.cadastrar("Sala1", 10);
		acao.cadastrar("Sala2", 12);

		acao.CadastrarEspacos("Espaco1", 10);
		acao.CadastrarEspacos("Espaco2", 12);

		new InterfaceLogin();

	}

}
