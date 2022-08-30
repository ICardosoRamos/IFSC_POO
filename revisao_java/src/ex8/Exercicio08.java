package ex8;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String[] vet = new String[10];
		
		Integer cont = 0;
		
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = scanner.nextLine();
			cont++;
		}
		
		
		

		System.out.println("Tamanho do Vetor: " + cont);
		
		Integer cont1 = 0;
		
		
		for (String item : vet) {
			if(item == "") {
				cont1++;
			}
		}
		if(cont1 == cont) {
			System.out.println("o vetor está vazio");
		}
		
		
		System.out.println("Exibindo dados após preenchimento");
		
		for (String item : vet) {
			System.out.println(item);
		}
		
		
		
		scanner.close();
		

	}

}
