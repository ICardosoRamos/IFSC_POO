package poo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FUNCOES listFunctions = new FUNCOES();
		
		System.out.println("Entrar no sistema?(responda com sim ou não");
		
		String iniciar = sc.nextLine();
		System.out.println(iniciar);
		
		while(iniciar.equals("Sim")) {
			System.out.println("Escolha uma opção:\n(0 - Sair\n1 - Cadastrar\n2 - Atualizar\n3 - Listar)");

			Integer opcaoEscolhida = sc.nextInt();
			
			if(opcaoEscolhida == 1) {
				System.out.println("Digite respectivamente o nome, cpf e a sua idade;");
				listFunctions.Cadastrar();
			}

			else if(opcaoEscolhida == 2) {
				listFunctions.Atualizar();
			}

			else if(opcaoEscolhida == 3) {
				listFunctions.Listar();
			}

			else if(opcaoEscolhida == 0) {
				iniciar = "não";
			}
			
			
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
