package com.jwss.game.studio.logica;

public class OperacaoMatematicas {
	private double num1=10;
	private double num2 = 2;
	private String operador, texto,texto1,texto2,texto3 = "";
	
	//seters
	public double setN1(double n1){
	 return num1 = n1;
	}
	public double setN2(double n2){
		 
		 return num2 = n2;
		
	}
	public String setOperador(String opr){
		return operador = opr;
	}
	public String setTex(String tex){
		return texto = tex;
	}
	public String setTex1(String tex1){
		return texto1 = tex1;
	}
	public String setTex2(String tex2){
		return texto2 = tex2;
	}
	public String setTex3(String tex3){
		return texto3 = tex3;
	}
	// geters
	public double getN1() {
		return num1 ;
	}
	public double getN2() {
		return num2 ;
	}
	public String getOperador(){
		return operador;
	}
	public String getTex(){
		return texto;
	}
	public String getTex1(){
		return texto1;
	}
	public String getTex2(){
		return texto2;
	}
	public String getTex3(){
		return texto3;
	}
	
	// funções
	
	public double divisao(double n1, double n2) {
		double num1 = n1;
		double num2 = n2;
		
		return  num1 / num2;
	}
	public double adisao(double n1, double n2) {
		double num1 = n1;
		double num2 = n2;
		
		return  num1 + num2;
	}
	public double subitracao(double n1, double n2) {
		double num1 = n1;
		double num2 = n2;
		
		return  num1 - num2;
	}
	public double multiplicacao(double n1, double n2) {
		double num1 = n1;
		double num2 = n2;
		
		return  num1 * num2;
	}
	public double porcentagem(double n1 , double n2) {
		double num1 = n1;
		double num2 = n2;
		
		return  num1 * num2 / 100;
	}
	

}
