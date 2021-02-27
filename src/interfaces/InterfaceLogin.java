package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class InterfaceLogin {

	public InterfaceLogin() {

		JFrame InterfaceLogin = new JFrame("GESTÃO VERGUTZ");

		InterfaceLogin.setIconImage(
				Toolkit.getDefaultToolkit().getImage("E:\\VISUAL CODE\\ProjetoGestao\\image\\icon_main.png"));
		InterfaceLogin.getContentPane().setBackground(Color.GRAY);

		URL caminhoDaImagem1 = InterfacePrincipal.class.getResource("/image/icon_main.png");

		new ImageIcon(caminhoDaImagem1);

		URL caminhoDaImagem = InterfacePrincipal.class.getResource("/image/background.jpg");

		ImageIcon imagem = new ImageIcon(caminhoDaImagem);

		// JLabel
		JLabel exibirImagem = new JLabel();
		exibirImagem.setIcon(imagem);
		exibirImagem.setBounds(-430, -405, 795, 725);

		InterfaceLogin.setSize(380, 320);
		InterfaceLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InterfaceLogin.setLocationRelativeTo(null);
		InterfaceLogin.getContentPane().setLayout(null);

		JLabel lblLogin = new JLabel("Usuario:");
		lblLogin.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblLogin.setBounds(68, 140, 90, 20);
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblSenha.setBounds(68, 165, 90, 20);

		JTextField txtLogin = new JTextField();
		txtLogin.setBounds(122, 140, 150, 20);
		JTextField txtSenha = new JTextField();
		txtSenha.setBounds(122, 165, 150, 20);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(130, 210, 110, 40);

		// Adicionando ação ao botão do login
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String login = txtLogin.getText();
				String senha = txtSenha.getText();

				// Validando o login do usuáario
				if ((login.equals("gerente")) && (senha.equals("g123"))) {

					new InterfacePrincipal();

					// Fechar a interface de login
					InterfaceLogin.dispose();

				} else {
					JOptionPane.showMessageDialog(null, "Usuário e/ou Senha informados são invalidos!");
				}

			}
		});

		InterfaceLogin.getContentPane().add(lblLogin);
		InterfaceLogin.getContentPane().add(lblSenha);

		InterfaceLogin.getContentPane().add(txtLogin);
		InterfaceLogin.getContentPane().add(txtSenha);

		InterfaceLogin.getContentPane().add(btnLogin);

		JLabel lblBemVindoAo = new JLabel("Bem vindo!");
		lblBemVindoAo.setForeground(Color.BLACK);
		lblBemVindoAo.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblBemVindoAo.setBounds(155, 5, 145, 50);
		InterfaceLogin.getContentPane().add(lblBemVindoAo);
		InterfaceLogin.getContentPane().add(exibirImagem);

		JLabel lblSistemaDeGesto = new JLabel("Sistema de Gestão Vergutz.");
		lblSistemaDeGesto.setForeground(Color.GRAY);
		lblSistemaDeGesto.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblSistemaDeGesto.setBounds(100, 35, 213, 100);
		InterfaceLogin.getContentPane().add(lblSistemaDeGesto);

		JLabel lblFaaOLogin = new JLabel("Faça o login para utilizar o sistema.");
		lblFaaOLogin.setForeground(Color.GRAY);
		lblFaaOLogin.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblFaaOLogin.setBounds(80, 100, 225, 25);
		InterfaceLogin.getContentPane().add(lblFaaOLogin);
		InterfaceLogin.getContentPane().add(exibirImagem);

		InterfaceLogin.setVisible(true);

	}

}
