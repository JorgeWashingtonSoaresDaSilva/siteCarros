package entities;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	
	
	
	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		
	}
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	public void saque(double quantia) {
		saldo -= quantia + 5;
	}
	public String toString() {
		return "| Conta: "
				+numero
				+", Titular: "
				+nome
				+", Saldo: R$ "
				+String.format("%.2f", saldo)+"                   ";
	}
}
