package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladores.Acao;

public class AlterarEspacos {

	public AlterarEspacos(String obterNomeEspaco, String obterLotacaoEspaco, int obterLinha) {

		JFrame AlterarEspaco = new JFrame("GESTÃO VERGUTZ");

		AlterarEspaco.setSize(350, 200);
		AlterarEspaco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AlterarEspaco.setLocationRelativeTo(null);
		AlterarEspaco.setLayout(null);

		JLabel lblNomeEspaco = new JLabel("Nome:");
		lblNomeEspaco.setBounds(45, 20, 90, 20);
		JLabel lblLotacaoEspaco = new JLabel("Capacidade:");
		lblLotacaoEspaco.setBounds(45, 40, 90, 20);

		JTextField txtNomeEspaco = new JTextField(obterNomeEspaco);
		txtNomeEspaco.setBounds(140, 20, 150, 20);
		JLabel txtLotacaoEspaco = new JLabel(obterLotacaoEspaco);
		txtLotacaoEspaco.setBounds(140, 40, 150, 20);

		JButton btnConfirma = new JButton("Confirma");
		btnConfirma.setBounds(70, 100, 90, 40);
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(180, 100, 90, 40);

		// Adicionando ação ao botão de confirma
		btnConfirma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nomeEspaco = txtNomeEspaco.getText();
				String LotacaoEspaco = txtLotacaoEspaco.getText();

				// Criar o objeto
				Acao a = new Acao();
				a.alterarEspaco(nomeEspaco, LotacaoEspaco, obterLinha);

				// Fechar a interface atual
				AlterarEspaco.dispose();

			}
		});

		AlterarEspaco.add(lblNomeEspaco);
		AlterarEspaco.add(lblLotacaoEspaco);
		AlterarEspaco.add(txtLotacaoEspaco);
		AlterarEspaco.add(txtNomeEspaco);

		AlterarEspaco.add(btnConfirma);
		AlterarEspaco.add(btnVoltar);

		AlterarEspaco.setVisible(true);

	}

}
