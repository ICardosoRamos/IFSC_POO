package ex3;
import java.util.Scanner;

public class Exercicio03 {
	
	public static Double CalculaGasosa(Double precoLitro, Double qntLitro) {
		
		return precoLitro * qntLitro;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("BEM VINDO...\nINFORME O PRE�O DO LITRO E A QUANTIDADE DE LITROS A SER ABASTECIDA...");
		Double precoLitro = scanner.nextDouble();
		Double qntLitro = scanner.nextDouble();
		String a = "";
		if(precoLitro != null && qntLitro != null) {
			a = (CalculaGasosa(precoLitro, qntLitro)).toString();
		}
		
		System.out.println(a);
		
		
		
		scanner.close();
		
	}

}
