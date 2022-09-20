package poo;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Aluno> listAlunos = new ArrayList<Aluno>();
		ArrayList<Professor> listProfessor = new ArrayList<Professor>();

		for (int i = 0; i < 3; i++) {
			Professor professor = new Professor();
			System.out.println("Cadastrando " + i + 1 + "º Professor...");
			professor.setNome(sc.nextLine());
			professor.setDataNasc(LocalDate.ofEpochDay(Long.valueOf(sc.nextLine())));
			professor.setCpf(Long.valueOf(sc.nextLine()));
			professor.setSiape(Long.valueOf(sc.nextLine()));
			listProfessor.add(professor);
		}
		

		for (int i = 0; i < 3; i++) {
			Aluno aluno = new Aluno();
			System.out.println("Cadastrando " + i + 1 + "º Aluno...");
			aluno.setNome(sc.nextLine());
			aluno.setDataNasc(LocalDate.ofEpochDay(Long.valueOf(sc.nextLine())));
			aluno.setCpf(Long.valueOf(sc.nextLine()));
			aluno.setMatricula(Long.valueOf(sc.nextLine()));
			listAlunos.add(aluno);
		}
		


		sc.close();

	}

}
