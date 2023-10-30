package com.swing01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameFour {
	private JFrame frame;
	private JPanel panel;
	public JFrameFour() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();

		this.frame.setTitle("Aula 5");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
		panel.setBackground(Color.MAGENTA);
		
		for(int i = 0; i< 5; i++) {
			JButton button = new JButton(Integer.toString(i));
			panel.add(button);
		}
		
		frame.add(panel, BorderLayout.CENTER);
		this.frame.setVisible(true);
	}

}