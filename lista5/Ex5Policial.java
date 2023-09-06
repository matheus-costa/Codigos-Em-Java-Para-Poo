package Aula5;

public class Ex5Policial extends Ex5Funcionario{
private int id;
private float bonusPericulosidade;


public Ex5Policial() {
	super();	// TODO Auto-generated constructor stub
}
public Ex5Policial(String nome, long cpf, long rg, float salarioHora, float cargaHoraria, int tempoSalario) {
	super(nome, cpf, rg, salarioHora, cargaHoraria, tempoSalario);	// TODO Auto-generated constructor stub
}

@Override
public float calcularSalario() {
	return (getCargaHoraria() * getSalarioHora()) + bonusPericulosidade;	
}
public float horasTrabalhadas() {	
	return getCargaHoraria() * getTempoServico();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getBonusPericulosidade() {
	return bonusPericulosidade;
}
public void setBonusPericulosidade(float bonusPericulosidade) {
	this.bonusPericulosidade = bonusPericulosidade;
}
}