package com.swing01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JPasswordOne  implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JPasswordField passField;
	private JButton button;
	
	public JPasswordOne(){
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel("Identifique-se:");
		textField = new JTextField(15);
		passField = new JPasswordField(15);
		button = new JButton("Entrar");
		
		this.frame.setTitle("Aula 12");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		
		button.addActionListener(this);

		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		label.setForeground(Color.LIGHT_GRAY);
		panel.setBackground(Color.DARK_GRAY);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		textField.setText("Usuário");
		passField.setText("Senha");
		passField.setEchoChar('|');
		
		panel.add(label); 
		panel.add(textField);
		panel.add(passField);
		panel.add(button);
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print(textField.getText());
		textField.setText(null);
		
		char[] pf= passField.getPassword();
		String password = new String(pf);
		System.out.println(password);
		
		passField.setText(null);
		
	}
}
