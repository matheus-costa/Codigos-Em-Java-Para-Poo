package Aula5;

public class Ex5Medico extends Ex5Funcionario{

private int crm;
private String area;
private boolean plantonista;


public Ex5Medico() {
	super();	// TODO Auto-generated constructor stub
}
public Ex5Medico(String nome, long cpf, long rg, float salarioHora, float cargaHoraria, int tempoServico) {
	super(nome, cpf, rg, salarioHora, cargaHoraria, tempoServico);	// TODO Auto-generated constructor stub
}

@Override //OVERRRIDE significa sobrescrita de método
public float calcularSalario() {
	if(plantonista = true) {
		return getCargaHoraria() * getSalarioHora() + 0.15f;
	}else
	return getCargaHoraria() * getSalarioHora();
	
}
public float horasTrabalhadas() {
	
	return getCargaHoraria() * getTempoServico();
}

public int getCrm() {
	return crm;
}
public void setCrm(int crm) {
	this.crm = crm;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public boolean isPlantonista() {
	return plantonista;
}
public void setPlantonista(boolean plantonista) {
	this.plantonista = plantonista;
}	
}