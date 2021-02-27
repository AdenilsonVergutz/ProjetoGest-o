package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladores.Acao;

public class CadastrarSalas {

	public CadastrarSalas() {

		JFrame CadastrarSala = new JFrame("GESTÃO VERGUTZ");

		CadastrarSala.setSize(350, 200);
		CadastrarSala.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CadastrarSala.setLocationRelativeTo(null);
		CadastrarSala.setLayout(null);

		JLabel lblNomeSala = new JLabel("Nome:");
		lblNomeSala.setBounds(45, 20, 90, 20);
		JLabel lblLotacaoSala = new JLabel("Capacidade:");
		lblLotacaoSala.setBounds(45, 40, 90, 20);

		JTextField txtNomeSala = new JTextField();
		txtNomeSala.setBounds(140, 20, 150, 20);
		JTextField txtLotacaoSala = new JTextField();
		txtLotacaoSala.setBounds(140, 40, 150, 20);

		JButton btnConfirma = new JButton("Confirma");
		btnConfirma.setBounds(70, 100, 90, 40);
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(180, 100, 90, 40);

		Acao a = new Acao();

		// Adicionando ação ao botão de confirma
		btnConfirma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String NomeSala = txtNomeSala.getText();
				double LotacaoSala = Double.parseDouble(txtLotacaoSala.getText());

				// Criar o objeto
				a.cadastrar(NomeSala, LotacaoSala);

				// Fechar a interface atual

				Acao a = new Acao();

				CadastrarSala.dispose();

			}
		});

		// Adicionando ação ao botão voltar
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Fechar a interface atual
				CadastrarSala.dispose();

			}
		});

		CadastrarSala.add(lblNomeSala);
		CadastrarSala.add(lblLotacaoSala);

		CadastrarSala.add(txtNomeSala);
		CadastrarSala.add(txtLotacaoSala);

		CadastrarSala.add(btnConfirma);
		CadastrarSala.add(btnVoltar);

		CadastrarSala.setVisible(true);

	}

}