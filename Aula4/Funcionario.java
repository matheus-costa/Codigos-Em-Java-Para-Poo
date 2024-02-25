package Aula4;

public class Funcionario {
	
private String nome;
private String setor;
private String cargo;
private long ramal;
private int mattricula;
private Endereco endereco;

public Funcionario() {}
public Funcionario(String nome, String setor, String cargo, long ramal, int mattricula, Endereco endereco) {
	super();
	this.nome = nome;
	this.setor = setor;
	this.cargo = cargo;
	this.ramal = ramal;
	this.mattricula = mattricula;
	this.endereco = endereco;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSetor() {
	return setor;
}
public void setSetor(String setor) {
	this.setor = setor;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public long getRamal() {
	return ramal;
}
public void setRamal(long ramal) {
	this.ramal = ramal;
}
public int getMattricula() {
	return mattricula;
}
public void setMattricula(int mattricula) {
	this.mattricula = mattricula;
}
public Endereco getEndereco() {
	return endereco;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
}