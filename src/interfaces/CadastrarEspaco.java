package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controladores.Acao;

public class CadastrarEspaco {

	public CadastrarEspaco() {

		JDialog CadastrarEspaco = new JDialog();

		CadastrarEspaco.setSize(350, 200);
		CadastrarEspaco.setModal(true);
		CadastrarEspaco.setLocationRelativeTo(null);
		CadastrarEspaco.setLayout(null);

		JLabel lblNomeEspaco = new JLabel("Nome:");
		lblNomeEspaco.setBounds(45, 20, 90, 20);
		JLabel lblEspacoLotacao = new JLabel("Lotação:");
		lblEspacoLotacao.setBounds(45, 40, 90, 20);

		JTextField txtNomeEspaco = new JTextField();
		txtNomeEspaco.setBounds(140, 20, 150, 20);
		JTextField txtEspacoLotacao = new JTextField();
		txtEspacoLotacao.setBounds(140, 40, 150, 20);

		JButton btnConfirma = new JButton("Confirma");
		btnConfirma.setBounds(70, 100, 90, 40);
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(180, 100, 90, 40);

		Acao a = new Acao();

		// Adicionando açao ao botão de confirma
		btnConfirma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String NomeEspaco = txtNomeEspaco.getText();
				int EspacoLotacao = Integer.parseInt(txtEspacoLotacao.getText());

				if ((NomeEspaco.equals("")) || (EspacoLotacao == 0)) {
					JOptionPane.showMessageDialog(null, "Por favor, preencha corretamente os campos!");

					new CadastrarEspaco();
				} else {

					// Criar o objeto
					a.CadastrarEspacos(NomeEspaco, EspacoLotacao);

					// Fechar a interface atual
					CadastrarEspaco.dispose();

				}

			}
		});

		// Adicionando ação ao botão voltar
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Fechar a interface atual
				CadastrarEspaco.dispose();

			}
		});

		CadastrarEspaco.add(lblNomeEspaco);
		CadastrarEspaco.add(lblEspacoLotacao);

		CadastrarEspaco.add(txtNomeEspaco);
		CadastrarEspaco.add(txtEspacoLotacao);

		CadastrarEspaco.add(btnConfirma);
		CadastrarEspaco.add(btnVoltar);

		CadastrarEspaco.setVisible(true);

	}

}
