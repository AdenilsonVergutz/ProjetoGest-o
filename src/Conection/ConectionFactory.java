package Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConectionFactory {

	// Constantes para acessar o banco de dados
	private final String url = "";
	private final String user = "root";
	private final String password = "";

	// M�todo para retornar a conexão com o banco de dados
	public Connection obterConexao() {

		// Vari�vel para retornar a conexão
		Connection conexao = null;

		// Realizar a conex�o
		try {
			conexao = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Falha: " + e.getMessage());
			throw new RuntimeException(e);
		}

		// Retorno
		return conexao;

	}

}
