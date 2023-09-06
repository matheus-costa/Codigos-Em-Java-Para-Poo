package Aula5;

public abstract class Ex5Funcionario extends Ex5Pessoa{
	
     private float salarioHora;
     private float cargaHoraria;
     private int tempoServico;
              
	public Ex5Funcionario(){
		super();
	}	
	public Ex5Funcionario(String nome, long cpf, long rg, float salarioHora, float cargaHoraria, int tempoSalario) {
		super(nome, cpf, rg);
	  this.cargaHoraria = cargaHoraria;
	  this.salarioHora = salarioHora;
	  this.tempoServico = tempoSalario;
	}
	
	public abstract float calcularSalario();// MÉTODO ABSTRATO, vai ser implementado pelas classes especializadas

	public float horasTrabalhadas() { //método normal
		return cargaHoraria + tempoServico;
	}
	
	public float getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(float salarioHora) {
		this.salarioHora = salarioHora;
	}
	public float getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(float cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public int getTempoServico() {
		return tempoServico;
	}
	public void setTempoSalario(int tempoServico) {
		this.tempoServico = tempoServico;
	}
}
