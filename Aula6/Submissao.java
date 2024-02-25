package Aula6;

public class Submissao {
	
private String titulo;
private int situacao;
private int total;
private final int aprovado = 1;
private final int rejeitado = 2;
private final int alteracoes = 3;


public Submissao() {}
public Submissao(String titulo, int situacao, int total) {
	super();
	this.titulo = titulo;
	this.situacao = situacao;
	this.total = total;
}

@Override
public String toString() {
	return "Titulo da Submissão =" + titulo + 
		   "situação da submissão =" + situacao + 
		   "total de submissões =" + total;
}
public String avaliar(int situacao) {
	if(aprovado == situacao) {
		return "Teras que realizar alterações";
	}else if (rejeitado == situacao) {	
		return "Teras que realizar alterações";
		
	}else return "Teras que realizar alterações";
}

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getSituacao() {
	return situacao;
}
public void setSituacao(int situacao) {
	this.situacao = situacao;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getAprovado() {
	return aprovado;
}
public int getRejeitado() {
	return rejeitado;
}
public int getAlteracoes() {
	return alteracoes;
}

}