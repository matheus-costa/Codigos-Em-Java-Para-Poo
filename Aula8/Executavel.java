package Aula8;

import java.util.Scanner;

public class Executavel {
	public static void main(String[] args) {
		
		Roupa r1 = new Roupa();
		Acessorio a1 = new Acessorio();
		Sapato s1 = new Sapato();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("---------------------------------------");
		System.out.println("ACESSORIO");
		System.out.println("Preço do acessório:");
		a1.setPreco(input.nextFloat());
		System.out.println("Código do acessório:");
		a1.setCodigoBarra(input.nextInt());
		System.out.println("Marca do acessório:");
		a1.setMarca(input.nextLine());
		System.out.println("Tamanho do acessório:");
		a1.setTamanho(input.nextLine());
		System.out.println("quantidade de acessórios:");
		a1.setQuantidade(input.nextInt());
		System.out.println("---------------------------------------");
		System.out.println("ROUPA");
		System.out.println("Preço da roupa:");
		r1.setPreco(input.nextFloat());
		System.out.println("Quantidade de roupas:");
		r1.setQuantidade(input.nextInt());
		System.out.println("Tamanho da roupa:");
		r1.setTamanho(input.nextLine());
		System.out.println("Marca da roupa:");
		r1.setMarca(input.nextLine());
		System.out.println("Códigos de barras");
		r1.setCodigoBarra(input.nextInt());
		System.out.println("---------------------------------------");
		System.out.println("SAPATO");
		System.out.println("Preço do sapato:");
		s1.setPreco(input.nextFloat());
		System.out.println("Quantidade de sapatos:");
		s1.setQuantidade(input.nextInt());
		System.out.println("Número do sapato:");
		s1.setNumero(input.nextInt());
		System.out.println("Código de barras do sapato:");
		s1.setCodigoBarra(input.nextInt());
		System.out.println("Tipo de sapato:");
		s1.setTipo(input.nextLine());
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("SAPATO");
		System.out.println(s1.toString());
		System.out.println(s1.queimaEstoque());
		System.out.println(s1.sobMedida(s1.getQuantidade()));	
		System.out.println("---------------------------------------");
		System.out.println("ROUPA");
		System.out.println(r1.toString());
		System.out.println(r1.queimaEstoque());
		System.out.println(r1.sobMedida(r1.getQuantidade()));
		System.out.println(r1.vender(r1.getQuantidade()));
		System.out.println("---------------------------------------");
		System.out.println("ACESSÓRIO");
		System.out.println(a1.toString());
		System.out.println(a1.vender(a1.getQuantidade()));
	}
}