package Aula5Profs;

public class Ex5ProfRegime extends Ex5Professor{
private float salario;


public Ex5ProfRegime() { //String nome, string matricula, int idade
	super();	
}

public Ex5ProfRegime(String nome,String matricula, int idade,float salario) { //String nome, string matricula, int idade
	super(nome, matricula, idade);
	this.salario = salario;
}
@Override
public float retornaSalario() {
		return salario = salario - 0.12f;
	}


public float getSalario() {
	return salario;
}
public void setSalario(float salario) {
	this.salario = salario;
}


}
