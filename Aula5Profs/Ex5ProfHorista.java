package Aula5Profs;

public class Ex5ProfHorista extends Ex5Professor{
private float salHora;
private int totalHora;


public Ex5ProfHorista() { //String nome, string matricula, int idade
	super();	// TODO Auto-generated constructor stub
}

public Ex5ProfHorista(String nome, String matricula, int idade,float salHora, int totalHora) { 
	super(nome, matricula, idade);
	this.salHora = salHora;
	this.totalHora = totalHora;
}

@Override
public float retornaSalario() {	// TODO Auto-generated method stub
	return (float) (salHora * totalHora  - 0.5);
}

public float getSalHora() {
	return salHora;
}
public void setSalHora(float salHora) {
	this.salHora = salHora;
}
public int getTotalHora() {
	return totalHora;
}
public void setTotalHora(int totalHora) {
	this.totalHora = totalHora;
}
}