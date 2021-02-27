package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladores.Acao;

public class AlterarPessoa {

	public AlterarPessoa(String obterNomePessoa, String obterSobrenomePessoa, int obterLinha) {

		JFrame AlterarPessoa = new JFrame("GESTÃO VERGUTZ");

		AlterarPessoa.setSize(350, 200);
		AlterarPessoa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AlterarPessoa.setLocationRelativeTo(null);
		AlterarPessoa.setLayout(null);

		JLabel lblNomePessoa = new JLabel("Nome:");
		lblNomePessoa.setBounds(45, 20, 90, 20);
		JLabel lblSobrenomePessoa = new JLabel("Sobrenome:");
		lblSobrenomePessoa.setBounds(45, 40, 90, 20);
		JLabel lblSalaPessoa = new JLabel("Nome da sala");
		lblSalaPessoa.setBounds(45, 60, 90, 20);

		JTextField txtNomePessoa = new JTextField(obterNomePessoa);
		txtNomePessoa.setBounds(140, 20, 150, 20);
		JTextField txtSobrenomePessoa = new JTextField(String.valueOf(obterSobrenomePessoa));
		txtSobrenomePessoa.setBounds(140, 40, 150, 20);
		JComboBox lblNomeSalaComboBox = new JComboBox<>();
		lblNomeSalaComboBox.setBounds(140, 60, 150, 20);

		JButton btnConfirma = new JButton("Confirma");
		btnConfirma.setBounds(70, 100, 90, 40);
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(180, 100, 90, 40);

		// Adicionando ação ao botão de confirma
		btnConfirma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nomePessoa = txtNomePessoa.getText();
				String SobrenomePessoa = txtSobrenomePessoa.getText();

				// Criar o objeto
				Acao a = new Acao();
				a.alterarPessoa(nomePessoa, SobrenomePessoa, obterLinha);

				// Fechar a interface atual
				AlterarPessoa.dispose();

			}
		});

		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Fechar a interface
				AlterarPessoa.dispose();

			}
		});

		AlterarPessoa.add(lblNomePessoa);
		AlterarPessoa.add(lblSobrenomePessoa);
		AlterarPessoa.add(txtNomePessoa);
		AlterarPessoa.add(txtSobrenomePessoa);

		AlterarPessoa.add(btnConfirma);
		AlterarPessoa.add(btnVoltar);

		AlterarPessoa.setVisible(true);

	}

}
