package Aula9;

public class Ex9CompromissoAge {
private String nome;
private String descricao;
private int dia;
private int mes;

public Ex9CompromissoAge() {//String nome e Descricao, int dia e mês
	
}
public Ex9CompromissoAge(String nome,String descricao, int dia, int mes) {
	this.nome = nome;
	this.descricao = descricao;
	this.dia = dia;
	this.mes= mes;
}

@Override
public String toString() {
	return "\nNome do compromisso =" + nome + 
			"\nDescrição do compromisso =" + descricao + 
			"\nDia do compromisso =" + dia + 
			"\nMês do compromisso =" + mes ;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public int getDia() {
	return dia;
}
public void setDia(int dia) {
	this.dia = dia;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
}
