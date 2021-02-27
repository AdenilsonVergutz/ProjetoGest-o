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

		InterfaceLogin.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\Projeto\\ProjetoGestao\\ProjetoGestao\\bin\\image\\icon_main.png"));
		InterfaceLogin.getContentPane().setBackground(Color.BLUE);

		URL caminhoDaImagem1 = InterfacePrincipal.class.getResource("/image/icon_main.png");

		new ImageIcon(caminhoDaImagem1);

		URL caminhoDaImagem = InterfacePrincipal.class.getResource("/image/background.jpg");

		ImageIcon imagem = new ImageIcon(caminhoDaImagem);

		// JLabel
		JLabel exibirImagem = new JLabel();
		exibirImagem.setIcon(imagem);
		exibirImagem.setBounds(-5, -200, 950, 800);

		InterfaceLogin.setSize(360, 420);
		InterfaceLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InterfaceLogin.setLocationRelativeTo(null);
		InterfaceLogin.getContentPane().setLayout(null);

		JLabel lblLogin = new JLabel("Usuario:");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblLogin.setBounds(42, 170, 90, 20);
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblSenha.setBounds(42, 195, 90, 20);

		JTextField txtLogin = new JTextField();
		txtLogin.setBounds(100, 170, 150, 20);
		JTextField txtSenha = new JTextField();
		txtSenha.setBounds(100, 195, 150, 20);

		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(115, 280, 110, 40);

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
		lblBemVindoAo.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblBemVindoAo.setBounds(125, 5, 145, 50);
		InterfaceLogin.getContentPane().add(lblBemVindoAo);
		InterfaceLogin.getContentPane().add(exibirImagem);

		JLabel lblSistemaDeGesto = new JLabel("Sistema de Gestão Vergutz.");
		lblSistemaDeGesto.setForeground(Color.BLACK);
		lblSistemaDeGesto.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblSistemaDeGesto.setBounds(80, 35, 213, 100);
		InterfaceLogin.getContentPane().add(lblSistemaDeGesto);

		JLabel lblFaaOLogin = new JLabel("Faça o login para utilizar o sistema.");
		lblFaaOLogin.setForeground(Color.BLACK);
		lblFaaOLogin.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblFaaOLogin.setBounds(67, 100, 225, 25);
		InterfaceLogin.getContentPane().add(lblFaaOLogin);
		InterfaceLogin.getContentPane().add(exibirImagem);

		InterfaceLogin.setVisible(true);

	}

}
