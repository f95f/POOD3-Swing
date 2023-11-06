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
import javax.swing.JTextField;

public class NimbusOne implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JButton button;
	
	public NimbusOne(){
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel("Enter Your Name:");
		textField = new JTextField(15);
		button = new JButton("Save");
		
		this.frame.setTitle("Aula 10");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		
		button.addActionListener(this);
		
		label.setForeground(Color.LIGHT_GRAY);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		panel.add(label); 
		panel.add(textField);
		panel.add(button);
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print(textField.getText());
		textField.setText(null);
	}
}
