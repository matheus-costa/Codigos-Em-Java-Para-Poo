package Aula8;

public class Acessorio extends Produto {

	private	String tipo;
	private	String tamanho;
	Produto produto;
	
	@Override
	public String toString() {
		return "Tipo de acessório =" + tipo + 
				"Tamanho do acessória =" + tamanho + 
				"Código de barras do produto =" + produto.getCodigoBarra() +
			    "Marca do produto =" + produto.getMarca() +
			    "Preço do produto =" + produto.getPreco() +
			    "Quantidade de produtos =" + produto.getQuantidade();
	}

	@Override
	public float vender(int quantidade) {
		if(tipo == "OURO" || tipo == "Ouro" ||tipo == "Ouro" ) {
			return (float) ((quantidade * produto.getPreco()) + 0.50);
		}else
		return quantidade * produto.getPreco();
	}
//Acessórios: Se o acessório for de 
//material “ouro” tem um acréscimo de 50% no valor.	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
}