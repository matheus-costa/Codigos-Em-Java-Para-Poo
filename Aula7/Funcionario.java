package Aula7;

import java.util.Objects;

public class Funcionario extends Pessoa{
     
	private	String setor;
	private	float salario;
	private	int id;
	private	int cargaHoraria;
	private Pessoa pessoa;


	public Funcionario() { }
    public Funcionario(String setor, float salario, int id, int cargaHoraria, Pessoa pessoa) {
		super();
		this.setor = setor;
		this.salario = salario;
		this.id = id;
		this.cargaHoraria = cargaHoraria;
		this.pessoa = pessoa;
	}
	public float calcularSalario() {
		if(cargaHoraria > 30) {
			return salario = (float) (salario + 0.15);
		}
		return salario;		
	} 
    /*O salário do funcionário terá um acréscimo de 15% 
     * se a carga horária semanal for maior do que 30 horas.
     * 
     */ 
		@Override
		public String toString() {
			return "Nome do funcionário:"+pessoa.getNome()+
					"RG do funcionário:"+pessoa.getRg()+
					"CPF do funcionário:"+pessoa.getCpf()+
					"Setor do funcionário: " + setor +
					"Salário do funcionário: " + salario + 
					"Id  do funcionário: " + id + 
					"Carga horária do funcionário: " + cargaHoraria;
		}	
		
		@Override
		public int hashCode() {
			return Objects.hash(pessoa);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
		    Funcionario funcionario = (Funcionario) obj;
		    return Objects.equals(pessoa.getCpf(),funcionario.pessoa.getCpf()) &&
					   Objects.equals(pessoa.getRg(), funcionario.pessoa.getRg());

		}
		
		public Pessoa getPessoa() {
			return pessoa;
		}
		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}
		public String getSetor() {
			return setor;
		}
		public void setSetor(String setor) {
			this.setor = setor;
		}
		public float getSalario() {
			return salario;
		}
		public void setSalario(float salario) {
			this.salario = salario;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getCargaHoraria() {
			return cargaHoraria;
		}
		public void setCargaHoraria(int cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}
	
}