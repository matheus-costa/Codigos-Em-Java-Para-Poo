package Aula11;

import java.util.ArrayList;
import java.util.List;

public  class Ex11Empresa extends Ex11PessoaJuridica implements Ex11Transacao {

	float caixa;
	float dividas;
	float receitas;
	
	
	List<Ex11Produto> produto = new ArrayList();
	List<Ex11Cliente> cliente = new ArrayList();
	List<Ex11Fornecedor> fornecedor = new ArrayList();
	Ex11Produto p1 = new Ex11Produto();
	
	public static final int AVISTA = 1;
	public static final int APRAZO = 2;
	
	public Ex11Empresa() {}
	public Ex11Empresa(List<Ex11Produto> produto,
			           List<Ex11Cliente> cliente,
			           List<Ex11Fornecedor> fornecedor) {
		super();
		this.produto = produto;
		this.cliente = cliente;
		this.fornecedor = fornecedor;
	}	
	@Override
	public String toString() {
		return  "\n caixa da empresa =" + getCaixa() + 
				"\n receita da empresa =" + getReceitas() + 
				"\n--------------------------------------"+
				"\n produtos desta empresa:" + produto.toString() + 
				"\n--------------------------------------"+
				"\n clientes desta empresa:" + cliente.toString()+ 
				"\n--------------------------------------"+
				"\n fornecedores deste empresa:" + fornecedor.toString()+
		        "\n--------------------------------------";
	}
	public float balanco() {
		caixa = caixa + (dividas - receitas);
		receitas = 0;
		dividas = 0;		
		return caixa;
	}
	public float pagar() {
		   dividas = dividas - (caixa - receitas);
		   return dividas;
	   }
	public void vender(Ex11Produto produto, Ex11Cliente cliente, int FormaPag) {
		float descontos = 0;
		float juros = 0;
		
		if(FormaPag == AVISTA) {
			descontos += getDesconto();
		}else {
			juros += getJuros();
		}
		if (cliente.isVip()) {
			descontos += getDesconto();
		}
		float valorFinal = produto.getPreco() * ( 1 - (descontos - juros));
		
		receber(valorFinal);	
	    }	 
		@Override
		public void receber(float valor) {
			 receitas = receitas + valor;
		}
		@Override
		public void pagar(float valor) {
			valor = valor - 0.1f;
			
		}
		@Override
		public float getJuros() {
			int formaPag = 0;
			if(formaPag == AVISTA) {
				float valor = produto.get(0).getPreco();
				valor = valor * (2 - 0.1f);
				return valor;
			}else {
			float valor = produto.get(0).getPreco();;
			valor = valor + 0.1f;
			return valor;
		}			
		}
		@Override
		public float getDesconto() {
			int formaPag = 0;
			
			if(formaPag == AVISTA) { 
				float valor = produto.get(0).getPreco();;
				valor = valor * (2 - 0.1f);
				return valor;
			}else {
		   float valor =produto.get(0).getPreco();
			 valor = valor - 0.1f;
			return valor;	
			}			
		}	
		/*1. Os juros para compras à prazo são de 10%.
		2. O desconto para compras à vista é de 10%.
		3. A empresa sempre aplica o dobro de juros nas vendas à prazo e recebe o dobro de desconto
		em compras à vista.*/
		
	/*preço do produto = PO
	   d : 0+10 = 10%
	   j : 2* 10 = 20%
	   VF: PO *( 1- (d - j)
	   VF :(produto.get preco *(1-(d-j)
	   */
	public float getCaixa() {
		return caixa;
	}
	public void setCaixa(float caixa) {
		this.caixa = caixa;
	}
	public float getDividas() {
		return dividas;
	}
	public void setDividas(float dividas) {
		this.dividas = dividas;
	}
	public float getReceitas() {
		return receitas;
	}
	public void setReceitas(float receitas) {
		this.receitas = receitas;
	}
	public List<Ex11Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Ex11Produto> produto) {
		this.produto = produto;
	}
	public List<Ex11Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(List<Ex11Cliente> cliente) {
		this.cliente = cliente;
	}
	public static int getAvista() {
		return AVISTA;
	}
	public static int getAprazo() {
		return APRAZO;
	}
}
/*Regras de negócio:
1) Os métodos “getJuros” e “getDesconto” retornam, respectivamente, os juros e descontos a serem
aplicados nas compras e vendas da empresa.
1. Os juros para compras à prazo são de 10%.
2. O desconto para compras à vista é de 10%.
3. A empresa sempre aplica o dobro de juros nas vendas à prazo e recebe o dobro de desconto
em compras à vista.

2) O método “vender” realiza o cálculo do valor final da venda, com base nas seguintes regras:
1) Para clientes vips: desconto de 10%.
2) Para compras à vista: desconto de 10%.

3) Para compras à prazo: juros de 20% (o dobro dos juros normais).
3) O método “comprar” realiza o cálculo do valor final da compra, com base nas seguintes regras:
1. De fornecedores parceiros: desconto de 20%.
2. Para compras à vista: desconto de 20% (o dobro do desconto normal).
3. Para compras à prazo: juros de 10%.

4) O método “pagar” é chamado pelo método “comprar” e atualiza as dívidas da empresa.
5) O método “receber” é chamado pelo método “vender” e atualiza as receitas da empresa.
6) O método balaço() realiza a contabilidade da empresa, atualizando e retornando o valor em caixa
com base nas dívidas e receitas.*/