package lista0;

import java.util.Scanner;

/*2. Escrever um programa execut�vel que possua as seguintes vari�veis:
n, m: int.
Receber pela entrada do teclado os valores das vari�veis n e m.
Criar dois vetores, vetor1 e vetor2, de tamanhos n e m, respectivamente.
Preencher o vetor1 com os n primeiros valores pares.
Preencher o vetor2 com os m primeiros valores �mpares.
Mostrar em tela os dois vetores.*/
public class Exc2 {
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = input.nextInt();
		System.out.print("\nDigite o segundo valor: ");
		valor2 = input.nextInt();
		
		int vetor1[] = new int[valor1];
		int vetor2[] = new int[valor2];
		
		System.out.println("Vetor com os"+valor1+"primeiros n�meros pares:");
		for(int i = 0; i < valor1; i++) {
			vetor1[i] = i*2;//ESTE � O C�LCULO USADO PARA SABER SE O N�MERO � PAR
			System.out.println(vetor1[i]);//O VALOR COME�A EM "0" E � ACRESCENTADO SEMPRE +2, DESTA FORMA TEMOS SEMPRE VALORES PARES
		}	
		
		System.out.println("Vetor com os"+valor2+"primeiros n�meros �mpares:");
		for(int i = 0; i < valor2; i++){
			vetor2[i] = i*2+1;//O VALOR COME�A EM "0" M�S POR TERMOS "2+1", OS VALORES SER�O SEMPRE �MPARES
			System.out.println(vetor2[i]);
		}			
	}
}