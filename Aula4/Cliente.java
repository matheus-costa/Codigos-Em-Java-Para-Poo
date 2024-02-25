package Aula4;

public class Cliente {
	
private String nome;
private long telefone;
private int cpf;
private Endereco endereco;

public Cliente() {	}
public Cliente(String nome, long telefone, int cpf, Endereco endereco) {
	super();
	this.nome = nome;
	this.telefone = telefone;
	this.cpf = cpf;
	this.endereco = endereco;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public long getTelefone() {
	return telefone;
}
public void setTelefone(long telefone) {
	this.telefone = telefone;
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
}