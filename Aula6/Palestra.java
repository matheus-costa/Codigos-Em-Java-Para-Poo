package Aula6;

import java.util.Date;

public class Palestra extends Submissao {

private String descricao;	
private Date data;
private Date hora;
private int numeroPalestra;
private Submissao submissao;

public Palestra() {}
public Palestra(String descricao, Date data, Date hora, int numeroPalestra) {
	super();
	this.descricao = descricao;
	this.data = data;
	this.hora = hora;
	this.numeroPalestra = numeroPalestra;
}

@Override
public String toString() {
	return "Titulo da palestra:"+submissao.getTitulo()+
		   "Informa o total de palestras:"+submissao.getTotal()+
		   "Informe a situação da palestra: 1- Aprovado, 2-rejeitado, 3- alterações:"+submissao.getSituacao()+
		   "Descrição da paletestra:" + descricao + 
		   "Data da palestra:" + data +
		   "Hora da palestra:" + hora + 
		   "Numero de palestras:" + numeroPalestra;
}
public float incrementarNumeroPalestra() {
	return numeroPalestra +1;
}

public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public Date getHora() {
	return hora;
}
public void setHora(Date hora) {
	this.hora = hora;
}
public int getNumeroPalestra() {
	return numeroPalestra;
}
public void setNumeroPalestra(int numeroPalestra) {
	this.numeroPalestra = numeroPalestra;
}
	
}