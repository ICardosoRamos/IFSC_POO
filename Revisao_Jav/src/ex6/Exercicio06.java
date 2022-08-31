package ex6;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Double[] salarios = new Double[10];

		for (int i = 0; i < salarios.length; i++) {
			salarios[i] = scanner.nextDouble();
		}

		Boolean crescente = false;

		while (crescente == false) {
			crescente = true;
			for (int i = 0; i < salarios.length - 1; i++) {
				if (salarios[i] > salarios[i + 1]) {
					Double aux = salarios[i];
					salarios[i] = salarios[i + 1];
					salarios[i + 1] = aux;
					crescente = false;
				}
			}
		}

		System.out.println("Imprimindo vetor em ordem crescente...");

		for (int i = 0; i < salarios.length; i++) {
			System.out.println(salarios[i]);
		}

		Boolean decrescente = false;

		while (decrescente == false) {
			decrescente = true;
			for (int i = 0; i < salarios.length - 1; i++) {
				if (salarios[i] < salarios[i + 1]) {
					Double aux = salarios[i];
					salarios[i] = salarios[i + 1];
					salarios[i + 1] = aux;
					decrescente = false;
				}
			}
		}

		System.out.println("Imprimindo vetor em ordem decrescente...");

		for (int i = 0; i < salarios.length; i++) {
			System.out.println(salarios[i]);
		}

		scanner.close();

	}

}
