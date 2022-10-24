package lista0;

import java.util.Scanner;

/*1. Escrever um programa executável que possua as seguintes variáveis;
nota1, nota2, nota3, maior, menor, media: float.
Receber pela entrada do teclado os valores das variáveis nota1, nota2 e nota3.
Apresentar em tela a média das notas, a maior nota e a menor nota.*/

public class Exc1 {
	public static void main(String args[]){
	
	Scanner input = new Scanner(System.in);// aqui é para eu receber os dados
		
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
   System.out.println("Está é a média do aluno:"+media);
   
   if (nota1 > nota2 && nota1 > nota3){
	  System.out.println("Maior nota é:"+nota1); 
   }
   else if (nota2 > nota1 && nota2 >  nota3){
	   System.out.println("Maior nota é:"+nota2); 	   
   }
   else 
	   System.out.println("Maior nota é:"+nota3); 
   
	   if (nota1 < nota2 && nota1 < nota3){
			  System.out.println("Menor nota é:"+nota1); 
		   }
		   else if (nota2 < nota1 && nota2 < nota3){
			   System.out.println("Menor nota é:"+nota2); 	   
		   }
		   else 
			   System.out.println("Menor nota é:"+nota3); 
			   
		   }
 
 
	}
	
