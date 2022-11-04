package lista2;

import java.util.Scanner;
import lista2.Circulo;
import lista2.Retangulo;

@SuppressWarnings("unused")
public class ExecutavelCircuReta {
    public static void main(String args[]) {
    	float l1;
    	float l2;
    	
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
    	
    	Circulo c1 = new Circulo();
    	Retangulo r1 = new Retangulo();
    	
	     System.out.println("Informe o lado 1:");//AQUI VOU RECEBER OS VALORES DO RETÂNGULO
	     l1 = input.nextFloat();
	     System.out.println("informe o lado 2:");    
	     l2 = input.nextFloat();   	
    	 System.out.println("--------------------------");
    	 System.out.println("Resultado do calculo da área do retângulo:"+r1.calcularArea( l1,  l2));//AQUI VOU EXIBIR OS VALORES DO RETÂNGULO
    	 System.out.println("Resultado do calculo do perímetro do retângulo:"+r1.calcularPerimetro(l1, l2)); //aqui eu vou passar os valores recebidos
    	 System.out.println("--------------------------");
    	 System.out.println("Qual o valor do raio:");    
	     c1.setRaio(input.nextFloat());     
	     System.out.println("--------------------------");	  
    	 System.out.println("Resultado do calculo da área do disco de um círculo:"+c1.calcularAreaDisco());
    	 System.out.println("Resultado do calculo da circunferência de um círculo:"+c1.calcularCircunferencia());//AQUI VOU EXIBIR OS VALORES DO CIRCULO
    	 System.out.println("Resultado do calculo da superfície de uma esfera:"+c1.calcularSuperficieEsfera());
    	 System.out.println("Resultado do calculo do vulume de um círculo:"+c1.volumeCirculo());
    }
	

}
