package com.jwss.game.studio.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.jwss.game.studio.logica.OperacaoMatematicas;


public class calculadora extends OperacaoMatematicas{

	private JFrame frmCalculadora;
	private JTextField texConta;
	public static String operador = "",igual = " = ",texto,texto1,texto2,texto3 = "";
	private int contador;
	public static double n1,n2,resultado;
	public boolean desabilitado,result = false;
	public static OperacaoMatematicas opm = new OperacaoMatematicas();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 
		
		
		
		/* Set the Nimbus look and feel */
		// sem essas linha não ativa o tema do look and fell
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>
		
		// cria o formulario
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(Color.BLACK);
		frmCalculadora.setForeground(Color.BLACK);
		frmCalculadora.setBackground(Color.BLACK);
		frmCalculadora.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 17));
		frmCalculadora.setTitle("Calculadora ");
		frmCalculadora.setAutoRequestFocus(false);
		frmCalculadora.setBounds(10, 10, 371, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JPanel panelTeclado = new JPanel();
		panelTeclado.setBackground(Color.BLACK);
		panelTeclado.setBounds(12, 94, 353, 176);
		panelTeclado.setBorder(UIManager.getBorder("Button.border"));
		
		JButton btnAc = new JButton("AC");
		btnAc.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		btnAc.setForeground(Color.WHITE);
		btnAc.setBackground(Color.DARK_GRAY);
		btnAc.setBounds(250, 12, 97, 40);
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texConta.setText(opm.getTex());
				texto = opm.getTex();
				texto1 = opm.getTex1();
				texto2 = opm.getTex2();
				texto3 = opm.getTex3();
				contador = 0;
				
			}
		});
		
		JButton btnTecla7 = new JButton("7");
		btnTecla7.setBackground(Color.GRAY);
		btnTecla7.setForeground(Color.WHITE);
		btnTecla7.setBounds(0, 12, 60, 40);
		btnTecla7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = "7";
				}else  {
					texto += "7"; 
				}
				
				
				texConta.setText(texto);
			}
		});
		btnTecla7.setFont(new Font("Dialog", Font.BOLD, 18));
		frmCalculadora.getContentPane().add(panelTeclado);
		
		JButton btnTecla8 = new JButton("8");
		btnTecla8.setBackground(Color.GRAY);
		btnTecla8.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnTecla8.setForeground(Color.WHITE);
		btnTecla8.setBounds(62, 12, 60, 40);
		btnTecla8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = "8";
				}else  {
					texto += "8"; 
				}
				
				
				texConta.setText(texto);
			}
		});
		
		JButton btnTecla9 = new JButton("9");
		btnTecla9.setBackground(Color.GRAY);
		btnTecla9.setForeground(Color.WHITE);
		btnTecla9.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnTecla9.setBounds(124, 12, 60, 40);
		btnTecla9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = "9";
				}else  {
					texto += "9"; 
				}
				
				
				texConta.setText(texto);
			}
		});
		
		JButton btnTeclaDivisao = new JButton("/");
		btnTeclaDivisao.setForeground(Color.WHITE);
		btnTeclaDivisao.setBackground(Color.ORANGE);
		btnTeclaDivisao.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		btnTeclaDivisao.setBounds(187, 12, 60, 40);
		btnTeclaDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				texto1 = texConta.getText().replaceAll(",", ".");
					opm.setOperador("/");
					operador = opm.getOperador();
					contador = 0;
				
				
				
			}
		});
		
		JButton btnTecla4 = new JButton("4");
		btnTecla4.setBackground(Color.GRAY);
		btnTecla4.setForeground(Color.WHITE);
		btnTecla4.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnTecla4.setBounds(0, 54, 60, 40);
		btnTecla4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = "4";
				}else  {
					texto += "4"; 
				}
				
				
				texConta.setText(texto);
			}
		});
		
		JButton btnTecla5 = new JButton("5");
		btnTecla5.setBackground(Color.GRAY);
		btnTecla5.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnTecla5.setForeground(Color.WHITE);
		btnTecla5.setBounds(62, 54, 60, 40);
		btnTecla5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = "5";
				}else  {
					texto += "5"; 
				}
				
				
				texConta.setText(texto);
			}
		});
		
		JButton btnTecla6 = new JButton("6");
		btnTecla6.setBackground(Color.GRAY);
		btnTecla6.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnTecla6.setForeground(Color.WHITE);
		btnTecla6.setBounds(124, 54, 60, 40);
		btnTecla6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = "6";
				}else  {
					texto += "6"; 
				}
				
				
				texConta.setText(texto);
			}
		});
		
		JButton btnTeclaMultiplicacao = new JButton("*");
		btnTeclaMultiplicacao.setForeground(Color.WHITE);
		btnTeclaMultiplicacao.setBackground(Color.ORANGE);
		btnTeclaMultiplicacao.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		btnTeclaMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto1 = texConta.getText().replaceAll(",", ".");
				opm.setOperador("*");
				operador = opm.getOperador();
				contador = 0;
			}
		});
		btnTeclaMultiplicacao.setBounds(187, 54, 60, 40);
		
		JButton btnTecla1 = new JButton("1");
		btnTecla1.setBackground(Color.GRAY);
		btnTecla1.setForeground(Color.WHITE);
		btnTecla1.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnTecla1.setBounds(0, 96, 60, 40);
		btnTecla1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = "1";
				}else  {
					texto += "1"; 
				}
				
				texConta.setText(texto);
			}
		});
		
		JButton btnTecla2 = new JButton("2");
		btnTecla2.setBackground(Color.GRAY);
		btnTecla2.setForeground(Color.WHITE);
		btnTecla2.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnTecla2.setBounds(62, 96, 60, 40);
		btnTecla2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = "2";
				}else  {
					texto += "2"; 
				}
				
				texConta.setText(texto);
			
			}
		});
		
		JButton btnTecla3 = new JButton("3");
		btnTecla3.setBackground(Color.GRAY);
		btnTecla3.setForeground(Color.WHITE);
		btnTecla3.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnTecla3.setBounds(124, 96, 60, 40);
		btnTecla3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = "3";
				}else  {
					texto += "3"; 
				}
				
				
				texConta.setText(texto);
			}
		});
		
		JButton btnTeclaSubtracao = new JButton("-");
		btnTeclaSubtracao.setBackground(Color.ORANGE);
		btnTeclaSubtracao.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		btnTeclaSubtracao.setForeground(Color.WHITE);
		btnTeclaSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto1 = texConta.getText().replaceAll(",", ".");
				opm.setOperador("-");
				operador = opm.getOperador();
				contador = 0;
			}
		});
		btnTeclaSubtracao.setBounds(187, 96, 60, 40);
		
		JButton btnTecla0 = new JButton("0");
		btnTecla0.setBackground(Color.GRAY);
		btnTecla0.setForeground(Color.WHITE);
		btnTecla0.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnTecla0.setBounds(0, 138, 60, 40);
		btnTecla0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = "0";
				}else  {
					texto += "0"; 
				}
				
				
				texConta.setText(texto);
				
				
				
			}
		});
		
		JButton btnTeclaVigula = new JButton(",");
		btnTeclaVigula.setBackground(Color.ORANGE);
		btnTeclaVigula.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnTeclaVigula.setForeground(Color.WHITE);
		btnTeclaVigula.setBounds(62, 138, 60, 40);
		btnTeclaVigula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador ==0){
					contador++;
					texto = ",";
				}else  {
					texto += ","; 
				}
				
				
				texConta.setText(texto);
				
				
				
			}
		});
		
		JButton btnTeclaAdicao = new JButton("+");
		btnTeclaAdicao.setForeground(Color.WHITE);
		btnTeclaAdicao.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		btnTeclaAdicao.setBackground(Color.ORANGE);
		btnTeclaAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto1 = texConta.getText().replaceAll(",", ".");
				opm.setOperador("+");
				operador = opm.getOperador();
				contador = 0;
				
			}
		});
		btnTeclaAdicao.setBounds(124, 138, 60, 40);
		
		JButton btnTeclaIgual = new JButton("=");
		btnTeclaIgual.setForeground(Color.WHITE);
		btnTeclaIgual.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		btnTeclaIgual.setBackground(Color.DARK_GRAY);
		btnTeclaIgual.setBounds(250, 53, 97, 125);
		btnTeclaIgual.addActionListener(new ActionListener() {
			
			@SuppressWarnings({ "static-access" })
			public void actionPerformed(ActionEvent e) {
				if(texConta.getText() != "" && desabilitado == false) {
					if(opm.getOperador() == "/") {
						texto2 = texConta.getText().replaceAll(",", "."); 
						opm.setN1(Double.parseDouble(texto1));
						opm.setN2(Double.parseDouble(texto2));
						n1 = opm.getN1();
						n2 = opm.getN2();
						resultado =  opm.divisao(n1,n2);
						System.out.println("restos " +n1%n2);
						
						if(n1%n2 > 0) {
							texto3 = String.valueOf(resultado).format("%.2f", resultado);
						}else {
							texto3 = String.valueOf(resultado).format("%.0f", resultado);
						}
						
						result = true;
						texConta.setText(texto1+" "+operador+" "+texto2+ " = " +texto3);
						
					}
					if(opm.getOperador() == "+") {
						texto2 = texConta.getText().replaceAll(",", "."); 
						opm.setN1(Double.parseDouble(texto1));
						opm.setN2(Double.parseDouble(texto2));
						n1 = opm.getN1();
						n2 = opm.getN2();
						resultado =  opm.adisao(n1, n2);
						System.out.println("restos " +n1%n2);
						
						if(n1%n2 > 0) {
							texto3 = String.valueOf(resultado).format("%.2f", resultado);
						}else {
							texto3 = String.valueOf(resultado).format("%.0f", resultado);
						}
						result = true;
						texConta.setText(texto1+" "+operador+" "+texto2+ " = " +texto3);
						
					}
					if(opm.getOperador() == "-") {
						texto2 = texConta.getText().replaceAll(",", "."); 
						opm.setN1(Double.parseDouble(texto1));
						opm.setN2(Double.parseDouble(texto2));
						n1 = opm.getN1();
						n2 = opm.getN2();
						resultado =  opm.subitracao(n1, n2);
						System.out.println("restos " +n1%n2);
						
						if(n1%n2 > 0) {
							texto3 = String.valueOf(resultado).format("%.2f", resultado);
						}else {
							texto3 = String.valueOf(resultado).format("%.0f", resultado);
						}
						result = true;
						texConta.setText(texto1+" "+operador+" "+texto2+ " = " +texto3);
						
					}
					if(opm.getOperador() == "*") {
						texto2 = texConta.getText().replaceAll(",", "."); 
						opm.setN1(Double.parseDouble(texto1));
						opm.setN2(Double.parseDouble(texto2));
						n1 = opm.getN1();
						n2 = opm.getN2();
						resultado =  opm.multiplicacao(n1, n2);
						System.out.println("restos " +n1%n2);
						
						if(n1%n2 > 0) {
							texto3 = String.valueOf(resultado).format("%.2f", resultado);
						}else {
							texto3 = String.valueOf(resultado).format("%.0f", resultado);
						}
						result = true;
						texConta.setText(texto1+" "+operador+" "+texto2+ " = " +texto3);
						
					}
					if(opm.getOperador() == "%") {
						texto2 = texConta.getText().replaceAll(",", "."); 
						opm.setN1(Double.parseDouble(texto1));
						opm.setN2(Double.parseDouble(texto2));
						n1 = opm.getN1();
						n2 = opm.getN2();
						resultado =  opm.porcentagem(n1, n2);
						System.out.println("restos " +n1%n2);
						
						if(n1%n2 > 0) {
							texto3 = String.valueOf(resultado).format("%.2f", resultado);
						}else {
							texto3 = String.valueOf(resultado).format("%.0f", resultado);
						}
						result = true;
						texConta.setText(texto1+" "+operador+" "+texto2+ " = " +texto3);
					}
					
					if(result == true ) {
							desabilitado = true;
					}
					if(desabilitado == true) {
						result = false;
							if(result == false) 
							{
								texto = opm.getTex();
								texto1 = opm.getTex1();
								texto2 = opm.getTex2();
								texto3 = opm.getTex3();
								contador = 0;
								desabilitado = false;
								texto3 = texConta.getText();
							
							}if(desabilitado == false && result == false) {
								texConta.setText(texto3);
							}
							
					}
					
					
					
					
				}
				
				
				
				System.out.println(result+"\n"+desabilitado);
					
				
			
			}
			
		});
		panelTeclado.setLayout(null);
		panelTeclado.add(btnAc);
		panelTeclado.add(btnTecla7);
		panelTeclado.add(btnTecla9);
		panelTeclado.add(btnTeclaDivisao);
		panelTeclado.add(btnTecla8);
		panelTeclado.add(btnTecla5);
		panelTeclado.add(btnTecla4);
		panelTeclado.add(btnTeclaMultiplicacao);
		panelTeclado.add(btnTecla6);
		panelTeclado.add(btnTecla1);
		panelTeclado.add(btnTecla2);
		panelTeclado.add(btnTeclaSubtracao);
		panelTeclado.add(btnTecla3);
		panelTeclado.add(btnTeclaVigula);
		panelTeclado.add(btnTecla0);
		panelTeclado.add(btnTeclaIgual);
		panelTeclado.add(btnTeclaAdicao);
		
		JButton btnTeclaPorcentagem = new JButton("%");
		btnTeclaPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				texto1 = texConta.getText().replaceAll(",", ".");
				opm.setOperador("%");
				operador = opm.getOperador();
				contador = 0;
			}
		});
		
		btnTeclaPorcentagem.setForeground(Color.WHITE);
		btnTeclaPorcentagem.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
		btnTeclaPorcentagem.setBackground(Color.ORANGE);
		btnTeclaPorcentagem.setBounds(187, 137, 60, 40);
		panelTeclado.add(btnTeclaPorcentagem);
		
		texConta = new JTextField();
		texConta.setEditable(false);
		texConta.setBackground(Color.BLACK);
		texConta.setForeground(Color.WHITE);
		texConta.setHorizontalAlignment(SwingConstants.LEFT);
		texConta.setFont(new Font("Dialog", Font.BOLD, 20));
		texConta.setBounds(6, 6, 353, 88);
		frmCalculadora.getContentPane().add(texConta);
		texConta.setColumns(10);
	}
}
