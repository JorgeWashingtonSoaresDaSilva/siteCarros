package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta ;
		System.out.println("------------------------------------------------------------------------");
		System.out.println("|                            Abrir uma conta                           |");
		System.out.println("------------------------------------------------------------------------");
		System.out.print("| Digite numero da conta: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("| Digite nome do titular da conta: ");
		String nome = sc.nextLine();
		System.out.print("| Deseja fazer um depósito inicial (s/n) ");
		char reposta = sc.next().charAt(0);
		if(reposta == 's') {
			System.out.print("| informe o valor do depósito inicial R$: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(num, nome, depositoInicial);
			
		}else {
			conta = new Conta(num, nome);
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("|                           Dados da conta                                        |");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(conta);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("| Informe a quantia para depósito: ");
		double depositoDaquantia = sc.nextDouble();
		conta.deposito(depositoDaquantia);
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("|                  Dados da conta atualizado                                      |");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(conta);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("| Informe a quantia para saque: ");
		double saqueDaquantia = sc.nextDouble();
		conta.saque(saqueDaquantia);
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("|                  Dados da conta atualizado                                      |");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(conta);
		System.out.println("-----------------------------------------------------------------------------------");
		
		
		sc.close();

	}

}
