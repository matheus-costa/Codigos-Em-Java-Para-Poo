package Aula6;

import java.util.Date;

public class MiniCurso extends Submissao {

private int horas;
private int numeroMiniCurso;
private Date data;
private Date horaInicio;
private Date horaFim;
private Submissao submissao;


public MiniCurso() {}
public MiniCurso(int horas, int numeroMiniCurso, Date data, Date horaInicio, Date horaFim) {
	super();
	this.horas = horas;
	this.numeroMiniCurso = numeroMiniCurso;
	this.data = data;
	this.horaInicio = horaInicio;
	this.horaFim = horaFim;
}



@Override
public String toString() {
	return "Titulo do Mini Curso:"+submissao.getTitulo()+
			"Informa o total de Mini cursos:"+submissao.getTotal()+
			"Informe a situação do Mini Curso: 1- Aprovado, 2-rejeitado, 3- alterações: "+submissao.getSituacao()+
			"Carga horária do Mini Curso horas:" + horas + 
			"numero MiniCurso: " + numeroMiniCurso + 
			"Data do minicurso:" + data + 
			"Hora de Inicio do mini curso:"+ horaInicio + 
			"Hora do Fim do mini curso:" + horaFim;
}
public float incrementarNumeroMiniCurso() {
	return numeroMiniCurso = numeroMiniCurso + 1;
}

public int getHoras() {
	return horas;
}
public void setHoras(int horas) {
	this.horas = horas;
}
public int getNumeroMiniCurso() {
	return numeroMiniCurso;
}
public void setNumeroMiniCurso(int numeroMiniCurso) {
	this.numeroMiniCurso = numeroMiniCurso;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public Date getHoraInicio() {
	return horaInicio;
}
public void setHoraInicio(Date horaInicio) {
	this.horaInicio = horaInicio;
}
public Date getHoraFim() {
	return horaFim;
}
public void setHoraFim(Date horaFim) {
	this.horaFim = horaFim;
}
	
}