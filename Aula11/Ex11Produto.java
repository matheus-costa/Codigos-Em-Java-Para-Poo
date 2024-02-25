package Aula11;

public class Ex11Produto {
   
	private String nome;
	private float preco;
	
	
	public Ex11Produto() {}
	public Ex11Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}	
	@Override
	public String toString() {
		return "\n nome do produto =" + nome + 
			   "\n preço do produto =" + preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
}