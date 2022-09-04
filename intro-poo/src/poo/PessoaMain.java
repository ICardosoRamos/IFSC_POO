package poo;

import java.util.ArrayList;

public class PessoaMain {

	public static void main(String[] args) {
		ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>();
		
		Pessoas.add(new Pessoa("Nathalya", "5646541", 5));
		Pessoas.add(new Pessoa("Julio", "5646541", 5));
		Pessoas.add(new Pessoa("Thalyta", "5646541", 5));
		Pessoas.add(new Pessoa("Rosangela", "5646541", 5));
		Pessoas.add(new Pessoa("André", "5646541", 5));
		
		Pessoas.forEach(t -> {
			System.out.println(t.Nome);
			System.out.println(t.CPF);
			System.out.println(t.Idade);
		});
	}

}
