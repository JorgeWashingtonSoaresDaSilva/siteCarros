package jwss.game.studio.sistema.cinema.main;

import java.util.ArrayList;
import java.util.Scanner;

import jwss.game.studio.sistema.cinema.banco.Filmes;
import jwss.game.studio.sistema.cinema.entidade.Cliente;

public class Main {

	public static void main(String[] args) {
		// capitura de dados pelo teclado
		boolean consultas =true , cadastros = true, atualizacoes = true, vendaIngressos = true;
		String opcao1 = "0", opcao = "0";
		Scanner teclado = new Scanner(System.in);
		ArrayList<Cliente> clientes = new ArrayList();
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
		// Cadastro de clientes
		Cliente cliente = new Cliente();
		cliente.setNome("Mateus Ceara");
		cliente.setIdade("1993");
		clientes.add(cliente);
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Arhur Miguel");
		cliente1.setIdade("2014");
		clientes.add(cliente1);
		
		boolean rodando = true;
		while(rodando) {
			System.out.println("========== Sistema Cinema 1.0 ==========");
			System.out.println("| [1] Cadastros                        |");
			System.out.println("| [2] Consultas                        |");
			System.out.println("| [3] Atualizações                     |");
			System.out.println("| [4] Venda de Igressos                |");
			System.out.println("| [ ] ------------------------         |");
			System.out.println("| [6] Sair                             |");
			System.out.println("========================================");
			System.out.print("Digite opção desejada:");
			opcao = teclado.nextLine();
			
			
			switch (opcao) {
			
			
				case "1":{
					if(  opcao.equals("1") ) {
						opcao1 = "1";
						consultas  = false;
						atualizacoes = false;
						vendaIngressos = false;
						cadastros = true;
					}
					while(cadastros) {
						System.out.println("============= Cadastros ===============");
						System.out.println("| [1] Cadastrar filme                 |");
						System.out.println("| [2] Listar todos os filmes          |");
						System.out.println("| [3] Cadastrar cliente               |");
						System.out.println("| [4] Listar todos os clientes        |");
						System.out.println("| [ ] ------------------------        |");
						System.out.println("| [6] Voltar                          |");
						System.out.println("=======================================");
						System.out.print("Digite opção desejada:");
						 opcao1 = teclado.nextLine();
						
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
									System.out.println("====== Cadastro de Cliente ======");
									
									System.out.print("Digite nome do cliente: ");
									String nome = teclado.nextLine();
									System.out.print("Digite a ano de nascimento do cliente: ");
									String idade = teclado.nextLine();
							
									// criando nova instancia da classe Filmes
									Cliente clienteNovo = new Cliente();
									//filme.setId(Integer.parseInt(id));
									
									clienteNovo.setNome(nome);
									clienteNovo.setIdade(idade);
									
									clientes.add(clienteNovo);
									
								break;
							}	
							case "4":{
									System.out.println("============== Clientes Cadastrados ================");
									for(int i = 0; i < clientes.size(); i++) {
									Cliente clienteb = clientes.get(i);
									System.out.println("| id : "+i);
									System.out.println("| Nome do Cliente: "+clienteb.getNome());
									System.out.println("| idade do Cliente : "+clienteb.getIdade());
									
									}
								break;
							}	
							case "5":{
								
								
								break;
							}
							case "6":{
								cadastros = false;
								
								
								break;
							}
							
						}
					}
				}
				case "2":{
					
					if(  opcao.equals("2") ) {
						opcao1 = "2";
						consultas  = true;
						atualizacoes = false;
						vendaIngressos = false;
						cadastros = false;
					}
					while(consultas) {
						System.out.println("============= Consultas =================");
						System.out.println("| [1] Consultar filmes e seus horários  |");
						System.out.println("| [2] Procurar filme por nome           |");
						System.out.println("| [3] Consultar clientes                |");
						System.out.println("| [4] Procurar cliente por nome         |");
						System.out.println("| [ ] -------------------------         |");
						System.out.println("| [6] Voltar                            |");
						System.out.println("=========================================");
						System.out.print("Digite opção desejada:");
						opcao1 = teclado.nextLine();
						
						switch (opcao1) {
							case "1":{
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
							case "2":{
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
							case "3":{
									System.out.println("============== Clientes Cadastrados ================");
									for(int i = 0; i < clientes.size(); i++) {
									Cliente clienteb = clientes.get(i);
									System.out.println("| id : "+i);
									System.out.println("| Nome do Cliente : "+clienteb.getNome());
									System.out.println("| Idade do Cliente : "+clienteb.getIdade());
									
									}
								break;
							}	
							case "4":{
								System.out.println("============== Procurar Cliente por Nome ================");
								System.out.print("Digite o nome do cliente: ");
								String nome = teclado.nextLine();
								boolean encontrou = false;
								for(int i = 0; i < clientes.size(); i++) {
								Cliente clienteb = clientes.get(i);
								if( nome.equals( clienteb.getNome())) {
									
									System.out.println("========== Cliente encontrado ====================");
									System.out.println("| id : "+i);
									System.out.println("| Nome do Cliente: "+clienteb.getNome());
									System.out.println("| Idade do Cliente : "+clienteb.getIdade());
									System.out.println("===================================================");
									encontrou = true;
									break;
								}
								
								
								}
								if(!encontrou){
									System.out.println("========== Cliente não encontrado ================");
									System.out.println("|");
									System.out.println("|"); 
									System.out.println("==================================================");
								}
								break;
							}	
							case "5":{
								
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
					if(  opcao.equals("3") ) {
						opcao1 = "3";
						consultas  = false;
						cadastros = false;
						vendaIngressos = false;
						atualizacoes = true;
					}
					while(atualizacoes) {
						System.out.println("============= Atualizações ===============");
						System.out.println("| [1] Atualizar Dados de um filme        |");
						System.out.println("| [2] Remover um filme                   |");
						System.out.println("| [3] Atualizar Dados de um cliente      |");
						System.out.println("| [4] Remover um cliente                 |");
						System.out.println("| [ ] ------------------------           |");
						System.out.println("| [6] Voltar                             |");
						System.out.println("==========================================");
						System.out.print("Digite opção desejada:");
						 opcao1 = teclado.nextLine();
						
						switch (opcao1) {
							case "1":{
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
							case "2":{
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
									
									bancoFilmes.remove(id);
							
								break;
							}
							case "3":{
									System.out.println("============== Atualizar Dados de um Cliente ================");
									for(int i = 0; i < clientes.size(); i++) {
									Cliente clienteb = clientes.get(i);
									System.out.println("| id: "+i);
									System.out.println("| Nome do Cliente: "+clienteb.getNome());
									System.out.println("================================================");
									}
									System.out.print("Digite o id do cliente para atualizar os dados: ");
									int id = teclado.nextInt();
									teclado.nextLine();
									System.out.print("Digite nome do cliente: ");
									String novonome = teclado.nextLine();
									System.out.print("Digite idade: ");
									String novoidade = teclado.nextLine();
									Cliente clienteb = clientes.get(id);
									clienteb.setNome(novonome);
									clienteb.setIdade(novoidade);
									
								
									
								break;
							}	
							case "4":{
									System.out.println("============== Remover um Cliente ================");
									for(int i = 0; i < clientes.size(); i++) {
									Cliente clienteb = clientes.get(i);
									System.out.println("| id : "+i);
									System.out.println("| Nome do Cliente: "+clienteb.getNome());
									System.out.println("===================================================");
									}
									System.out.print("Digite o id do cliente que deseja remover: ");
									int id = teclado.nextInt();
									teclado.nextLine();
									
									clientes.remove(id);
						
									
									
								break;
							}	
							case "5":{
								
								
								break;
							}
							case "6":{
								atualizacoes = false;
								
								
								break;
							}
						}
					}
				}
							
				case "4":{
					if(  opcao.equals("4") ) {
						opcao1 = "4";
						consultas  = false;
						cadastros = false;
						vendaIngressos = true;
						atualizacoes = false;
					}
					while(vendaIngressos) {
						System.out.println("============= Venda de Ingressos ===============");
						System.out.println("| [1] Filmes,Horários e Preços                 |");
						System.out.println("| [2] Clientes no Sistema                      |");
						System.out.println("| [3] Vender Ingressos                         |");
						System.out.println("| [4] ------------------------                 |");
						System.out.println("| [ ] ------------------------                 |");
						System.out.println("| [6] Voltar                                   |");
						System.out.println("================================================");
						System.out.print("Digite opção desejada:");
						 opcao1 = teclado.nextLine();
						
						switch (opcao1) {
							case "1":{
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
							case "2":{
									System.out.println("============== Clientes Cadastrados ================");
									for(int i = 0; i < clientes.size(); i++) {
									Cliente clienteb = clientes.get(i);
									System.out.println("| id : "+i);
									System.out.println("| Nome do Cliente : "+clienteb.getNome());
									System.out.println("| Idade do Cliente : "+clienteb.getIdade());
									
									}
								break;
							}
							case "3":{
								System.out.println("============== Venda de Igressos ================");
								System.out.println("Digite id do cliente");
								int idcli = teclado.nextInt();
								teclado.nextLine();
								System.out.println("Digite id do filme");
								int idfil = teclado.nextInt();
								teclado.nextLine();
								System.out.println("================ dados da compra ====================");
								Cliente clienteb = clientes.get(idcli);
								Filmes filme = bancoFilmes.get(idfil);
								System.out.println("| Id: "+idcli+" Nome: "+clienteb.getNome()+" Idade: "+
								clienteb.getIdade());
								System.out.println("| Id: "+idfil+" Nome: "+filme.getNome()+" Horário: "+
										filme.getHorario());
								System.out.println("| Meia Entrada: R$"+filme.getPreco2());
								System.out.println("| Entrada Inteira: R$"+filme.getPreco1());
								if(Integer.parseInt(clienteb.getIdade()) < 7 || Integer.parseInt(clienteb.getIdade()) >=65) {
									System.out.println("| Você paga Meia Entrada");
									System.out.println("============== continuando compra ================");
									System.out.println("| Total a Pagar: "+filme.getPreco2());
								}else {
									System.out.println("| Você paga Entrada Inteira");
									System.out.println("============== continuando compra ================");
									System.out.println("| Total a Pagar: "+filme.getPreco1());
								}
								System.out.println("|Escolha a forma de padamento:");
								System.out.println("| [1] Avista");
								System.out.println("| [2] Cartão de crédito");
								System.out.println("|");
								System.out.println("Digite Opção");
								String forPag = teclado.nextLine();
								switch(forPag) {
									case "1":{
										System.out.println("-----Você pagou avista-----");
										if(Integer.parseInt(clienteb.getIdade()) < 7 || Integer.parseInt(clienteb.getIdade()) >=65) {
				
											System.out.println("| Total a Pagar: "+filme.getPreco2());
										}else {
											System.out.println("| Total a Pagar: "+filme.getPreco1());
										}
									break;
									}
									case "2":{
										System.out.println("-----Você pagou com cartão de crédito-----");
										if(Integer.parseInt(clienteb.getIdade()) < 7 || Integer.parseInt(clienteb.getIdade()) >=65) {
											System.out.println("|");
											System.out.println("| Total Pago: "+filme.getPreco2());
											System.out.println("| Bom Filme");
											System.out.println("|-----------------------------------");
										}else {
											System.out.println("|");
											System.out.println("| Total Pago: "+filme.getPreco1());
											System.out.println("| Bom Filme");
											System.out.println("|------------------------------------");
										}
										break;
										}
									default:{
										System.out.println("Opção de Pagamento invalida");
										break;
										}
								}
								System.out.println("========================================================");
								break;
							}	
							case "4":{
									
								break;
							}	
							case "5":{
								
								
								break;
							}
							case "6":{
								vendaIngressos = false;
								
								
								break;
							}
					
						}
					}
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
