package controladores;

import java.util.ArrayList;

public class Salas {

	// Atributos da minha classe
	private String NomeSala;
	private double LotacaoSala;

	public static ArrayList<Salas> dados = new ArrayList<>();

	public String getNomeSala() {
		return NomeSala;
	}

	public void setNomeSala(String NomeSala) {
		this.NomeSala = NomeSala;
	}

	public double getLotacaoSala() {
		return LotacaoSala;
	}

	public void setLotacaoSala(double LotacaoSala) {
		this.LotacaoSala = LotacaoSala;
	}

}
