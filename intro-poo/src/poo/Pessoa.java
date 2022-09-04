package poo;

public class Pessoa {
	String Nome;
	String CPF;
	Integer Idade;
	
	public Pessoa(String nome, String cpf, Integer idade) {
		super();
		Nome = nome;
		CPF = cpf;
		Idade = idade;
	}
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		this.CPF = cPF;
	}
	public Integer getIdade() {
		return Idade;
	}
	public void setIdade(Integer idade) {
		this.Idade = idade;
	}
}
