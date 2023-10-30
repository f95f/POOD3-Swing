package com.swing01;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameFive {
	private JFrame frame;
	private JPanel panel;
	public JFrameFive() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();

		this.frame.setTitle("Aula 4");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		
		this.panel = new JPanel(new GridLayout(4, 5, 10, 10));
		panel.setBackground(Color.YELLOW);
		
		for(int i = 0; i < 20; i++) {
			panel.add(new JButton(Integer.toString(i + 1)));
		}
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}