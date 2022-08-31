package ex10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] vetString = {"Amazônia", "Mata Atlântica", "Cerrado", "Caatinga", "Pampa", "Pantanal"};
		
		
		
		vetString[3] = null;
		
		
		for (int i = 0; i < vetString.length; i++) {
			System.out.println(vetString[i]);
			
		}
		
		
		
		
		scanner.close();

	}

}
