package Aula8;

public class Roupa extends Produto implements VendaEspecial {

private	String tipo;
private	String tamanho;
Produto produto;

public Roupa() {}

@Override
public String toString() {
	return "Tipo  de roupa =" + tipo + 
			"Tamanho da roupa =" + tamanho + 
			"Código de barras da roupa  =" + produto.getCodigoBarra() +
			"Marca da roupa =" + produto.getMarca() +
			"Preço do produto =" + produto.getPreco() +
			"Quantidade de  produtos =" + produto.getQuantidade();
			
}

@Override
public float vender(int quantidade) {
	
	if(tipo =="casaco" || tipo =="Casaco" ||tipo =="blusão" || tipo =="Blusão" || tipo =="blusao"  ) {
		return (float) ((quantidade * produto.getPreco()) + 0.20);		
	}else 
		return quantidade * produto.getPreco();
}

@Override
public float sobMedida(int quantidade) {
	
	if(getQuantidade() > 500 ) {
		return (float) (getPreco() + 0.75);
	}else if (getQuantidade() > 100 ) {
		return (float) (getPreco() + 0.50);
	}else if (getQuantidade() < 100 ) {
		return (float) (getPreco() + 0.25);
	}else
		return getPreco();
}
//• Se a quantidade for maior do que 500 o desconto é de 75%
//• Se a quantidade for maior do que 100 e menor que 500 o desconto é de 50%
//• Se a quantidade for menor do que 100 o desconto é de 25%


@Override
public float queimaEstoque() {
	if(getQuantidade() > 100 ) {
		return (float) (getPreco() + 0.15);
	}else if (getQuantidade() < 100 ) {
		return (float) (getPreco() + 0.25);
	}else
	return getPreco();
}
//• Se a quantidade for maior do que 100 o valor aumenta em 15%
//• Se a quantidade for menor do que 100 o valor aumenta em 25%

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