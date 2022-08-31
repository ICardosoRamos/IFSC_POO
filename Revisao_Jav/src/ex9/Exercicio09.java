package ex9;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> listString = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			listString.add(scanner.nextLine());
		}

		System.out.println("Imprimindo a lista");

		for (String item : listString) {
			System.out.println(item);
		}

		System.out.println("Tamanho da lista: " + listString.size());

		if (!(listString.size() > 0)) {
			System.out.println("A lista esta vazia");
		}

		scanner.close();
	}

}
