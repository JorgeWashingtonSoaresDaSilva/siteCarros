package com.jwss.game.studios.logica;

import javax.swing.JFrame;

import com.jwss.game.studios.gui.CalculadoraFrame;

public class Calculadora {
	public static int largura = 300;
	public static int altura = 280;

	public static void calculadora() {
		CalculadoraFrame caculadora = new CalculadoraFrame();
		
		caculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		caculadora.setSize(largura, altura);
		caculadora.setVisible(true);
		
		
	}
	
}
