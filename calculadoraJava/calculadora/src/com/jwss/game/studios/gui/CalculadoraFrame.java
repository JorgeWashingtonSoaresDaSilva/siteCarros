package com.jwss.game.studios.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraFrame extends JFrame{
	

	private static final long serialVersionUID = 1L;
	private int contador = 0;
	public static String texto = "";
	
	private JTextField display;

	public CalculadoraFrame() {
		super("Calculadora para Denise");
		criarMenu();
		criaFormulario();
	}
	
	private void criarMenu() {
		JMenu menuSobre = new JMenu("Sobre");
		JMenuItem menuItemSobre = new JMenuItem("Sobre calculadora");
		menuSobre.add(menuItemSobre);
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		barra.add(menuSobre);
	}
	private void criaFormulario() {
		setLayout(new BorderLayout());
		// Cria o painel do Display da calculadora
		JPanel panelDisplay = new JPanel();
		panelDisplay.setLayout(new FlowLayout());
		// Cria area de texto do didplay com JTextField
		display = new JTextField(6);
		display.setFont(new Font("Arial", Font.BOLD, 40));
		display.setEditable(false);
		display.setText("0");
		display.setHorizontalAlignment(JTextField.RIGHT);
		
		// Adiciona o area de texto do display ja com alinhamento do texto a direita
		panelDisplay.add(display);
		
		JPanel panelTeclado = new JPanel();
		panelTeclado.setLayout(new FlowLayout());
		Tecla1 tecla1 = new Tecla1();
		Tecla2 tecla2 = new Tecla2();
		JButton botao1 = new JButton("   1   ");
		
		botao1.addActionListener(tecla1);
		
		JButton botao2 = new JButton("   2   ");
		botao2.addActionListener(tecla2);
		
		JButton botao3 = new JButton("   3   ");
		JButton botao4 = new JButton("   /   ");
		
		JButton botao5 = new JButton("   4   ");
		JButton botao6 = new JButton("   5   ");
		JButton botao7 = new JButton("   6   ");
		JButton botao8 = new JButton("   *   ");
		
		JButton botao9 = new JButton("   7   ");
		JButton botao10 = new JButton("   8   ");
		JButton botao11 = new JButton("   9   ");
		JButton botao12 = new JButton("   -   ");
		
		JButton botao13 = new JButton("   0   ");
		JButton botao14 = new JButton("   ,   ");
		JButton botao15 = new JButton("   %   ");
		JButton botao16 = new JButton("   +   ");
		JButton botao17 = new JButton("   AC  ");
		JButton botao18 = new JButton("   =   ");
		
		
		panelTeclado.add(botao1);
		panelTeclado.add(botao2);
		panelTeclado.add(botao3);
		panelTeclado.add(botao4);
		
		panelTeclado.add(botao5);
		panelTeclado.add(botao6);
		panelTeclado.add(botao7);
		panelTeclado.add(botao8);
		
		panelTeclado.add(botao9);
		panelTeclado.add(botao10);
		panelTeclado.add(botao11);
		panelTeclado.add(botao12);
		
		panelTeclado.add(botao13);
		panelTeclado.add(botao14);
		panelTeclado.add(botao15);
		panelTeclado.add(botao16);
		panelTeclado.add(botao17);
		panelTeclado.add(botao18);
		
		
		add(panelDisplay, BorderLayout.NORTH);
		//add(panelTeclado, BorderLayout.WEST);
		add(panelTeclado, FlowLayout.LEFT);
		
		
	}
	private class Tecla1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {
			
			contador++;
			if(contador == 1) {
				texto = "1";
			}else {
				texto = "1"+texto;
			}
			
			
			display.setText(texto);
			
			
		}
		
	}
	private class Tecla2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {
			
			contador++;
			if(contador == 2) {
				texto = "2";
			}else {
				texto = "2"+texto;
			}
			
			display.setText(texto);
			
			
			
		}
		
	}
	
	

}
