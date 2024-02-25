package Aula4;

public class Endereco {
	private	String nomeRua;
	private	String cidade;
	private	String bairro;		
	private String complemento;
	private char uf;	
	private long cep;

	public Endereco() {}
	public Endereco(String nomeRua, String cidade, String bairro, String complemento, char uf, long cep) {
		super();
		this.nomeRua = nomeRua;
		this.cidade = cidade;
		this.bairro = bairro;
		this.complemento = complemento;
		this.uf = uf;
		this.cep = cep;
	}

	public String getNomeRua() {
		return nomeRua;
	}
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public char getUf() {
		return uf;
	}
	public void setUf(char uf) {
		this.uf = uf;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}		
}