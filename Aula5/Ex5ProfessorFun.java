package Aula5;

public class Ex5ProfessorFun extends Ex5Funcionario{
private int matricula;
private String area;
private String formacao;


public Ex5ProfessorFun() {
	super();// TODO Auto-generated constructor stub
}
public Ex5ProfessorFun(String nome,String area, String formacao, long cpf, long rg, float salarioHora,
		               float cargaHoraria, int tempoSalario, int matricula) {
	super(nome, cpf, rg, salarioHora, cargaHoraria, tempoSalario);
	this.area = area;
	this.formacao = formacao;
	this.matricula = matricula;
}
@Override
public float calcularSalario() {
	if(formacao == "Doutorado" || formacao == "doutorado") {
		return (getSalarioHora()  * getCargaHoraria() + 0.40f);
	}else if(formacao == "Mestrado"|| formacao == "mestrado") {
		return  (getSalarioHora() * getCargaHoraria() + 0.20f);
	}else 
	return getSalarioHora()  * getCargaHoraria() ;
}
public float horasTrabalhadas() {	
	return getCargaHoraria() * getTempoServico();
}

 int getMatricula() {
	return matricula;
}
public void setMatricula(int matricula) {
	this.matricula = matricula;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getFormacao() {
	return formacao;
}
public void setFormacao(String formacao) {
	this.formacao = formacao;
}
}
