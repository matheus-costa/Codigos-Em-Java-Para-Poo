package Aula10;

import java.util.Scanner;

public class Executavel {
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);		
		Matematica mat = new Matematica();
		
		System.out.println("Informe o primeiro valor:");
		int numero1 = input.nextInt();
		System.out.println("Informe o segundo valor:");
		int numero2 = input.nextInt();
		

	
	     System.out.println("soma:"+mat.soma(numero2,numero1)); 	
	     System.out.println("subtracao:"+mat.subtracao(numero2,numero1)); 	
	     System.out.println("divisao:"+mat.divisao(numero2,numero1)); 	
	     System.out.println("multiplicacao:"+mat.multiplicacao(numero2,numero1)); 	
		 
			     
			    	
		
		
}

}