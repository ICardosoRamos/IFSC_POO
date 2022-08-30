package ex6;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double[] salario = new Double[10];

		for (int i = 0; i < salario.length; i++) {
			salario[i] = scanner.nextDouble();
		}
		
		Boolean a = true;
		
		while(a == true) {
			a = false;
			for (int i = 0; i < salario.length - 1; i++) {
				if(salario[i] > salario[i+1]) {
					Double aux = salario[i];
					salario[i] = salario[i+1];
					salario[i+1] = aux;
					a = true;
				}
			}
			
		}
		
		System.out.println("salarios em ordem crescente");
		
		for (int i = 0; i < salario.length; i++) {
			System.out.println(salario[i]);
		}
		
		Boolean b = true;
		
		while(b == true) {
			b = false;
			for (int i = 0; i < salario.length - 1; i++) {
				if(salario[i] < salario[i+1]) {
					Double aux = salario[i];
					salario[i] = salario[i+1];
					salario[i+1] = aux;
					b = true;
				}
			}
			
		}
		
		System.out.println("salario em ordem decrescente");
		
		for (int i = 0; i < salario.length; i++) {
			System.out.println(salario[i]);
		}
		
		scanner.close();

	}

}