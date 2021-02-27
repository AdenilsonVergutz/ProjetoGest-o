package controladores;

import java.util.ArrayList;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;

public class Pessoa {

	// Atributos da minha classe
	private String nomePessoa;
	private String SobrenomePessoa;

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

}