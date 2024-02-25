package Aula7;

public class Pessoa {
	
   private  String nome;
   private  long cpf;
   private  long rg;
   
   
public Pessoa() { }
public Pessoa(String nome, long cpf, long rg) {
	super();
	this.nome = nome;
	this.cpf = cpf;
	this.rg = rg;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public long getCpf() {
	return cpf;
}
public void setCpf(long cpf) {
	this.cpf = cpf;
}
public long getRg() {
	return rg;
}
public void setRg(long rg) {
	this.rg = rg;
}
}