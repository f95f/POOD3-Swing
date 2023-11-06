package com.swing01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JLabelOne {
	public JFrame frame;
	public JPanel panel;
	public JButton button = new JButton(" Sla kk");
	
	public JLabelOne() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		panel = new JPanel();
		
		this.frame.setTitle("Aula 8");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		panel.add(createLabel());
		frame.add(button, BorderLayout.SOUTH);
		frame.add(panel, BorderLayout.NORTH);
		frame.setVisible(true);
	}
	
	private JLabel createLabel() {

		JLabel label = new JLabel("Texto");
		JLabel texto = new JLabel();
		
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("Arial", Font.BOLD, 42));
		
		texto.setForeground(Color.DARK_GRAY);
		texto.setFont(new Font("Arial", Font.PLAIN,  24));
		
		ImageIcon labelIcon = new ImageIcon("logo.png");	
		
		label.setIcon(labelIcon);
		label.setIconTextGap(20);

		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				texto.setText("<html><h1> KKKKKKKKK </h1><p style='outline: 1px solid red; color: #881166, text-align: center'> sla man</p><input type='password' placeholder:'kakakaak' style='padding:20px'></html>");
				}
		});
		
		frame.add(texto);
		return label;
	}
}