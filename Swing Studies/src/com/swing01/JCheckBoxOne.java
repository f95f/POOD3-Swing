package com.swing01;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckBoxOne {
	private JFrame frame;
	private JPanel panel;
	private JCheckBox checkBox;
	
	public JCheckBoxOne() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		panel = new JPanel();
		
		this.frame.setTitle("Aula 14");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		
		checkBox = new JCheckBox();
		checkBox.setText("Check Box");
		checkBox.setMnemonic(KeyEvent.VK_C);
		panel.add(checkBox);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
