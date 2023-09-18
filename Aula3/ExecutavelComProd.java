package Aula3;



import java.util.Scanner;

public class ExecutavelComProd {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Produto p1 = new Produto();
		Compra c1 = new Compra();
		
		System.out.println("Informe a quantidade de produtos:");
		p1.setQuantidade(input.nextInt());
		
		if(p1.retonaEstoque() == true) {
		c1.setProduto(input.nextLine());
		System.out.println("Informe o nome do produto:");
		c1.setProduto(input.nextLine());
		System.out.println("Informe o valor do frete do produto:");
	 	c1.setFrete(input.nextFloat());
		System.out.println("Informe o preço do produto:");
		c1.setPreco(input.nextFloat());
		System.out.println("Informe o número de parcelas do produto:");
		c1.setParcelas(input.nextInt());
		System.out.println("----------------------------------------------------------");
		System.out.println("Informe o peso do produto:");
		p1.setPeso(input.nextFloat());
		System.out.println("Informe o código do produto:");
		p1.setCodigo(input.nextInt());
		System.out.println("----------------------------------------------------------");
		System.out.println("Este é o nome do produto:"+c1.getProduto());
		System.out.println("Esta  a quantidade de parcelas do produto:"+c1.getParcelas());
		System.out.println("Este é o o preço do produto::"+c1.getPreco());
		System.out.println("Este é o valor do frete do produto::"+c1.getFrete());
		System.out.println("Este é o valor do juros do produto::"+c1.getJuros());
		System.out.println("----------------------------------------------------------");
		System.out.println("Este é o nome do produto:"+p1.getNome());
		System.out.println("Esta é o peso do produto:"+p1.getPeso());
		System.out.println("Este é o código do produto::"+p1.getCodigo());
		System.out.println("Este é a quntidade de produtos:"+p1.getQuantidade());

		}
		

	}

}
