package com.swing01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTwo {
	
	private JFrame frame;
	
	public JFrameTwo() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();

		this.frame.setTitle("Teste 3");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);

		JPanel panel  = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		panel.setBackground(Color.CYAN);
		
		Button button = (Button) new Button("Button");
		panel.add((Button) button);
		
		Button button2 = new Button("Butão");
		button2.setSize(new Dimension(60, 60));
		panel.add(button2);
		
		frame.add(panel, BorderLayout.WEST);
		
		this.frame.setVisible(true);
		
	}
}
