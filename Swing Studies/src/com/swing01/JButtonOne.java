package com.swing01;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonOne {
	private JFrame frame;
	private JPanel panel;
	
	public JButtonOne() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		panel = new JPanel();
		
		this.frame.setTitle("Aula 7");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		
		
	}
}
