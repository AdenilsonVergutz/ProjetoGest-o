package controladores;

import java.util.ArrayList;

public class Espacos {

	private String NomeEspaco;
	private int LotacaoEspaco;

	public static ArrayList<Espacos> dados = new ArrayList<>();

	public String getNomeEspaco() {
		return NomeEspaco;
	}

	public void setNomeEspaco(String NomeEspaco) {
		this.NomeEspaco = NomeEspaco;
	}

	public int getLotacaoEspaco() {
		return LotacaoEspaco;
	}

	public void setLotacaoEspaco(int LotacaoEspaco) {
		this.LotacaoEspaco = LotacaoEspaco;
	}

}