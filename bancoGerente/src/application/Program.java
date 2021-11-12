package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Funcionario funcionario ;
		String opcao = "", simOunao = "";
		
		
		boolean rodando = true;
		while(rodando) {
			
			
			 
			
			
			System.out.println("========= Sistema Gerente Banco 1.0 ===========");
			System.out.println("| [1] Cadastros e Consulta                    |");
			System.out.println("| [2] Excluir Funcionarios                    |");
			System.out.println("| [3] Atualização                             |");
			System.out.println("| [4] Sair                                    |");
			System.out.println("===============================================");
			System.out.print("Digite opção desejada:");
			opcao = sc.nextLine();
		
			switch (opcao) {
			case "1":{
				if(funcionarios.isEmpty() ) {
						System.out.println(" Ainda não existe funcionarios cadastrados!!");
						System.out.print(" Deseja cadastrar S/N ");
						simOunao = sc.nextLine();
						if(simOunao.equals("s") || simOunao.equals("S")) {
							//System.out.println("Cadastrar");
							Funcionario.limpaTela(2);
							System.out.println("=================== Cadastros de Funcionario ================================");
							
							System.out.print("Digite nome do funcionario: ");
							String nome = sc.nextLine();
							System.out.print("Digite email do funcionario: ");
							String email = sc.nextLine();
							System.out.print("Digite salario bruto do funcionario: ");
							double salarioBruto = sc.nextDouble();
							Funcionario.limpaTela(15);
							sc.nextLine();
							funcionario = new Funcionario( nome, salarioBruto, email);
								System.out.println("=======================================================================");
							funcionarios.add(funcionario);
							for(int i = 0; i < funcionarios.size(); i++) {
								Funcionario funcio = funcionarios.get(i);
								
								System.out.println("| id : "+i);
								System.out.println("| Nome do Funcioário : "+funcio.getNome());
								System.out.println("| Email : "+funcio.getEmail());
								System.out.println("| Salário Bruto R$: "+String.format("%.2f", funcio.getSalarioBruto()));
								System.out.println("-----------------------------------------------------------------------");
							}
								
							System.out.println("Novo funcionario cadastrado com sucesso !");
							Funcionario.limpaTela(4);
							
						}if(simOunao.equals("n") || simOunao.equals("N")) {
							//System.out.println("menu inicial ");
							Funcionario.limpaTela(4);
						}
							
						
					}else {
						if(!funcionarios.isEmpty()) {
					
						System.out.println("========= Sistema Gerente Banco 1.0 ===========");
						System.out.println("| [1] Cadastrar Novo Funcionario              |");
						System.out.println("| [2] Consulta Funcionarios Ativo             |");
						System.out.println("| [3]                                         |");
						System.out.println("| [4] Sair                                    |");
						System.out.println("===============================================");
						System.out.print("Digite opção desejada:");
						opcao = sc.nextLine();
						switch(opcao) {
						case "1":{
							//System.out.println("Cadastrar");
							Funcionario.limpaTela(2);
							System.out.println("=================== Cadastros de Funcionario ================================");
							//System.out.print("Digite id do Funcionario: ");
							
							//sc.nextLine();
							System.out.print("Digite nome do funcionario: ");
							String nome = sc.nextLine();
							System.out.print("Digite email do funcionario: ");
							String email = sc.nextLine();
							System.out.print("Digite salario bruto do funcionario: ");
							double salarioBruto = sc.nextDouble();
							Funcionario.limpaTela(15);
							sc.nextLine();
							funcionario = new Funcionario(nome, salarioBruto, email);
							
							funcionarios.add(funcionario);
							System.out.println("=============================================================================");
							
							
							for(int i = 0; i < funcionarios.size(); i++) {
								Funcionario funcio = funcionarios.get(i);
								
								//System.out.println("============= Novo funcionario cadastrado com sucesso =======================");
								System.out.println("| id : "+i);
								System.out.println("| Nome do Funcioário : "+funcio.getNome());
								System.out.println("| Email : "+funcio.getEmail());
								System.out.println("| Salário Bruto R$: "+String.format("%.2f", funcio.getSalarioBruto()));
								System.out.println("-----------------------------------------------------------------------");
								}
							System.out.println("Novo funcionario cadastrado com sucesso !");
							Funcionario.limpaTela(4);
							break;
						}
						case "2":{
							if(!funcionarios.isEmpty()) {
								
								
								System.out.println("=================== Funcionaios ativos  ===============================");
							for(int i = 0; i < funcionarios.size(); i++) {
								Funcionario funcio = funcionarios.get(i);
								//System.out.println("=================== Funcionaios ativos  ==============================");
								System.out.println("| id : "+i);
								System.out.println("| Nome do Funcioário : "+funcio.getNome());
								System.out.println("| Cargo : "+funcio.getEmail());
								System.out.println("| Salário Bruto R$: "+String.format("%.2f", funcio.getSalarioBruto()));
								System.out.println("-----------------------------------------------------------------------");
								
								}
								Funcionario.limpaTela(4);
								
								
							}else {
								System.out.println(" não existe funcionarios cadastrados para excluir!!");
								System.out.println("escolha opçao 1 para cadastrar funcionario");
								
							}
								break;
						}
						case "3":{
							
							break;
						}
						case "4":{
							rodando = false;
						break;
						}
						default : {
							Funcionario.limpaTela(2);
							System.out.println("Opção invalida");
							Funcionario.limpaTela(2);
						break;
						}
						}
						}else {
							System.out.println(" não existe funcionarios cadastrados para excluir!!");
							System.out.println("escolha opçao 1 para cadastrar funcionario");
							
				
						
					
					}
			
			
				}
					break;
			}
					
			case "2":{
				
				if(funcionarios.isEmpty()) {
					System.out.println(" não existe funcionarios cadastrados para excluir!!");
					System.out.println("escolha opçao 1 para cadastrar funcionario");
					
					
				}else {
					System.out.println("=================== Funcionaios ativos  ===============================");
					for(int i = 0; i < funcionarios.size(); i++) {
						Funcionario funcio = funcionarios.get(i);
						//System.out.println("=================== Funcionaios ativos  ==============================");
						System.out.println("| id : "+i);
						System.out.println("| Nome do Funcioário : "+funcio.getNome());
						System.out.println("| Cargo : "+funcio.getEmail());
						System.out.println("| Salário Bruto R$: "+String.format("%.2f", funcio.getSalarioBruto()));
						System.out.println("-----------------------------------------------------------------------");
					
					}
					int id ;
					System.out.println("============ Informe id do Funcionaio para excluir =====================");
					id = sc.nextInt();
					sc.nextLine();
					if(id >= funcionarios.size()) {
					System.out.println("Id invalido ");	
					}else {
						Funcionario funcio = funcionarios.get(id);
						funcio = funcionarios.get(id);
							
							funcionarios.remove(id);
							System.out.println("============== Funcionaio excluido com sucesso =========================");
							System.out.println("| id : "+id);
							System.out.println("| Nome do Funcioário : "+funcio.getNome());
							System.out.println("| Cargo : "+funcio.getEmail());
							System.out.println("| Salário Bruto R$: "+String.format("%.2f", funcio.getSalarioBruto()));
							System.out.println("-----------------------------------------------------------------------");
							
						}	
				}
				
				break;
			}
			case "4":{
					rodando = false;
				break;
			}
			default : {
					Funcionario.limpaTela(2);
					System.out.println("Opção invalida");
					Funcionario.limpaTela(2);
				break;
			
			}
		}
		
		
		

	}
		sc.close();
	}
	

	
	
}
