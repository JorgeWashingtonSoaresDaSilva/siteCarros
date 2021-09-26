package jwss.game.studio.sistema.cinema.main;

import java.util.ArrayList;
import java.util.Scanner;

import jwss.game.studio.sistema.cinema.banco.Filmes;

public class Main {

	public static void main(String[] args) {
		// capitura de dados pelo teclado
		Scanner teclado = new Scanner(System.in);
		ArrayList<Filmes> bancoFilmes = new ArrayList();
		// Cadastro de filmes
		Filmes filme0 = new Filmes();
		filme0.setNome("Resident Evil");
		filme0.setHorario("15:30");
		filme0.setPreco1(Double.parseDouble("33.34"));
		filme0.setPreco2(Double.parseDouble("18.71"));
		bancoFilmes.add(filme0);
		Filmes filme1 = new Filmes();
		filme1.setNome("Transformers");
		filme1.setHorario("17:30");
		filme1.setPreco1(Double.parseDouble("33.34"));
		filme1.setPreco2(Double.parseDouble("18.71"));
		bancoFilmes.add(filme1);
		Filmes filme2 = new Filmes();
		filme2.setNome("Piratas do Caribe");
		filme2.setHorario("19:30");
		filme2.setPreco1(Double.parseDouble("33.34"));
		filme2.setPreco2(Double.parseDouble("18.71"));
		bancoFilmes.add(filme2);
		Filmes filme3 = new Filmes();
		filme3.setNome("Duro de Matar 4.0");
		filme3.setHorario("21:30");
		filme3.setPreco1(Double.parseDouble("33.34"));
		filme3.setPreco2(Double.parseDouble("18.71"));
		bancoFilmes.add(filme3);
		boolean rodando = true;
		while(rodando) {
			System.out.println("========== Sistema Cinema 1.0 ==========");
			System.out.println("| [1] Cadastros                        |");
			System.out.println("| [2] Consultas                        |");
			System.out.println("| [ ] ------------------------         |");
			System.out.println("| [ ] ------------------------         |");
			System.out.println("| [ ] ------------------------         |");
			System.out.println("| [6] Sair                             |");
			System.out.println("========================================");
			System.out.print("Digite opção desejada:");
			String opcao = teclado.nextLine();
			
			switch (opcao) {
				case "1":{
					boolean cadastro = true;
					while(cadastro) {
						System.out.println("============= Cadastros ===============");
						System.out.println("| [1] Cadastrar filme                 |");
						System.out.println("| [2] Listar todos os filmes          |");
						System.out.println("| [3] Procurar filme por nome         |");
						System.out.println("| [4] Atualizar dados de um filme     |");
						System.out.println("| [5] Remover filme                   |");
						System.out.println("| [6] Voltar                          |");
						System.out.println("=======================================");
						System.out.print("Digite opção desejada:");
						String opcao1 = teclado.nextLine();
						
						switch (opcao1) {
							case "1":{
									System.out.println("====== Cadastro de Filme ======");
									
									System.out.print("Digite nome do filme: ");
									String nome = teclado.nextLine();
									System.out.print("Digite horário: ");
									
									String horario = teclado.nextLine();
									System.out.print("Digite preço da entrada inteira R$: ");
									String preco1 = teclado.nextLine().replaceAll(",", ".");;
									System.out.print("Digite preço da entrada meia R$: ");
									String preco2 = teclado.nextLine().replaceAll(",", ".");
							
									// criando nova instancia da classe Filmes
									Filmes filme = new Filmes();
									//filme.setId(Integer.parseInt(id));
									
									filme.setNome(nome);
									filme.setHorario(horario);
									filme.setPreco1(Double.parseDouble(preco1));
									filme.setPreco2(Double.parseDouble(preco2));
									
									bancoFilmes.add(filme);
								break;
							}
							case "2":{
									System.out.println("============== Filmes Cadastrados ================");
									for(int i = 0; i < bancoFilmes.size(); i++) {
									Filmes filme = bancoFilmes.get(i);
									System.out.println("| id : "+i);
									System.out.println("| Nome do Filme: "+filme.getNome());
									System.out.println("| Horário : "+filme.getHorario());
									System.out.println("| Preço da entrada inteira R$: "+filme.getPreco1());
									System.out.println("| Preço da meia entrada  R$: "+filme.getPreco2());
									System.out.println("================================================");
									}
								break;
							}
							case "3":{
								System.out.println("============== Procurar Filme por Nome ================");
								System.out.print("Digite o nome do filme: ");
								String nome = teclado.nextLine();
								boolean encontrou = false;
								for(int i = 0; i < bancoFilmes.size(); i++) {
								Filmes filme = bancoFilmes.get(i);
								if( nome.equals( filme.getNome())) {
									
									System.out.println("========== Filme encontrado ====================");
									System.out.println("| id : "+i);
									System.out.println("| Nome do Filme: "+filme.getNome());
									System.out.println("| Horário : "+filme.getHorario());
									System.out.println("| Preço da entrada inteira R$: "+filme.getPreco1());
									System.out.println("| Preço da meia entrada  R$: "+filme.getPreco2());
									System.out.println("================================================");
									encontrou = true;
									break;
								}
								
								
								}
								if(!encontrou){
									System.out.println("========== Filme não encontrado ================");
									System.out.println("|");
									System.out.println("|"); 
									System.out.println("================================================");
								}
								break;
							}	
							case "4":{
								System.out.println("============== Atualizar Dados de um Filme ================");
								for(int i = 0; i < bancoFilmes.size(); i++) {
								Filmes filme = bancoFilmes.get(i);
								System.out.println("| id: "+i);
								System.out.println("| Nome do Filme: "+filme.getNome());
								System.out.println("================================================");
								}
								System.out.print("Digite o id do filme para atualizar os dados: ");
								int id = teclado.nextInt();
								teclado.nextLine();
								System.out.print("Digite nome do filme: ");
								String novonome = teclado.nextLine();
								System.out.print("Digite horário: ");
								String novohorario = teclado.nextLine();
								System.out.print("Digite preço da entrada inteira R$: ");
								String novopreco1 = teclado.nextLine().replaceAll(",", ".");;
								System.out.print("Digite preço da entrada meia R$: ");
								String novopreco2 = teclado.nextLine().replaceAll(",", ".");
								Filmes filme = bancoFilmes.get(id);
								filme.setNome(novonome);
								filme.setHorario(novohorario);
								filme.setPreco1(Double.parseDouble(novopreco1));
								filme.setPreco2(Double.parseDouble(novopreco2));
								break;
							}	
							case "5":{
								System.out.println("============== Remover um Filme ================");
								for(int i = 0; i < bancoFilmes.size(); i++) {
								Filmes filme = bancoFilmes.get(i);
								System.out.println("| id : "+i);
								System.out.println("| Nome do Filme: "+filme.getNome());
								System.out.println("================================================");
								}
								System.out.print("Digite o id do filme que deseja remover: ");
								int id = teclado.nextInt();
								teclado.nextLine();
								
								Filmes filme = bancoFilmes.remove(id);
								
								break;
							}
							case "6":{
								cadastro = false;
								break;
							}
					}
					}
					break;
				}
				case "2":{
					boolean consultas = true;
					while(consultas) {
						System.out.println("============= Consultas ===============");
						System.out.println("| [1] Cadastrar filme                 |");
						System.out.println("| [2] Listar todos os filmes          |");
						System.out.println("| [3] Procurar filme por nome         |");
						System.out.println("| [4] Atualizar dados de um filme     |");
						System.out.println("| [5] Remover filme                   |");
						System.out.println("| [6] Voltar                          |");
						System.out.println("=======================================");
						System.out.print("Digite opção desejada:");
						String opcao1 = teclado.nextLine();
						
						switch (opcao1) {
							case "1":{
									System.out.println("====== Cadastro de Filme ======");
									
									System.out.print("Digite nome do filme: ");
									String nome = teclado.nextLine();
									System.out.print("Digite horário: ");
									
									String horario = teclado.nextLine();
									System.out.print("Digite preço da entrada inteira R$: ");
									String preco1 = teclado.nextLine().replaceAll(",", ".");;
									System.out.print("Digite preço da entrada meia R$: ");
									String preco2 = teclado.nextLine().replaceAll(",", ".");
							
									// criando nova instancia da classe Filmes
									Filmes filme = new Filmes();
									//filme.setId(Integer.parseInt(id));
									
									filme.setNome(nome);
									filme.setHorario(horario);
									filme.setPreco1(Double.parseDouble(preco1));
									filme.setPreco2(Double.parseDouble(preco2));
									
									bancoFilmes.add(filme);
								break;
							}
							case "2":{
									System.out.println("============== Filmes Cadastrados ================");
									for(int i = 0; i < bancoFilmes.size(); i++) {
									Filmes filme = bancoFilmes.get(i);
									System.out.println("| id : "+i);
									System.out.println("| Nome do Filme: "+filme.getNome());
									System.out.println("| Horário : "+filme.getHorario());
									System.out.println("| Preço da entrada inteira R$: "+filme.getPreco1());
									System.out.println("| Preço da meia entrada  R$: "+filme.getPreco2());
									System.out.println("================================================");
									}
								break;
							}
							case "3":{
								System.out.println("============== Procurar Filme por Nome ================");
								System.out.print("Digite o nome do filme: ");
								String nome = teclado.nextLine();
								boolean encontrou = false;
								for(int i = 0; i < bancoFilmes.size(); i++) {
								Filmes filme = bancoFilmes.get(i);
								if( nome.equals( filme.getNome())) {
									
									System.out.println("========== Filme encontrado ====================");
									System.out.println("| id : "+i);
									System.out.println("| Nome do Filme: "+filme.getNome());
									System.out.println("| Horário : "+filme.getHorario());
									System.out.println("| Preço da entrada inteira R$: "+filme.getPreco1());
									System.out.println("| Preço da meia entrada  R$: "+filme.getPreco2());
									System.out.println("================================================");
									encontrou = true;
									break;
								}
								
								
								}
								if(!encontrou){
									System.out.println("========== Filme não encontrado ================");
									System.out.println("|");
									System.out.println("|"); 
									System.out.println("================================================");
								}
								break;
							}	
							case "4":{
								System.out.println("============== Atualizar Dados de um Filme ================");
								for(int i = 0; i < bancoFilmes.size(); i++) {
								Filmes filme = bancoFilmes.get(i);
								System.out.println("| id: "+i);
								System.out.println("| Nome do Filme: "+filme.getNome());
								System.out.println("================================================");
								}
								System.out.print("Digite o id do filme para atualizar os dados: ");
								int id = teclado.nextInt();
								teclado.nextLine();
								System.out.print("Digite nome do filme: ");
								String novonome = teclado.nextLine();
								System.out.print("Digite horário: ");
								String novohorario = teclado.nextLine();
								System.out.print("Digite preço da entrada inteira R$: ");
								String novopreco1 = teclado.nextLine().replaceAll(",", ".");;
								System.out.print("Digite preço da entrada meia R$: ");
								String novopreco2 = teclado.nextLine().replaceAll(",", ".");
								Filmes filme = bancoFilmes.get(id);
								filme.setNome(novonome);
								filme.setHorario(novohorario);
								filme.setPreco1(Double.parseDouble(novopreco1));
								filme.setPreco2(Double.parseDouble(novopreco2));
								break;
							}	
							case "5":{
								System.out.println("============== Remover um Filme ================");
								for(int i = 0; i < bancoFilmes.size(); i++) {
								Filmes filme = bancoFilmes.get(i);
								System.out.println("| id : "+i);
								System.out.println("| Nome do Filme: "+filme.getNome());
								System.out.println("================================================");
								}
								System.out.print("Digite o id do filme que deseja remover: ");
								int id = teclado.nextInt();
								teclado.nextLine();
								
								Filmes filme = bancoFilmes.remove(id);
								
								break;
							}
							case "6":{
								consultas = false;
								break;
							}
					}
					}
					break;
				}
				case "3":{
					
					break;
				}	
				case "4":{
					
					break;
				}	
				case "5":{
					
					break;
				}
				case "6":{
					rodando = false;
					break;
				}
		}
		}
		
		
		// mostrar valores 
		
			
		

	}

}
