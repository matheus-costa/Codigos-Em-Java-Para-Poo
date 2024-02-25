package Aula6;

public class Autor {

	private String nome;
	private String email;
	private long celular;


	public Autor() {}
	public Autor(String nome, String email, long celular) {
		super();
		this.nome = nome;
		this.email = email;
		this.celular = celular;
	}  
	
	@Override
	public String toString() {
		return "Nome do autor =" + nome +
			   "email do autor =" + email + 
			   "número de celular do autor =" + celular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
}
}