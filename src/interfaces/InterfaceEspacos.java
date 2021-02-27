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

public class InterfaceEspacos {

	public InterfaceEspacos() {

		JFrame InterfaceEspacos = new JFrame("GESTÃO  VERGUTZ");

		InterfaceEspacos.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("P:\\Java Fundamentos\\06 - OO\\sistemaGestaoMercado\\src\\image\\icon_main.png"));
		InterfaceEspacos.getContentPane().setBackground(Color.GRAY);

		URL caminhoDaImagem1 = InterfacePrincipal.class.getResource("/image/icon_work.png");

		ImageIcon imagem1 = new ImageIcon(caminhoDaImagem1);

		URL caminhoDaImagem = InterfacePrincipal.class.getResource("/image/background.jpg");

		ImageIcon imagem = new ImageIcon(caminhoDaImagem);

		InterfaceEspacos.setSize(600, 380);
		InterfaceEspacos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InterfaceEspacos.setLocationRelativeTo(null);
		InterfaceEspacos.getContentPane().setLayout(null);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(32, 94, 100, 40);
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(32, 154, 100, 40);
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(32, 274, 100, 40);

		Acao a = new Acao();

		JTable tabelaEspacos = new JTable(a.listarEspacos());

		JScrollPane barraRolagem = new JScrollPane(tabelaEspacos);
		barraRolagem.setBounds(166, 80, 388, 245);

		// Adicionando ação ao botão de cadastrar
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new CadastrarEspaco();

				// Atualizar tabela
				tabelaEspacos.setModel(a.listarEspacos());

			}
		});

		btnAlterar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int obterLinha = tabelaEspacos.getSelectedRow();
				String obterNomeEspaco = tabelaEspacos.getValueAt(obterLinha, 0).toString();
				String obterLotacaoEspaco = tabelaEspacos.getValueAt(obterLinha, 1).toString();

				new AlterarEspacos(obterNomeEspaco, obterLotacaoEspaco, obterLinha);

			}
		});

		// Adicionando ação ao botão de voltar
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new InterfacePrincipal();

				// Fechar a interface atual
				InterfaceEspacos.dispose();

			}
		});

		InterfaceEspacos.getContentPane().add(btnVoltar);
		InterfaceEspacos.getContentPane().add(btnAlterar);
		InterfaceEspacos.getContentPane().add(btnCadastrar);
		InterfaceEspacos.getContentPane().add(barraRolagem);

		// JLabel
		JLabel exibirImagem1 = new JLabel();
		exibirImagem1.setEnabled(false);
		exibirImagem1.setIcon(imagem1);
		exibirImagem1.setBounds(57, 21, 50, 50);
		InterfaceEspacos.getContentPane().add(exibirImagem1);

		JLabel label = new JLabel("Cadastre, altere ou exclua espaço.");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("SansSerif", Font.BOLD, 11));
		label.setBackground(Color.WHITE);
		label.setBounds(183, 36, 350, 14);
		InterfaceEspacos.getContentPane().add(label);

		// JLabel
		JLabel exibirImagem = new JLabel();
		exibirImagem.setIcon(imagem);
		exibirImagem.setBounds(-200, -285, 784, 626);

		InterfaceEspacos.getContentPane().add(exibirImagem);

		InterfaceEspacos.setVisible(true);

	}
}
