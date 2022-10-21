package aula1;
/*3. Escrever um programa executável que possua as seguintes variáveis:
forma: String.
area, lado1, lado2 : float.
Receber por entrada de teclado o nome da forma geométrica (triângulo, retângulo ou
quadrado) e seus dois lados.
Calcular a área conforme o tipo de forma indicada pelo usuário e mostrar a informação
na tela.*/

import java.util.Scanner;

public class Exc3 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		float area;
		float lado1;
		float lado2;
		String formaGeometrica;
				 
		 System.out.println("Informe o primeiro lado para o cálculo de área:");
		 lado1 = input.nextFloat();
		 System.out.println("Informe o segundo lado para o cálculo de área:");
		 lado2 = input.nextFloat();
		 input.nextLine();
		 System.out.println("Informe a forma geometrica:");
      	 formaGeometrica = input.nextLine();
		 System.out.println("-----------------------------------------------------");		
      	    	 
      
      	 
      	 System.out.println("Está é a forma geométrica informada:"+formaGeometrica);
		//AGORA FAÇO OS IF'S, PARA CADA FORMA GEOMÉTRICA SER UM CÁLCULO    	 

         if (formaGeometrica.equals("Triângulo") || formaGeometrica.equals("triângulo")){
        	 area = (lado1 * lado2) / 2;
      	  System.out.println("Está é a área do Triângulo:"+area); 
         }
         else if (formaGeometrica.equals("Retângulo") || formaGeometrica.equals("retângulo")){
        	 area = lado1 * lado2;
      	   System.out.println("Está é a área do Retângulo:"+area); 	   
         }
         else if (formaGeometrica.equals("Quadrado") || formaGeometrica.equals("quadrado")){
        	 area = lado1 * lado1;
        	 System.out.println("Está é a área do Quadrado:"+area);
	     }
         else 
      	   System.out.println("Forma geométrica inválida!!"); 
		     		
	}
}
