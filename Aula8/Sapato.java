package Aula8;

public class Sapato extends Produto implements VendaEspecial {
	
private	String tipo;
private	int numero;
Produto produto;

@Override
public String toString() {
	return "Sapato tipo=" + tipo + 
			", número =" + numero + 
			", produto =" + produto.getCodigoBarra() +
			", produto =" + produto.getMarca() +
			", produto =" + produto.getPreco() +
			", produto =" + produto.getQuantidade();
}

public Sapato() {}

public float vender (int quantidade) {
	if(tipo == "Social" || tipo == "social") {
		return (float) ((quantidade * produto.getPreco()) + 0.15);
	}
	return quantidade * produto.getPreco();
}

@Override
public float sobMedida(int quantidade) {
	if(getQuantidade() > 200 ) {
	    return (float) (getPreco() + 0.20);	
	}else if(getQuantidade() < 200 ) {
		return (float) (getPreco() + 0.30);	
	}else
	return getPreco();
}
//• Se a quantidade for maior do que 200 o valor aumenta em 20%
//• Se a quantidade for menor do que 200 o valor aumenta em 30%
@Override
public float queimaEstoque() {
	if(getQuantidade() > 500 ) {
		return (float) (getPreco() + 0.60);	
	}else if (getQuantidade() > 100 ) {
		return (float) (getPreco() + 0.40);	
	}else if (getQuantidade() < 100 ) {
		return (float) (getPreco() + 0.25);	
	}
	return getPreco();
}
//• Se a quantidade for maior do que 500 o desconto é de 60%
//• Se a quantidade for maior do que 100 e menor do que 500 o desconto é de 40%
//• Se a quantidade for menor do que 100 o desconto é de 25%


public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

}