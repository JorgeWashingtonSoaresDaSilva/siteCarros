package jwss.game.studio.sistema.cinema.entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nome;
	private String idade;
	Date data = new Date();
	SimpleDateFormat formatar = new SimpleDateFormat("yyyy");

	
	// metodos publicos seters 
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(String idade) {
		int anoAtual = Integer.parseInt(formatar.format(data));
		int nasc = Integer.parseInt(idade);
		int result =  anoAtual - nasc;
		this.idade = Integer.toString(result);
	}
	
	
	
	// metodos publicos geters
	
	public String getNome() {
		return this.nome;
	
	}
	public String getIdade() {
		
		return this.idade;
	}
	

}
