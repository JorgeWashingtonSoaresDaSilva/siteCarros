package entities;

public class Funcionario {
	// Atributos
	private String nome;
	private double salarioBruto;
	private String email;
	
	
	
	
	public Funcionario() {
		
	}
	public Funcionario(String nome, double salarioBruto, String email) {
		
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.email = email;
	}
	// Métodos Geters e Seters
	
	public String getNome() {
		return nome;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	// Metodos de regra de negocio
	
	public static void limpaTela(int n1) {
		
		for(int i = 0; i < n1; i++) {
			System.out.println(" ");
			}
		
	}
}
