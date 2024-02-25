package Aula8;

public abstract class Produto {
	
private  String marca;
private  float preco;
private  int codigoBarra;
private  int quantidade;

public Produto() {}

public abstract float vender (int quantidade);
public void reabastecer(int quantidade) {
	
}


public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public int getCodigoBarra() {
	return codigoBarra;
}
public void setCodigoBarra(int codigoBarra) {
	this.codigoBarra = codigoBarra;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

}