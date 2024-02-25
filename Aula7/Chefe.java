package Aula7;

import java.util.Objects;

public class Chefe extends Pessoa {

private	String nivelHierarquia;
private	float salario;
private	float  bonus;
private Pessoa pessoa;


    public Chefe() {}
	public Chefe(String setor,String nivelHierarquia ,float salario, float bonus, Pessoa pessoa) {
	super();
	this.nivelHierarquia = nivelHierarquia;
    this.bonus = bonus;
	this.salario = salario;
	this.pessoa = pessoa;
}	
	public float calcularSalario() {
		if(nivelHierarquia == "Presidente" || nivelHierarquia == "presidente") {
			return salario = (float) (bonus + 0.25);
		}
		return salario;
		
	}

/*O salário do chefe terá um acréscimo de 
 * 	 * acordo com o bônus informado além de
um acréscimo de 25% se o nível hierárquico for “presidente”.
	 * 
	 */
	
	@Override
	public String toString() {
		return "Nome do chefe:"+pessoa.getNome()+
				"RG do chefe:"+pessoa.getRg()+
				"CPF do chefe:"+pessoa.getCpf()+
				"Nível de hierarquia do chefe:"+nivelHierarquia+
				"Bônus do chefe:"+bonus+
				"Salário do chefe: " + salario;
	}	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chefe chefe = (Chefe) obj;
		return Objects.equals(pessoa.getCpf(), chefe.pessoa.getCpf()) &&
			   Objects.equals(pessoa.getRg(), chefe.pessoa.getRg());
	}	
	

	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getNivelHierarquia() {
		return nivelHierarquia;
	}
	public void setNivelHierarquia(String nivelHierarquia) {
		this.nivelHierarquia = nivelHierarquia;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}