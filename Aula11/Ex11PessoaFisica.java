package Aula11;

public abstract class Ex11PessoaFisica {

	private String nome;
    private long RG;
	private long CPF;
	
	
	
	public Ex11PessoaFisica() {}
	public Ex11PessoaFisica(String nome, long RG, long CPF) {
		this.nome = nome;
		this.RG = RG;
		this.CPF = CPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getRG() {
		return RG;
	}
	public void setRG(long RG) {
		RG = RG;
	}
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long CPF) {
		CPF = CPF;
	}
}