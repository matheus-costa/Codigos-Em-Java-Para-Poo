package aula1;
/*3. Escrever um programa execut�vel que possua as seguintes vari�veis:
forma: String.
area, lado1, lado2 : float.
Receber por entrada de teclado o nome da forma geom�trica (tri�ngulo, ret�ngulo ou
quadrado) e seus dois lados.
Calcular a �rea conforme o tipo de forma indicada pelo usu�rio e mostrar a informa��o
na tela.*/

import java.util.Scanner;

public class Exc3 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		float area;
		float lado1;
		float lado2;
		String formaGeometrica;
				 
		 System.out.println("Informe o primeiro lado para o c�lculo de �rea:");
		 lado1 = input.nextFloat();
		 System.out.println("Informe o segundo lado para o c�lculo de �rea:");
		 lado2 = input.nextFloat();
		 input.nextLine();
		 System.out.println("Informe a forma geometrica:");
      	 formaGeometrica = input.nextLine();
		 System.out.println("-----------------------------------------------------");		
      	    	 
      
      	 
      	 System.out.println("Est� � a forma geom�trica informada:"+formaGeometrica);
		//AGORA FA�O OS IF'S, PARA CADA FORMA GEOM�TRICA SER UM C�LCULO    	 

         if (formaGeometrica.equals("Tri�ngulo") || formaGeometrica.equals("tri�ngulo")){
        	 area = (lado1 * lado2) / 2;
      	  System.out.println("Est� � a �rea do Tri�ngulo:"+area); 
         }
         else if (formaGeometrica.equals("Ret�ngulo") || formaGeometrica.equals("ret�ngulo")){
        	 area = lado1 * lado2;
      	   System.out.println("Est� � a �rea do Ret�ngulo:"+area); 	   
         }
         else if (formaGeometrica.equals("Quadrado") || formaGeometrica.equals("quadrado")){
        	 area = lado1 * lado1;
        	 System.out.println("Est� � a �rea do Quadrado:"+area);
	     }
         else 
      	   System.out.println("Forma geom�trica inv�lida!!"); 
		     		
	}
}
