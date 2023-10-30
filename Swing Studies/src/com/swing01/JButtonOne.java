package com.swing01;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JButtonOne {
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
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
		
		button = createButton();
		panel.add(button);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	private JButton createButton() {
		
		JButton button = new JButton("Print");
		button.setFocusable(false);
		
		ImageIcon icon = new ImageIcon("icon.png");
		//button.setIcon(icon);
		button.setIconTextGap(10);
		button.setMnemonic(KeyEvent.VK_P);
		button.setToolTipText("Texto Texto texto");
		button.setFont(new Font("Arial", Font.PLAIN, 24));
		button.setMargin(new Insets(20, 30, 20, 30));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(" > Printing...");
				
			}
		});
		
		button.setEnabled(true);
		//button.doClick();
		
		//button.setVerticalTextPosition(SwingConstants.BOTTOM);
		//button.setHorizontalTextPosition(SwingConstants.CENTER);
		//button.setPreferredSize(new Dimension(100, 100));
		
		return button;
	}
}
