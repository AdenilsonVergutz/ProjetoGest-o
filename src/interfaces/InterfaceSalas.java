package interfaces;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controladores.Acao;
import java.awt.Font;

public class InterfaceSalas {

	public InterfaceSalas() {

		JFrame InterfaceSalas = new JFrame("GESTÃO VERGUTZ");

		InterfaceSalas.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("P:\\Java Fundamentos\\06 - OO\\sistemaGestaoMercado\\src\\image\\icon_main.png"));
		InterfaceSalas.getContentPane().setBackground(Color.GRAY);

		URL caminhoDaImagem1 = InterfacePrincipal.class.getResource("/image/icon_pessoa.png");

		ImageIcon imagem1 = new ImageIcon(caminhoDaImagem1);

		URL caminhoDaImagem = InterfacePrincipal.class.getResource("/image/background.jpg");

		ImageIcon imagem = new ImageIcon(caminhoDaImagem);

		// JLabel
		JLabel exibirImagem = new JLabel();
		exibirImagem.setIcon(imagem);
		exibirImagem.setBounds(-200, -285, 784, 626);

		InterfaceSalas.setSize(600, 380);
		InterfaceSalas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InterfaceSalas.setLocationRelativeTo(null);
		InterfaceSalas.getContentPane().setLayout(null);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(32, 94, 100, 40);
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(32, 154, 100, 40);
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(32, 274, 100, 40);

		Acao a = new Acao();

		JTable tabelaSalas = new JTable(a.listarSalas());

		JScrollPane barraRolagem = new JScrollPane(tabelaSalas);
		barraRolagem.setBounds(166, 80, 388, 245);

		tabelaSalas.setModel(a.listarSalas());

		// Adicionando ação ao botão de cadastrar
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new CadastrarSalas();

				// Atualizar tabela
				tabelaSalas.setModel(a.listarSalas());

			}
		});

		btnAlterar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int obterLinha = tabelaSalas.getSelectedRow();
				String obterNomeSalas = tabelaSalas.getValueAt(obterLinha, 0).toString();
				double obterLotacaoSalas = Double.parseDouble(tabelaSalas.getValueAt(obterLinha, 1).toString());

				new AlterarSalas(obterNomeSalas, obterLotacaoSalas, obterLinha);

				tabelaSalas.setModel(a.listarSalas());

			}
		});

		// Adicionando ação ao botão de voltar
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new InterfacePrincipal();

				tabelaSalas.setModel(a.listarSalas());

				// Fechar a interface atual
				InterfaceSalas.dispose();

			}
		});

		InterfaceSalas.getContentPane().add(btnVoltar);
		InterfaceSalas.getContentPane().add(btnAlterar);
		InterfaceSalas.getContentPane().add(btnCadastrar);

		InterfaceSalas.getContentPane().add(barraRolagem);

		JLabel lblCadastreAltereOu = new JLabel("Cadastre, altere as Salas.");
		lblCadastreAltereOu.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblCadastreAltereOu.setForeground(Color.DARK_GRAY);
		lblCadastreAltereOu.setBackground(Color.WHITE);
		lblCadastreAltereOu.setBounds(183, 36, 350, 14);

		InterfaceSalas.getContentPane().add(lblCadastreAltereOu);

		// JLabel
		JLabel exibirImagem1 = new JLabel();
		exibirImagem1.setEnabled(false);
		exibirImagem1.setIcon(imagem1);
		exibirImagem1.setBounds(57, 21, 50, 50);

		InterfaceSalas.getContentPane().add(exibirImagem1);
		InterfaceSalas.getContentPane().add(exibirImagem);

		InterfaceSalas.setVisible(true);

		tabelaSalas.setModel(a.listarSalas());
	}

}
