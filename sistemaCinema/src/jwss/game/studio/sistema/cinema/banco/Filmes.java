package jwss.game.studio.sistema.cinema.banco;

public class Filmes {
	
	private String nome;
	private String horario;
	private double preco1,preco2;
	
	// metodos publicos seters 
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void setPreco1(double preco1) {
		this.preco1 = preco1;
	}
	public void setPreco2(double preco2) {
		this.preco2 = preco2;
	}
	
	
	// metodos publicos geters
	
	public String getNome() {
		return this.nome;
	
	}
	public String getHorario() {
		return this.horario;
	}
	public double getPreco1() {
		return this.preco1;
	}
	public double getPreco2() {
		return this.preco2;
	}

}
