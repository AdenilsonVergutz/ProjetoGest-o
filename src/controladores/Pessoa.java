package controladores;

import java.util.ArrayList;

public class Pessoa {

	// Atributos da minha classe
	private String nomePessoa;
	private String SobrenomePessoa;
	private String NomeSala;

	public static ArrayList<Pessoa> dados = new ArrayList<>();

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getSobrenomePessoa() {
		return SobrenomePessoa;
	}

	public void setSobrenomePessoa(String SobrenomePessoa) {
		this.SobrenomePessoa = SobrenomePessoa;

	}

	public String getNomeSala() {
		return NomeSala;
	}

	public void setNomeSala(String NomeSala) {
		this.NomeSala = NomeSala;
	}

}