package ex8;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] vetString = new String[10];

		for (int i = 0; i < vetString.length; i++) {
			vetString[i] = scanner.nextLine();
		}

		for (int i = 0; i < vetString.length; i++) {
			System.out.println(vetString[i]);
		}

		System.out.println("Tamanho do vetor: " + vetString.length);

		System.out.println("Vetor na utima position");
		System.out.println(vetString[vetString.length - 1]);

		scanner.close();
	}

}
