package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controladores.Acao;
import controladores.Salas;

public class CadastrarPessoa {

	public CadastrarPessoa() {

		JDialog CadastrarPessoa = new JDialog();

		CadastrarPessoa.setSize(350, 200);
		CadastrarPessoa.setModal(true);
		CadastrarPessoa.setLocationRelativeTo(null);
		CadastrarPessoa.setLayout(null);

		JLabel lblNomePessoa = new JLabel("Nome:");
		lblNomePessoa.setBounds(45, 20, 90, 20);
		JLabel lblSobrenomePessoa = new JLabel("Sobrenome:");
		lblSobrenomePessoa.setBounds(45, 40, 90, 20);
		JLabel lblSalaPessoa = new JLabel("Nome da sala");
		lblSalaPessoa.setBounds(45, 60, 90, 20);

		JTextField txtNomePessoa = new JTextField();
		txtNomePessoa.setBounds(140, 20, 150, 20);
		JTextField txtSobrenomePessoa = new JTextField();
		txtSobrenomePessoa.setBounds(140, 40, 150, 20);
		JComboBox lblNomeSalaComboBox = new JComboBox<>();
		lblNomeSalaComboBox.setBounds(140, 60, 150, 20);

		for (int indice = 0; indice < Salas.dados.size(); indice++) {

			lblNomeSalaComboBox.addItem(Salas.dados.get(indice).getNomeSala());
		}

		JButton btnConfirma = new JButton("Confirma");
		btnConfirma.setBounds(70, 100, 90, 40);
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(180, 100, 90, 40);

		Acao a = new Acao();
		btnConfirma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nomePessoa = txtNomePessoa.getText();
				String SobrenomePessoa = txtSobrenomePessoa.getText();
				String NomeSala = lblNomeSalaComboBox.getSelectedItem().toString();

				a.CadastrarPessoa(nomePessoa, SobrenomePessoa, NomeSala);

				// Fechar a interface atual
				CadastrarPessoa.dispose();

			}
		});
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Fechar a interface atual
				CadastrarPessoa.dispose();

			}
		});

		CadastrarPessoa.add(lblNomePessoa);
		CadastrarPessoa.add(lblSobrenomePessoa);
		CadastrarPessoa.add(lblSalaPessoa);
		CadastrarPessoa.add(txtNomePessoa);
		CadastrarPessoa.add(txtSobrenomePessoa);
		CadastrarPessoa.add(lblNomeSalaComboBox);
		CadastrarPessoa.add(btnConfirma);
		CadastrarPessoa.add(btnVoltar);

		CadastrarPessoa.setVisible(true);

	}

}
