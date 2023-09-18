package Aula3;

public class Produto {
private String nome;
private float peso;
private int codigo;
private int quantidade;

public Produto() {}
public Produto(String nome, float peso, int codigo, int quantidade) {
	this.nome = nome;
	this.peso = peso;
	this.codigo = codigo;
	this.quantidade = quantidade;	
}
public boolean retonaEstoque() {
	if(quantidade > 0) {
		return true;
	}else
		return false;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public float getPeso() {
	return peso;
}
public void setPeso(float peso) {
	this.peso = peso;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
}