package com.jwss.game.studio.gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.jwss.game.studio.logica.operacoImc;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.util.Locale;

public class calculadoraImc extends operacoImc{

	private JFrame frmCalculadoraDeImc;
	private JTextField textMassa;
	private JTextField textAltura;
	private JTextArea textImc;
	public double imcResult;
	public String resultado;
	operacoImc imcl = new operacoImc();

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
		frmCalculadoraDeImc.getContentPane().setBackground(new Color(0, 0, 128));
		frmCalculadoraDeImc.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Massa (Kg ) :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Gargi", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(49, 107, 137, 39);
		frmCalculadoraDeImc.getContentPane().add(lblNewLabel);
		
		textMassa = new JTextField();
		textMassa.setForeground(Color.WHITE);
		textMassa.setBackground(new Color(0, 0, 139));
		textMassa.setFont(new Font("Gargi", Font.BOLD, 18));
		textMassa.setBounds(170, 106, 137, 39);
		frmCalculadoraDeImc.getContentPane().add(textMassa);
		textMassa.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imcl.setAlturaM(Double.parseDouble(textAltura.getText().replace(",", ".")));
				imcl.setMassaKg(Double.parseDouble(textMassa.getText().replace(",", ".")));
				imcl.setImc(imcl.calcImc( imcl.getMassaKg(), imcl.getAlturaM()));
				imcResult = imcl.getImc();
				String.valueOf(imcResult);
				resultado = String.format("%.2f",imcResult);
				if(imcResult <17) {
					textImc.setText(resultado.replace(",", ".")+"  Muito Abaixo do Peso !!") ;
				}else {
					if(imcResult >= 17 & imcResult <= 18.5) {
						textImc.setText(resultado.replace(",", ".")+"  Abaixo do Peso !!") ;
					}else {
						if(imcResult >= 18.5 & imcResult < 25) {
							textImc.setText(resultado.replace(",", ".")+"  Peso Ideal") ;
							
						}else {
							if(imcResult >= 25 & imcResult < 30) {
								textImc.setText(resultado.replace(",", ".")+"  Sobrepeso !!") ;
							}else {
								if(imcResult >= 30 & imcResult < 35) {
									textImc.setText(resultado.replace(",", ".")+"  Obesidade!!!") ;
								}else {
									if(imcResult >= 35 & imcResult < 40) {
										textImc.setText(resultado.replace(",", ".")+"  Obesidade Severa !!!") ;
									}else {
										textImc.setText(resultado.replace(",", ".")+"  Obesidade Morbida !!!!!") ;
									}
								}
							}
						}
					}
				}
				
				
			}
		});
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setBackground(new Color(0, 0, 128));
		btnCalcular.setFont(new Font("Gargi", Font.BOLD, 18));
		btnCalcular.setBounds(170, 210, 137, 39);
		frmCalculadoraDeImc.getContentPane().add(btnCalcular);
		
		JLabel lblAlturamt = new JLabel("Altura (Mt ) :");
		lblAlturamt.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlturamt.setForeground(Color.WHITE);
		lblAlturamt.setFont(new Font("Gargi", Font.BOLD, 18));
		lblAlturamt.setBounds(49, 159, 127, 39);
		frmCalculadoraDeImc.getContentPane().add(lblAlturamt);
		
		textAltura = new JTextField();
		textAltura.setForeground(Color.WHITE);
		textAltura.setFont(new Font("Gargi", Font.BOLD, 18));
		textAltura.setColumns(10);
		textAltura.setBackground(new Color(0, 0, 139));
		textAltura.setBounds(170, 158, 137, 39);
		frmCalculadoraDeImc.getContentPane().add(textAltura);
		
		JLabel lblImc = new JLabel("IMC :");
		lblImc.setBackground(new Color(0, 102, 102));
		lblImc.setHorizontalAlignment(SwingConstants.LEFT);
		lblImc.setForeground(Color.WHITE);
		lblImc.setFont(new Font("Gargi", Font.BOLD, 18));
		lblImc.setBounds(6, -7, 47, 70);
		frmCalculadoraDeImc.getContentPane().add(lblImc);
		
		textImc = new JTextArea();
		textImc.setLocale(new Locale("pt", "BR"));
		textImc.setRows(2);
		textImc.setEditable(false);
		textImc.setForeground(Color.WHITE);
		textImc.setFont(new Font("Gargi", Font.BOLD, 18));
		textImc.setColumns(10);
		textImc.setBackground(new Color(0, 0, 139));
		textImc.setBounds(49, 6, 389, 89);
		frmCalculadoraDeImc.getContentPane().add(textImc);
		frmCalculadoraDeImc.setBounds(100, 100, 450, 300);
		frmCalculadoraDeImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
