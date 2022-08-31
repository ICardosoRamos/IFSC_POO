package ex11;

import java.util.ArrayList;
import java.util.Random;


public class Exercicio11 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		
		Double maior = 0.0;
		Double menor = 5000.0;

		double min = 1000;
		double max = 5000;

		Random r = new Random();
		for (int i = 0; i < 100; i++) {

			double randomValue = min + (max - min) * r.nextDouble();
			list.add(randomValue);
		}
		
		for (Double item : list) {
			if(item > maior) {
				maior = item;
			}
			if(item < menor) {
				menor = item;
			}
		}
		
		System.out.println(maior);
		System.out.println(menor);
		

	}

}
