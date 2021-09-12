package com.jwss.game.studio.logica;

public class operacoImc {

	private double massaKg;
	private double alturaM;
	private double imc;
	public double getMassaKg() {
		return massaKg;
	}
	public void setMassaKg(double massaKg) {
		this.massaKg = massaKg;
	}
	public double getAlturaM() {
		return alturaM;
	}
	public void setAlturaM(double alturaM) {
		this.alturaM = alturaM;
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public double calcImc(double massaKg,double alturaM) {
		this.massaKg = massaKg;
		this.alturaM = alturaM;
		
		return imc = massaKg / (alturaM* alturaM); 
	}
}
