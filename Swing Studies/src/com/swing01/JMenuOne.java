package com.swing01;

import java.awt.CheckboxMenuItem;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class JMenuOne implements ActionListener  {
	public JFrame frame;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem novoMenuItem;
	private JMenuItem abrirMenuItem;
	private JMenuItem salvarMenuItem;
	private JMenuItem sairMenuItem;
	
	public JMenuOne() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		this.frame.setTitle("Aula 13");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600, 600);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		
		Font font = new Font("sans-serif", Font.PLAIN, 28);
		UIManager.put("Menu.font", font);
		UIManager.put("MenuItem.font", font);
		UIManager.put("CheckBoxMenuItem.font", font);
		UIManager.put("RadioButtonMenuItem.font", font);
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		novoMenuItem = new JMenuItem("Novo");
		abrirMenuItem = new JMenuItem("Abrir...");
		salvarMenuItem = new JMenuItem("Salvar");
		sairMenuItem = new JMenuItem("Sair");
		
		novoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		novoMenuItem.addActionListener(this);
		
		fileMenu.add(novoMenuItem);
		fileMenu.add(abrirMenuItem);
		fileMenu.add(salvarMenuItem);
		
		fileMenu.add(new JRadioButtonMenuItem("Radio"));
		fileMenu.add(new JCheckBoxMenuItem("Check"));
		fileMenu.add(new JMenu("Sub Menu"));
		
		fileMenu.addSeparator();
		fileMenu.add(sairMenuItem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JMenuItem) {
			JMenuItem item = (JMenuItem) e.getSource();
			String text = item.getText();
			System.out.println(" > " + text);
		}
		
	}

	
}
