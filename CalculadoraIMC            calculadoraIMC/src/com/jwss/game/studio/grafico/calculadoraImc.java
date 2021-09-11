package com.jwss.game.studio.grafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class calculadoraImc {

	private JFrame frmCalculadoraDeImc;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// lookfiel do nimbus
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
           System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		
		// Cria o formulario
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadoraImc window = new calculadoraImc();
					window.frmCalculadoraDeImc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * metodo construtor 
	 */
	public calculadoraImc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDeImc = new JFrame();
		frmCalculadoraDeImc.setBackground(new Color(0, 0, 139));
		frmCalculadoraDeImc.setTitle("Calculadora de IMC");
		frmCalculadoraDeImc.getContentPane().setBackground(new Color(19, 59, 92));
		frmCalculadoraDeImc.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(6, 36, 100, 15);
		frmCalculadoraDeImc.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(78, 30, 122, 27);
		frmCalculadoraDeImc.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(100, 69, 100, 27);
		frmCalculadoraDeImc.getContentPane().add(btnNewButton);
		frmCalculadoraDeImc.setBounds(100, 100, 450, 300);
		frmCalculadoraDeImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
