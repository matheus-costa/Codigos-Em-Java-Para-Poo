package Aula4;

public class Aluno {
	
private	String nome;
private	String matricula;
private	int cpf;
Endereco endereco;
Notas notas;

public Aluno() {}
public Aluno(String nome, String matricula, int cpf, Endereco endereco, Notas notas) {
	super();
	this.nome = nome;
	this.matricula = matricula;
	this.cpf = cpf;
	this.endereco = endereco;
	this.notas = notas;
}

public String mostrarsitucao() {
	if(notas.verificarSituacao() == true ) {
		return "Aprovado";
	}else
		return "reprovado";
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public int getCpf() {
	return cpf;
}

public void setCpf(int cpf) {
	this.cpf = cpf;
}

public Endereco getEndereco() {
	return endereco;
}

public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}

public Notas getNotas() {
	return notas;
}

public void setNotas(Notas notas) {
	this.notas = notas;
}
}
