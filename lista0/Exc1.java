package lista0;

import java.util.Scanner;

/*1. Escrever um programa execut�vel que possua as seguintes vari�veis;
nota1, nota2, nota3, maior, menor, media: float.
Receber pela entrada do teclado os valores das vari�veis nota1, nota2 e nota3.
Apresentar em tela a m�dia das notas, a maior nota e a menor nota.*/

public class Exc1 {
	public static void main(String args[]){
	
	Scanner input = new Scanner(System.in);// aqui � para eu receber os dados
		
	float nota1;
	float nota2;
	float nota3;
	float media;
	
	
	 
    System.out.println("Informe a primeira nota:");
	nota1 = input.nextFloat();
	System.out.println("Informe a segunda nota:");
    nota2 = input.nextFloat();    
	System.out.println("Informe a terceira nota:");
    nota3 = input.nextFloat();
    System.out.println("----------------");
    
   media = (nota1 + nota2 + nota3) / 3;
   System.out.println("Est� � a m�dia do aluno:"+media);
   
   if (nota1 > nota2 && nota1 > nota3){
	  System.out.println("Maior nota �:"+nota1); 
   }
   else if (nota2 > nota1 && nota2 >  nota3){
	   System.out.println("Maior nota �:"+nota2); 	   
   }
   else 
	   System.out.println("Maior nota �:"+nota3); 
   
	   if (nota1 < nota2 && nota1 < nota3){
			  System.out.println("Menor nota �:"+nota1); 
		   }
		   else if (nota2 < nota1 && nota2 < nota3){
			   System.out.println("Menor nota �:"+nota2); 	   
		   }
		   else 
			   System.out.println("Menor nota �:"+nota3); 
			   
		   }
 
 
	}
	
