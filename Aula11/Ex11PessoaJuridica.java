package Aula11;

public abstract class Ex11PessoaJuridica {

	private String nome;
	private String razaoSocial;
	private long CNPJ;
	
	
	
	public Ex11PessoaJuridica() {}
	public Ex11PessoaJuridica(String nome, String razaoSocial, long CNPJ) {
		this.nome = nome;
		this.razaoSocial = razaoSocial;
		this.CNPJ = CNPJ;
	}
	@Override
	public String toString() {
		return "\n Nome da empresa = " + nome + 
			   "\n Razão Social  da empresa =" + razaoSocial + 
			   "\n CNPJ da Emperesa=" + CNPJ;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public long getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(long CNPJ) {
		this.CNPJ = CNPJ;
	}
}