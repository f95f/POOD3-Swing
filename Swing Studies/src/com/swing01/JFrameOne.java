package com.swing01;

import javax.swing.JFrame;

public class JFrameOne extends JFrame{

	public JFrameOne() {
		initialize();
	}
	private void initialize() {
		setTitle("Teste 2");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(200, 2000);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}
}
