package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class FUNCOES {

	ArrayList<Pessoa> listPessoas = new ArrayList<Pessoa>();

	Scanner sc = new Scanner(System.in);

	public void Cadastrar() {
		String nome = sc.next();
		String cpf = sc.next();
		Integer idade = sc.nextInt();
		listPessoas.add(new Pessoa(nome, cpf, idade));
	}

	public void Atualizar() {
		System.out.println(
				"Você está prestes a atualizar todos os dados."
				+ "\nAgora digite seu nome para verificar se existe registro");
		String nome = sc.next();
		listPessoas.forEach(pessoa -> {
			if ((pessoa.Nome).equals(nome)) {
				System.out.println("Digite respectivamente os "
						+ "novos dados que deseja...(nome, cpf e idade)");
				String newName = sc.next();
				String newCpf = sc.next();
				Integer newIdade = sc.nextInt();
				pessoa.Nome = newName;
				pessoa.CPF = newCpf;
				pessoa.Idade = newIdade;
				System.out.println("Dados atualizados com sucesso.");
				return;
			}
		});

	}

	public void Listar() {
		System.out.println("Listando pessoas cadastradas:\n");
		listPessoas.forEach(pessoa -> {
			System.out.println(pessoa.Nome);
			System.out.println(pessoa.CPF);
			System.out.println(pessoa.Idade);
			System.out.println("-------\n-------");
		});
	}

}
