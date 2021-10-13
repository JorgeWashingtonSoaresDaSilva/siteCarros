package entities;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	
	
	
	public Conta(int numero, String nome, double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	public Conta(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void deposito(double quantia) {
		
	}
	public void saque(double quantia) {
		
	}
}
