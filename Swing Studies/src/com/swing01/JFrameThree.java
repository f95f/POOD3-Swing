package com.swing01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameThree {
	private JFrame frame;
	
	public JFrameThree() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();

		this.frame.setTitle("Aula 4");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);

		frame.setLayout(new BorderLayout(15, 15));
		frame.add(new JButton("north"), BorderLayout.NORTH);
		frame.add(new JButton("west"), BorderLayout.WEST);
		frame.add(new JButton("east"), BorderLayout.EAST);
		frame.add(new JButton("south"), BorderLayout.SOUTH);
		frame.add(new JButton("center"), BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
}
