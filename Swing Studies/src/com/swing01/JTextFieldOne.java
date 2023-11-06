package com.swing01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldOne {

	public JFrame frame;
	public JPanel panel;
	public JTextField textField;
	public JLabel label;
	
	public JTextFieldOne() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		
		this.frame.setTitle("Aula 9");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		textField = createTextField();
		
		frame.add(label); 
		panel.add(textField);
		frame.add(panel, BorderLayout.NORTH);
		frame.setVisible(true);
	}
	
	private JTextField createTextField() {
	
		//Set font, font size, foregroud, background color etc.
		JTextField textField = new JTextField(30);
		textField.setToolTipText("Enter some sht");
		textField.setMargin(new Insets(8, 12, 8, 12));
		
		textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textField.getText());
			}
		});
		return textField;
	}
	
}
