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
		String opcao = "";
		int autoIdGerador = -1;
		
		boolean rodando = true;
		while(rodando) {
			if(autoIdGerador < 0) {
				autoIdGerador = 0;
			}else {
				autoIdGerador++;
			}
			
			
			System.out.println("========= Sistema Gerente Banco 1.0 ===========");
			System.out.println("| [1] Cadastros                               |");
			System.out.println("| [2] Consultas                               |");
			System.out.println("| [3] Atualizações                            |");
			System.out.println("| [4] Venda de Igressos                       |");
			System.out.println("| [5] Limpar a Tela                           |");
			System.out.println("| [6] Sair                                    |");
			System.out.println("===============================================");
			System.out.print("Digite opção desejada:");
			opcao = sc.nextLine();
		
			switch (opcao) {
			case "1":{
				limpaTela(2);
				//System.out.print("Digite id do Funcionario: ");
				int id = autoIdGerador; //sc.nextInt();
				//sc.nextLine();
				System.out.print("Digite nome do Funcionario: ");
				String nome = sc.nextLine();
				System.out.print("Digite cargo do Funcionario: ");
				String cargo = sc.nextLine();
				System.out.print("Digite salario bruto do Funcionario: ");
				double salarioBruto = sc.nextDouble();
				limpaTela(15);
				sc.nextLine();
				funcionario = new Funcionario(id, nome, salarioBruto, cargo);
				
				funcionarios.add(funcionario);
				for(int i = 0; i < funcionarios.size(); i++) {
					Funcionario funcio = funcionarios.get(i);
					System.out.println("================================================");
					System.out.println("| id : "+funcio.getId());
					System.out.println("| Nome do Funcioário : "+funcio.getNome());
					System.out.println("| Cargo : "+funcio.getCargo());
					System.out.println("| Salário Bruto R$: "+String.format("%.2f", funcio.getSalarioBruto()));
					System.out.println("================================================");
					}
				limpaTela(4);
				
				break;
			}
			case "2":{
				
				break;
			}
			case "6":{
					rodando = false;
				break;
			}
			default : {
					limpaTela(2);
					System.out.println("Opção invalida");
					limpaTela(2);
				break;
			
			}
		}
		
		
		

	}
		sc.close();
	}
	public static void limpaTela(int n1) {
		
		for(int i = 0; i < n1; i++) {
			System.out.println(" ");
			}
		
	}

	
	
}
