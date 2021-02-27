package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Font;

public class InterfacePrincipal {

	public InterfacePrincipal() {

		JFrame InterfacePrincipal = new JFrame("GESTÃO VERGUTZ");
		InterfacePrincipal.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("P:\\Java Fundamentos\\06 - OO\\sistemaGestaoMercado\\src\\image\\icon_main.png"));
		InterfacePrincipal.getContentPane().setBackground(Color.GRAY);

		URL caminhoDaImagem = InterfacePrincipal.class.getResource("/image/background.jpg");

		ImageIcon imagem = new ImageIcon(caminhoDaImagem);

		// JLabel
		JLabel exibirImagem = new JLabel();
		exibirImagem.setIcon(imagem);
		exibirImagem.setBounds(0, -165, 784, 626);

		InterfacePrincipal.setSize(800, 500);
		InterfacePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InterfacePrincipal.setLocationRelativeTo(null);
		InterfacePrincipal.getContentPane().setLayout(null);

		JLabel lblTexto = new JLabel(
				"Cadastre, altere ou exclua as informações relacionadas as pessoas, salas e espaços de café!");
		lblTexto.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblTexto.setBackground(Color.WHITE);
		lblTexto.setBounds(20, 20, 750, 20);

		JButton btnSalas = new JButton("Salas");
		btnSalas.setBackground(UIManager.getColor("Button.background"));
		btnSalas.setBounds(230, 130, 130, 60);
		JButton btnPessoas = new JButton("Pessoas");
		btnPessoas.setBackground(UIManager.getColor("Button.background"));
		btnPessoas.setBounds(430, 130, 130, 60);
		JButton btnEspacos = new JButton("Espaços");
		btnEspacos.setBackground(UIManager.getColor("Button.background"));
		btnEspacos.setBounds(230, 250, 130, 60);
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(UIManager.getColor("Button.background"));
		btnSair.setBounds(430, 250, 130, 60);

		// Adicionando ação ao botão Salas
		btnSalas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new InterfaceSalas();

				// Fechar interface atual
				InterfacePrincipal.dispose();

			}
		});

		btnPessoas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new InterfacePessoas();

				// Fechar interface atual
				InterfacePrincipal.dispose();

			}
		});

		btnEspacos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new InterfaceEspacos();

				// Fechar interface atual
				InterfacePrincipal.dispose();

			}
		});

		// Adicionando ação ao botão de sair
		btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new InterfaceLogin();

				// Fechar a interface atual
				InterfacePrincipal.dispose();

			}
		});

		InterfacePrincipal.getContentPane().add(lblTexto);

		InterfacePrincipal.getContentPane().add(btnSalas);
		InterfacePrincipal.getContentPane().add(btnPessoas);
		InterfacePrincipal.getContentPane().add(btnEspacos);
		InterfacePrincipal.getContentPane().add(btnSair);

		InterfacePrincipal.getContentPane().add(exibirImagem);

		InterfacePrincipal.setVisible(true);

	}

}
