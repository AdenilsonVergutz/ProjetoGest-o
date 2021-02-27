package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import interfaces.CadastrarPessoa;
import controladores.Acao;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class InterfacePessoas {

	public InterfacePessoas() {

		JFrame InterfacePessoas = new JFrame("GESTÃO VERGUTZ");

		InterfacePessoas.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("P:\\Java Fundamentos\\06 - OO\\sistemaGestaoMercado\\src\\image\\icon_main.png"));
		InterfacePessoas.getContentPane().setBackground(Color.GRAY);

		URL caminhoDaImagem1 = InterfacePrincipal.class.getResource("/image/icon_person.png");

		ImageIcon imagem1 = new ImageIcon(caminhoDaImagem1);

		URL caminhoDaImagem = InterfacePrincipal.class.getResource("/image/background.jpg");

		ImageIcon imagem = new ImageIcon(caminhoDaImagem);

		// JLabel
		JLabel exibirImagem = new JLabel();
		exibirImagem.setIcon(imagem);
		exibirImagem.setBounds(-200, -285, 784, 626);

		InterfacePessoas.setSize(600, 380);
		InterfacePessoas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InterfacePessoas.setLocationRelativeTo(null);
		InterfacePessoas.getContentPane().setLayout(null);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(32, 94, 100, 40);
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(32, 154, 100, 40);
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(32, 274, 100, 40);

		Acao a = new Acao();

		JTable tabelaPessoas = new JTable(a.listarPessoa());

		JScrollPane barraRolagem = new JScrollPane(tabelaPessoas);
		barraRolagem.setBounds(166, 80, 388, 245);

		// Adicionando ação ao botão de cadastrar
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new CadastrarPessoa();

				// Atualizar tabela
				tabelaPessoas.setModel(a.listarPessoa());

			}
		});

		btnAlterar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int obterLinha = tabelaPessoas.getSelectedRow();
				String obterNomePessoa = tabelaPessoas.getValueAt(obterLinha, 0).toString();
				String obterSobrenomePessoa = tabelaPessoas.getValueAt(obterLinha, 1).toString();

				new AlterarPessoa(obterNomePessoa, obterSobrenomePessoa, obterLinha);
			}

		});

		// Adicionando ação ao botão de voltar
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new InterfacePrincipal();

				// Fechar a interface atual
				InterfacePessoas.dispose();

			}
		});

		InterfacePessoas.getContentPane().add(btnVoltar);
		InterfacePessoas.getContentPane().add(btnAlterar);
		InterfacePessoas.getContentPane().add(btnCadastrar);

		InterfacePessoas.getContentPane().add(barraRolagem);

		// JLabel
		JLabel exibirImagem1 = new JLabel();
		exibirImagem1.setEnabled(false);
		exibirImagem1.setIcon(imagem1);
		exibirImagem1.setBounds(57, 21, 50, 50);

		InterfacePessoas.getContentPane().add(exibirImagem1);

		JLabel lblCadastreAltereOu = new JLabel("Cadastre, altere os itens da sua relação de Pessoas.");
		lblCadastreAltereOu.setForeground(Color.DARK_GRAY);
		lblCadastreAltereOu.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblCadastreAltereOu.setBackground(Color.WHITE);
		lblCadastreAltereOu.setBounds(183, 36, 350, 14);
		InterfacePessoas.getContentPane().add(lblCadastreAltereOu);
		InterfacePessoas.getContentPane().add(exibirImagem);

		InterfacePessoas.setVisible(true);

	}

}
