package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladores.Acao;

public class AlterarSalas {

	public AlterarSalas(String obterNomeSalas, double obterLotacaoSalas, int obterLinha) {

		JFrame AlterarSalas = new JFrame("GESTÃO VERGUTZ");

		AlterarSalas.setSize(350, 200);
		AlterarSalas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AlterarSalas.setLocationRelativeTo(null);
		AlterarSalas.setLayout(null);

		JLabel lblNomeSalas = new JLabel("Nome:");
		lblNomeSalas.setBounds(45, 20, 90, 20);
		JLabel lblLotacaoSalas = new JLabel("Capacidade:");
		lblLotacaoSalas.setBounds(45, 40, 90, 20);

		JTextField txtNomeSalas = new JTextField(obterNomeSalas);
		txtNomeSalas.setBounds(140, 20, 150, 20);
		JTextField txtLotacaoSalas = new JTextField(String.valueOf(obterLotacaoSalas));
		txtLotacaoSalas.setBounds(140, 40, 150, 20);

		JButton btnConfirma = new JButton("Confirma");
		btnConfirma.setBounds(70, 100, 90, 40);
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(180, 100, 90, 40);

		// Adicionando ação ao botão de confirma
		btnConfirma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nomeSalas = txtNomeSalas.getText();
				double LotacaoSalas = Double.parseDouble(txtLotacaoSalas.getText());

				// Criar o objeto
				Acao a = new Acao();
				a.alterar(nomeSalas, LotacaoSalas, obterLinha);

				// Fechar a interface atual
				AlterarSalas.dispose();

			}
		});

		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Fechar a interface
				AlterarSalas.dispose();

			}
		});

		AlterarSalas.add(lblNomeSalas);
		AlterarSalas.add(lblLotacaoSalas);

		AlterarSalas.add(txtNomeSalas);
		AlterarSalas.add(txtLotacaoSalas);

		AlterarSalas.add(btnConfirma);
		AlterarSalas.add(btnVoltar);

		AlterarSalas.setVisible(true);

	}

}
