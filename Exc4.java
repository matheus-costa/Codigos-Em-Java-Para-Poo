package lista0;

import java.util.Scanner;

/*4. Escrever um programa que simule a contagem de votos de uma elei��o. As vari�veis s�o:
candidato1, candidato2, candidato3: String.
votos_c1, votos_c2, votos_c3, votos_nulos, votos_brancos: int.
Apresentar em tela o n�mero total de votos e a porcentagem de votos de cada candidato,
bem como dos votos brancos e nulos. Tamb�m apresentar em tela a porcentagem de
votos v�lidos de cada candidato.**/
public class Exc4 {
	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		String candidato1, candidato2, candidato3;    /*S�O 3 CANDIDATOS, POSSO FAZER O USU�RIO ESCOLHER EM QUAL ELE QUER VOTAR DANDO �S 3 OP��ES*/		    		
		int votos_c1, votos_c2, votos_c3, votos_nulos, votos_brancos, total_votos;	
		float porc1_votos, porc2_votos, porc3_votos, porcnu_votos, porcbr_votos;
		
	   	 input.nextLine();
		 System.out.println("Qual nome do primeiro cadidato:"); //NOME DOS CANDIDATOS
     	 candidato1 = input.nextLine();
     	 System.out.println("Qual o nome do segundo candidato:");     	 
     	 candidato2 = input.nextLine();
     	 System.out.println("Qual o nome do terceiro candidato:");
     	 candidato3 = input.nextLine();
     	 input.nextInt();  
     	 
         System.out.println("--------------------------------------------------------");
      	 
		 System.out.println("Quantos usu�rios votaram em"+candidato1+"?");
   	     votos_c1 = input.nextInt();
		 System.out.println("Quantos usu�rios votaram em"+candidato2+"?"); //N�MERO DE VOTOS DOS CANDIDATOS
     	 votos_c2 = input.nextInt();  
     	 System.out.println("Quantos usu�rios votaram em"+candidato3+"?");
    	 votos_c3 = input.nextInt(); 
		 System.out.println("Quantos usu�rios votaram em branco?");
    	 votos_brancos = input.nextInt();                            //N�MERO DE VOTOS NULOS E BRANCOS
		 System.out.println("Quantos usu�rios votaram em nulo?");
		 votos_nulos = input.nextInt();
		 
		 System.out.println("--------------------------------------------------------");
     	      	 
		 total_votos = ((votos_c1 + votos_c2 + votos_c3) + (votos_nulos + votos_brancos));
		 System.out.println("Este � o valor total de votos:"+total_votos);
		 
		 porc1_votos = ((votos_c1 / total_votos) * 100); //AQUI EU DESCUBTOS QUANTOS USU�RIOS VOTARAM NO PRIMEIRO CANDIDATO
		 System.out.println("O"+candidato1+"recebeu"+votos_c1+"votos.");
		 System.out.println("O"+candidato1+"recebeu"+porc1_votos+"%"+"dos votos.");
		 
		 porc2_votos = ((votos_c2 / total_votos) * 100); //AQUI EU DESCUBTOS QUANTOS USU�RIOS VOTARAM NO PRIMEIRO CANDIDATO
		 System.out.println("O"+candidato2+"recebeu"+votos_c2+"votos.");
		 System.out.println("O"+candidato2+"recebeu"+porc2_votos+"%"+"dos votos.");
		
		 
		 porc3_votos = ((votos_c3 / total_votos) * 100); //AQUI EU DESCUBTOS QUANTOS USU�RIOS VOTARAM NO PRIMEIRO CANDIDATO
		 System.out.println("O"+candidato3+"recebeu"+votos_c3+"votos.");
		 System.out.println("O"+candidato3+"recebeu"+porc3_votos+"%"+"dos votos.");
		 
		 porcnu_votos = ((votos_nulos / total_votos) * 100); //AQUI EU DESCUBTOS QUANTOS USU�RIOS VOTARAM NO PRIMEIRO CANDIDATO
		 System.out.println("O total de votos nulos �:"+votos_nulos+"� porcentagem de votos nulos foi"+porcnu_votos+"%"+"votos.");
		 
		 porcbr_votos = ((votos_brancos / total_votos) * 100); 
		 System.out.println("O total de votos nulos �:"+votos_brancos+"� porcentagem de votos nulos foi"+porcbr_votos+"%"+"votos."); 		 		
	}
}
