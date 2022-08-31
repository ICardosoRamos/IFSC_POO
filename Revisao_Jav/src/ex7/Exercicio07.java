package ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		List<Double> salarios1 = new ArrayList<Double>();

		for (int i = 0; i < 10; i++) {
			salarios1.add(scanner.nextDouble());
		}

		System.out.println("Imprimindo salarios em ordem crescente");

		Collections.sort(salarios1);
		System.out.println(salarios1);
		System.out.println("pronto");

		System.out.println("Imprimindo salarios em ordem decrescente");

		Collections.sort(salarios1, Collections.reverseOrder());
		System.out.println(salarios1);

		scanner.close();

	}

}
