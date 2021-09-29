package jwss.game.studio.sistema.cinema.main;

import java.io.IOException;
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
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Filmes> bancoFilmes = new ArrayList<Filmes>();
		
		// Cadastro de filmes
		Filmes filme0 = new Filmes();
		filme0.setNome("Resident Evil");
		filme0.setHorario("15:30");
		filme0.setPreco1(Double.parseDouble("33.34"));
		double preco = filme0.getPreco1();
		double preco01 = (preco/2);
		filme0.setPreco2(preco01);
		
		bancoFilmes.add(filme0);
		Filmes filme1 = new Filmes();
		filme1.setNome("Transformers");
		filme1.setHorario("17:30");
		filme1.setPreco1(Double.parseDouble("33.34"));
		double preco0 = filme1.getPreco1();
		double preco3 = (preco0/2);
		filme1.setPreco2(preco3);
		bancoFilmes.add(filme1);
		Filmes filme2 = new Filmes();
		filme2.setNome("Piratas do Caribe");
		filme2.setHorario("19:30");
		filme2.setPreco1(Double.parseDouble("33.34"));
		double preco4 = filme2.getPreco1();
		double preco5 = (preco4/2);
		filme2.setPreco2(preco5);
		bancoFilmes.add(filme2);
		Filmes filme3 = new Filmes();
		filme3.setNome("Duro de Matar 4.0");
		filme3.setHorario("21:30");
		filme3.setPreco1(Double.parseDouble("25.50"));
		double prec6 = filme3.getPreco1();
		double preco7 = (prec6/2);
		filme3.setPreco2(preco7);
		bancoFilmes.add(filme3);
		// Cadastro de clientes
		Cliente cliente = new Cliente();
		cliente.setNome("Mateus Ceara");
		cliente.setIdade("1993");
		clientes.add(cliente);
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Arthur Miguel");
		cliente1.setIdade("2019");
		clientes.add(cliente1);
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Alfredo");
		cliente2.setIdade("1954");
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Lucas");
		cliente3.setIdade("2008");
		clientes.add(cliente3);
		clientes.add(cliente2);
		
		boolean rodando = true;
		while(rodando) {
			System.out.println("========== Sistema Cinema 1.0 ==========");
			System.out.println("| [1] Cadastros                        |");
			System.out.println("| [2] Consultas                        |");
			System.out.println("| [3] Atualizações                     |");
			System.out.println("| [4] Venda de Igressos                |");
			System.out.println("| [5] Limpar a Tela                    |");
			System.out.println("| [6] Sair                             |");
			System.out.println("========================================");
			System.out.print("Digite opção desejada:");
			opcao = teclado.nextLine();
			
			
			switch (opcao) {
			
			
				case "1":{
					limpaTela(180);
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
						System.out.println("| [5] Limpar a Tela                   |");
						System.out.println("| [6] Voltar                          |");
						System.out.println("=======================================");
						System.out.print("Digite opção desejada:");
						 opcao1 = teclado.nextLine();
						
						switch (opcao1) {
							case "1":{
								limpaTela(80);
								System.out.println("> Abaixo preencha dados do filme a ser cadastrado no sistema");
								
								limpaTela(2);
									System.out.println("====== Cadastro de Filme ======");
									
									System.out.print("Digite nome do filme: ");
									String nome = teclado.nextLine();
									System.out.print("Digite horário: ");
									
									String horario = teclado.nextLine();
									System.out.print("Digite preço da entrada inteira R$: ");
									String preco1 = teclado.nextLine().replaceAll(",", ".");;
									
									
							
									// criando nova instancia da classe Filmes
									Filmes filme = new Filmes();
									//filme.setId(Integer.parseInt(id));
									
									filme.setNome(nome);
									filme.setHorario(horario);
									filme.setPreco1(Double.parseDouble(preco1));
									double preco8 = filme.getPreco1();
									double preco9 = (preco8/2);
									filme.setPreco2(preco9);
									
									bancoFilmes.add(filme);
									limpaTela(180);
									System.out.println("> Filme cadastrado com sucesso");
									limpaTela(2);
								
								break;
							}
							case "2":{
								limpaTela(180);
									System.out.println("============== Filmes Cadastrados ================");
									for(int i = 0; i < bancoFilmes.size(); i++) {
									Filmes filme = bancoFilmes.get(i);
									System.out.println("| id : "+i);
									System.out.println("| Nome do Filme: "+filme.getNome());
									System.out.println("| Horário : "+filme.getHorario());
									System.out.println("| Preço da entrada inteira R$: "+String.format("%.2f", filme.getPreco1()));
									System.out.println("| Preço da meia entrada  R$: "+String.format("%.2f", filme.getPreco2()));
									System.out.println("================================================");
									}
									limpaTela(1);
									
								
									System.out.println("> Acima a lista de filme cadastrado no sistema");
									
									limpaTela(2);
								break;
							}
							case "3":{
								limpaTela(80);
								System.out.println("> Abaixo preencha dados do cliente a ser cadastrado no sistema");
								
								limpaTela(2);
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
									limpaTela(180);
									System.out.println("> Cliente cadastrado com sucesso");
									limpaTela(2);
									
								break;
							}	
							case "4":{
								limpaTela(180);
									System.out.println("============== Clientes Cadastrados ================");
									for(int i = 0; i < clientes.size(); i++) {
									Cliente clienteb = clientes.get(i);
									System.out.println("| id : "+i);
									System.out.println("| Nome do Cliente: "+clienteb.getNome());
									System.out.println("| idade do Cliente : "+clienteb.getIdade());
									}
									limpaTela(1);
									System.out.println("> Acima a lista de clientes cadastrado no sistema");
									limpaTela(2);
								break;
							}	
							case "5":{
								limpaTela(180);
								
								break;
							}
							case "6":{
								cadastros = false;
								limpaTela(50);
								
								break;
							}
							
						}
					}
				}
				case "2":{
					limpaTela(180);
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
						System.out.println("| [5] Limpar a Tela                     |");
						System.out.println("| [6] Voltar                            |");
						System.out.println("=========================================");
						System.out.print("Digite opção desejada:");
						opcao1 = teclado.nextLine();
						
						switch (opcao1) {
							case "1":{
								limpaTela(180);
								System.out.println("============== Filmes Cadastrados ================");
								for(int i = 0; i < bancoFilmes.size(); i++) {
								Filmes filme = bancoFilmes.get(i);
								System.out.println("| id : "+i);
								System.out.println("| Nome do Filme: "+filme.getNome());
								System.out.println("| Horário : "+filme.getHorario());
								System.out.println("| Preço da entrada inteira R$: "+String.format("%.2f", filme.getPreco1()));
								System.out.println("| Preço da meia entrada  R$: "+String.format("%.2f", filme.getPreco2()));
								System.out.println("================================================");
								}
								limpaTela(1);
								
							
								System.out.println("> Acima a lista de filme cadastrado no sistema");
								
								limpaTela(2);
								break;
							}
							case "2":{
								limpaTela(180);
								System.out.println("> Abaixo digite nome do filme a ser procurado");
								
								limpaTela(2);
									System.out.println("============== Procurar Filme por Nome ================");
									System.out.print("Digite o nome do filme: ");
									String nome = teclado.nextLine();
									boolean encontrou = false;
									for(int i = 0; i < bancoFilmes.size(); i++) {
									Filmes filme = bancoFilmes.get(i);
									if( nome.equals( filme.getNome())) {
										limpaTela(22);
										System.out.println("========== Filme encontrado ====================");
										System.out.println("| id : "+i);
										System.out.println("| Nome do Filme: "+filme.getNome());
										System.out.println("| Horário : "+filme.getHorario());
										System.out.println("| Preço da entrada inteira R$: "+String.format("%.2f", filme.getPreco1()));
										System.out.println("| Preço da meia entrada  R$: "+String.format("%.2f", filme.getPreco2()));
										System.out.println("================================================");
										limpaTela(2);
										encontrou = true;
										break;
									}
									
									
									}
									if(!encontrou){
										limpaTela(26);
										System.out.println("========== Filme não encontrado ================");
										System.out.println("|");
										System.out.println("|"); 
										System.out.println("================================================");
										limpaTela(2);
									}
								break;
							}
							case "3":{
								limpaTela(180);
								System.out.println("============== Clientes Cadastrados ================");
								for(int i = 0; i < clientes.size(); i++) {
								Cliente clienteb = clientes.get(i);
								System.out.println("| id : "+i);
								System.out.println("| Nome do Cliente: "+clienteb.getNome());
								System.out.println("| idade do Cliente : "+clienteb.getIdade());
								}
								limpaTela(1);
								System.out.println("> Acima a lista de clientes cadastrado no sistema");
								limpaTela(2);
								break;
							}	
							case "4":{
								limpaTela(180);
								System.out.println("> Abaixo digite nome do cliente a ser procurado");
								
								limpaTela(2);
								System.out.println("============== Procurar Cliente por Nome ================");
								System.out.print("Digite o nome do cliente: ");
								String nome = teclado.nextLine();
								boolean encontrou = false;
								for(int i = 0; i < clientes.size(); i++) {
								Cliente clienteb = clientes.get(i);
								if( nome.equals( clienteb.getNome())) {
									limpaTela(26);
									System.out.println("========== Cliente encontrado ====================");
									System.out.println("| id : "+i);
									System.out.println("| Nome do Cliente: "+clienteb.getNome());
									System.out.println("| Idade do Cliente : "+clienteb.getIdade());
									System.out.println("===================================================");
									limpaTela(2);
									encontrou = true;
									break;
								}
								
								
								}
								if(!encontrou){
									limpaTela(26);
									System.out.println("========== Cliente não encontrado ================");
									System.out.println("|");
									System.out.println("|"); 
									System.out.println("==================================================");
									limpaTela(2);
								}
								break;
							}	
							case "5":{
								limpaTela(180);
								break;
							}
							case "6":{
								consultas = false;
								limpaTela(50);
								break;
							}
					}
					}
					break;
				}
				case "3":{
					limpaTela(180);
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
						System.out.println("| [5] Limpar a Tela                      |");
						System.out.println("| [6] Voltar                             |");
						System.out.println("==========================================");
						System.out.print("Digite opção desejada:");
						 opcao1 = teclado.nextLine();
						
						switch (opcao1) {
							case "1":{
								limpaTela(15);
								
								System.out.println("============== Atualizar Dados de um Filme ================");
								for(int i = 0; i < bancoFilmes.size(); i++) {
								Filmes filme = bancoFilmes.get(i);
								System.out.println("| id: "+i);
								System.out.println("| Nome do Filme: "+filme.getNome());
								System.out.println("================================================");
								}
								limpaTela(1);
								System.out.println("> Abaixo digite o id do filme a ser alterado");
								
								limpaTela(2);
								System.out.print("Digite o id do filme para atualizar os dados: ");
								int id = teclado.nextInt();
								teclado.nextLine();
								System.out.print("Digite novo nome do filme: ");
								String novonome = teclado.nextLine();
								System.out.print("Digite novo horário: ");
								String novohorario = teclado.nextLine();
								System.out.print("Digite novo preço da entrada inteira R$: ");
								String novopreco1 = teclado.nextLine().replaceAll(",", ".");;
								//System.out.print("Digite preço da entrada meia R$: ");
								//String novopreco2 = teclado.nextLine().replaceAll(",", ".");
								Filmes filme = bancoFilmes.get(id);
								filme.setNome(novonome);
								filme.setHorario(novohorario);
								filme.setPreco1(Double.parseDouble(novopreco1));
								double preco8 = filme.getPreco1();
								double preco9 = (preco8/2);
								filme.setPreco2(preco9);
								//filme.setPreco2(Double.parseDouble(novopreco2));
								limpaTela(180);
								System.out.println("> Filme alterado com sucesso");
								limpaTela(2);
							
								break;
							}
							case "2":{
								limpaTela(15);
								
									System.out.println("============== Remover um Filme ================");
									for(int i = 0; i < bancoFilmes.size(); i++) {
									Filmes filme = bancoFilmes.get(i);
									System.out.println("| id : "+i);
									System.out.println("| Nome do Filme: "+filme.getNome());
									System.out.println("================================================");
									}
									limpaTela(1);
									System.out.println("> Abaixo digite o id do filme a ser removido");
									
									limpaTela(2);
									System.out.print("Digite o id do filme que deseja remover: ");
									int id = teclado.nextInt();
									teclado.nextLine();
									
									bancoFilmes.remove(id);
									limpaTela(180);
									System.out.println("> Filme Removido com sucesso");
									limpaTela(2);
							
								break;
							}
							case "3":{
								limpaTela(15);
									System.out.println("============== Atualizar Dados de um Cliente ================");
									for(int i = 0; i < clientes.size(); i++) {
									Cliente clienteb = clientes.get(i);
									System.out.println("| id: "+i);
									System.out.println("| Nome do Cliente: "+clienteb.getNome());
									System.out.println("================================================");
									}
									limpaTela(1);
									System.out.println("> Abaixo digite o id do cliente a ser alterado");
									
									limpaTela(2);
									System.out.print("Digite o id do cliente para atualizar os dados: ");
									int id = teclado.nextInt();
									teclado.nextLine();
									System.out.print("Digite novo nome do cliente: ");
									String novonome = teclado.nextLine();
									System.out.print("Digite nova data de nascimento: ");
									String novoidade = teclado.nextLine();
									Cliente clienteb = clientes.get(id);
									clienteb.setNome(novonome);
									clienteb.setIdade(novoidade);
									limpaTela(180);
									System.out.println("> Cliente alterado com sucesso");
									limpaTela(2);
									
								
									
								break;
							}	
							case "4":{
								limpaTela(15);
									System.out.println("============== Remover um Cliente ================");
									for(int i = 0; i < clientes.size(); i++) {
									Cliente clienteb = clientes.get(i);
									System.out.println("| id : "+i);
									System.out.println("| Nome do Cliente: "+clienteb.getNome());
									System.out.println("===================================================");
									}
									limpaTela(1);
									System.out.println("> Abaixo digite o id do cliente a ser removido");
									
									limpaTela(2);
									System.out.print("Digite o id do cliente que deseja remover: ");
									int id = teclado.nextInt();
									teclado.nextLine();
									
									clientes.remove(id);
									limpaTela(180);
									System.out.println("> Cliente Removido com sucesso");
									limpaTela(2);
						
									
									
								break;
							}	
							case "5":{
								limpaTela(180);
								
								break;
							}
							case "6":{
								atualizacoes = false;
								limpaTela(50);
								
								break;
							}
						}
					}
				}
							
				case "4":{
					limpaTela(180);
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
						System.out.println("| [5] Limpar a Tela                            |");
						System.out.println("| [6] Voltar                                   |");
						System.out.println("================================================");
						System.out.print("Digite opção desejada:");
						 opcao1 = teclado.nextLine();
						
						switch (opcao1) {
							case "1":{
								limpaTela(180);
								System.out.println("============== Filmes Cadastrados ================");
								for(int i = 0; i < bancoFilmes.size(); i++) {
								Filmes filme = bancoFilmes.get(i);
								System.out.println("| id : "+i);
								System.out.println("| Nome do Filme: "+filme.getNome());
								System.out.println("| Horário : "+filme.getHorario());
								System.out.println("| Preço da entrada inteira R$: "+String.format("%.2f", filme.getPreco1()));
								System.out.println("| Preço da meia entrada  R$: "+String.format("%.2f", filme.getPreco2()));
								System.out.println("================================================");
								}
								limpaTela(1);
								
							
								System.out.println("> Acima a lista de filme cadastrado no sistema");
								
								limpaTela(2);
							
								break;
							}
							case "2":{
								limpaTela(180);
								System.out.println("============== Clientes Cadastrados ================");
								for(int i = 0; i < clientes.size(); i++) {
								Cliente clienteb = clientes.get(i);
								System.out.println("| id : "+i);
								System.out.println("| Nome do Cliente: "+clienteb.getNome());
								System.out.println("| idade do Cliente : "+clienteb.getIdade());
								}
								limpaTela(1);
								System.out.println("> Acima a lista de clientes cadastrado no sistema");
								limpaTela(2);
								break;
							}
							case "3":{
								limpaTela(35);
								System.out.println("> Abaixo digite id do cliente "
										+ "e o id do filme");
								
								limpaTela(4);
								System.out.println("============== Venda de Igressos ================");
								System.out.println("Digite id do cliente");
								int idcli = teclado.nextInt();
								teclado.nextLine();
								System.out.println("Digite id do filme");
								int idfil = teclado.nextInt();
								teclado.nextLine();
								limpaTela(35);
								System.out.println("================ dados da compra ====================");
								Cliente clienteb = clientes.get(idcli);
								Filmes filme = bancoFilmes.get(idfil);
								System.out.println("| Id: "+idcli+" Nome: "+clienteb.getNome()+" Idade: "+
								clienteb.getIdade()+" Anos");
								System.out.println("| Id: "+idfil+" Nome: "+filme.getNome()+" Horário: "+
										filme.getHorario());
								System.out.println("| Meia Entrada: R$"+String.format("%.2f", filme.getPreco2()));
								System.out.println("| Entrada Inteira: R$"+String.format("%.2f", filme.getPreco1()));
								if(Integer.parseInt(clienteb.getIdade()) < 18 || Integer.parseInt(clienteb.getIdade()) >=65) {
									System.out.println("|");
									System.out.println("| Você paga Meia Entrada");
									System.out.println("============== continuando compra ==================");
									System.out.println("| Total a Pagar: R$"+String.format("%.2f", filme.getPreco2()));
									
								}else {
									System.out.println("|");
									System.out.println("| Você paga Entrada Inteira");
									System.out.println("============== continuando compra ===================");
									System.out.println("| Total Pago: R$"+String.format("%.2f", filme.getPreco1()));
								}
								
								System.out.println("| Escolha a forma de padamento:");
								System.out.println("| [1] Avista");
								System.out.println("| [2] Cartão de crédito");
								System.out.println("|");
								System.out.println("Digite Opção");
								String forPag = teclado.nextLine();
								switch(forPag) {
									case "1":{
										limpaTela(16);
										System.out.println("-----Você pagou avista-------------------------------------");
										if(Integer.parseInt(clienteb.getIdade()) < 18 || Integer.parseInt(clienteb.getIdade()) >=65) {
											System.out.println("|");
											System.out.println("| Ingresso do filme: "+filme.getNome());
											System.out.println("| Horário da sessão: "+filme.getHorario());
											System.out.println("| Preço do ingresso: R$"+String.format("%.2f", filme.getPreco1()));
											System.out.println("| Desconto: R$"+String.format("%.2f", filme.getPreco2()));
											System.out.println("|");
											System.out.println("| Total Pago: R$"+String.format("%.2f", filme.getPreco2()));
											System.out.println("| Bom Filme");
											System.out.println("|---------------------------------------------------------");
											limpaTela(2);
											System.out.println("> Acima o comprovante de pagamento");
											limpaTela(2);
											
										}else {
											System.out.println("|");
											System.out.println("| Ingresso do filme: "+filme.getNome());
											System.out.println("| Horário da sessão: "+filme.getHorario());
											System.out.println("| Preço do ingresso: R$"+String.format("%.2f", filme.getPreco1()));
											System.out.println("| Desconto: R$00.00");
											System.out.println("|");
											System.out.println("| Total Pago: R$"+String.format("%.2f", filme.getPreco1()));
											System.out.println("| Bom Filme");
											System.out.println("|---------------------------------------------------------");
											limpaTela(2);
											System.out.println("> Acima o comprovante de pagamento");
											limpaTela(2);
										}
									break;
									}
									case "2":{
										limpaTela(16);
										System.out.println("-----Você pagou com cartão de crédito----------------------");
										if(Integer.parseInt(clienteb.getIdade()) < 18 || Integer.parseInt(clienteb.getIdade()) >=65) {
											System.out.println("|");
											System.out.println("| Ingresso do filme: "+filme.getNome());
											System.out.println("| Horário da sessão: "+filme.getHorario());
											System.out.println("| Preço do ingresso: R$"+String.format("%.2f", filme.getPreco1()));
											System.out.println("| Desconto: R$"+String.format("%.2f", filme.getPreco2()));
											System.out.println("|");
											System.out.println("| Total Pago: R$"+String.format("%.2f", filme.getPreco2()));
											System.out.println("| Bom Filme");
											System.out.println("|---------------------------------------------------------");
											limpaTela(2);
											System.out.println("> Acima o comprovante de pagamento");
											limpaTela(2);
										}else {
											System.out.println("|");
											System.out.println("| Ingresso do filme: "+filme.getNome());
											System.out.println("| Horário da sessão: "+filme.getHorario());
											System.out.println("| Preço do ingresso: R$"+String.format("%.2f", filme.getPreco1()));
											System.out.println("| Desconto: R$00.00");
											System.out.println("|");
											System.out.println("| Total Pago: R$"+String.format("%.2f", filme.getPreco1()));
											System.out.println("| Bom Filme");
											System.out.println("|---------------------------------------------------------");
											limpaTela(2);
											System.out.println("> Acima o comprovante de pagamento");
											limpaTela(2);
										}
										break;
										}
									default:{
										limpaTela(15);
										System.out.println("Opção de Pagamento invalida");
										limpaTela(2);
										break;
										}
								}
								
								break;
							}	
							case "4":{
									
								break;
							}	
							case "5":{
								
								limpaTela(180);
								break;
							}
							case "6":{
								vendaIngressos = false;
								limpaTela(50);
								
								
								break;
							}
					
						}
					}
			}
					
				case "5":{
					limpaTela(180);
					break;
				}
				case "6":{
					rodando = false;
					limpaTela(50);
					System.out.print("Saindo do Sistema em: ");
					
					for(int i = 10; i >= 0; i--) {
						System.out.print(" "+i);
					}
					limpaTela(2);
					System.out.println("Saiu com sucesso do sistema");
					break;
				}
		}
			
		}
		teclado.close();
		
		
		// mostrar valores 
		
			
		

	}
	public static void limpaTela(int n1) {
		final String os = System.getProperty("os.name");
		if(os.contains("Linux")) {
			try {
				for(int i = 0; i < n1; i++) {
				Runtime.getRuntime().exec("clear");
				System.out.println(" ");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				for(int i = 0; i < n1; i++) {
				Runtime.getRuntime().exec("cls");
				System.out.println(" ");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
