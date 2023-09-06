package Aula5Profs;

public abstract class Ex5Professor {
    String nome;
	String matricula;
	int idade; //String nome, string matricula, int idade
	
	public abstract float retornaSalario();
	
	public Ex5Professor() {
		super();
	}
	public Ex5Professor(String nome, String matricula, int idade) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}
}