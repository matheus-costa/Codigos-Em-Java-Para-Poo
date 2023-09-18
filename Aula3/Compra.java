package Aula3;

public class Compra extends Produto{

private	String produto;
private int parcelas;
private	float preco;
private	float juros;
private	float frete;

public Compra() {}
public Compra(String produto, int parcelas, float preco, float juros, float frete) { 
	this.produto = produto;
	this.parcelas = parcelas;
	this.preco = preco;
	this.juros = juros;
	this.frete = frete;
}

public float calculaJuros() {
	return preco + frete;
	
}
public float calculaFrete() {
	if(preco > 100) {
		return frete/2;
	}else if(preco > 500 ){
		return frete/2;
	}else
		return frete = 0;
}

public float precoParcelas() {
	if(parcelas >= 1 && parcelas < 13) {
	  if(parcelas <6) {
		  return preco;
		  
	  }else if(parcelas > 5 && parcelas < 11 ) {
			return (float) (preco + (0.10));
	  }else
		
		return (float) (preco + (0.20));		
	}	
	return preco;
}

public float precoFinal() {
	return (preco + juros) + (frete + getQuantidade());
}
public String getProduto() {
	return produto;
}
public void setProduto(String produto) {
	this.produto = produto;
}
public int getParcelas() {
	return parcelas;
}
public void setParcelas(int parcelas) {
	this.parcelas = parcelas;
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public float getJuros() {
	return juros;
}
public void setJuros(float juros) {
	this.juros = juros;
}
public float getFrete() {
	return frete;
}
public void setFrete(float frete) {
	this.frete = frete;
}
}

/*6. Regras de negócio:
• Só é possível comprar se o produto estiver em estoque ( quantidade > 0).
• Calculo de preço final:
• O juros é aplicado sobre o valor total (preço + frete) do produto.

• Parcelas:
• O parcelamento padrão é de 1x e o máximo é de 12x.
• Para compras em até 5x o juros é zero.
• Para compras de 6x até 10x o juros é simples de 10%.
• Para compras com parcelamento maior do que 10x o juros é simples de 20% .

• Frete:
• O valor padrão do frete é de R$ 50,00.
• Para compra de produto com valor maior do que R$ 100,00, o valor do frete cai pela
metade.
• Para compra de produto com valor maior do que R$ 500,00 o frete é gratuito.
 * /
 */