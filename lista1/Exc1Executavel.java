package lista1;

import java.util.Scanner;

/*1. Implementar as classes com seus respectivos atributos;
2. Instanciar 2 objetos de cada classe;
3. Atribuir valores para os atributos de um dos objetos;
4. Receber pela entrada de teclado os atributos do outro objeto;
5. Mostrar as informações na tela;*/

public class Exc1Executavel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String correntista;
		String nome;
		String nomeMae;
		
		float saldo;
		int codigo;
        long celular;
        int idade;
   
		
		Pessoa p1 = new Pessoa();//INTÂNCIA
		Pessoa p2 = new Pessoa();
		
		Conta c1 = new Conta();//INTÂNCIA
		Conta c2 = new Conta();
		
		p1.nome = "Carlos";
		p1.nomeMae = "Ana" ;
		p1.celular = 999008811;//SE EU FAÇO UM: "(LONG)", REMOVE QUALQUER POSSÍVEL ERRO.
		p1.idade = 20;
		 
		p2.nome = "Alemão";
		p2.nomeMae = "Alemã" ;
		p2.celular = 999001188;//SE EU FAÇO UM: "(LONG)", REMOVE QUALQUER POSSÍVEL ERRO.
		p2.idade = 25;
		
		c1.correntista = "Carlos De Pena";
		c1.saldo = 40000f ;
		c1.codigo = 77099814;
				 
		c2.correntista = "Pedro Henrique";
		c2.saldo = 30000f;
		c2.codigo = 9771598;
		

	    correntista = input.toString();
        System.out.println("Informe o nome do correntista:");   
	    correntista = input.toString();
	    System.out.println("Informe o saldo da conta:");    //AQUI EU RECEBO O MEU TERCEIRO OBJETO DE CONTA
	    saldo = input.nextFloat();
	    System.out.println("Informe o codigo da conta:");   
        codigo = input.nextInt();      
        System.out.println("---------------------------------------------------------------");         
        System.out.println("Informe o seu nome:");
        nome = input.toString();
        System.out.println("Informe o nome da sua mãe:");   
	    nomeMae = input.toString();
	    System.out.println("Informe um número de celular:"); //AQUI EU RECEBO O MEU TERCEIRO OBJETO DE PESSOA   
	    celular = input.nextLong();
	    System.out.println("Informe a sua idade:");   
        idade = input.nextInt();        
        System.out.println("---------------------------------------------------------------");  
        System.out.println(c1.correntista);
		System.out.println(c1.saldo); //AQUI SERÁ EXIBIDO O PRIMEIRO  OBJETO DE CONTA
		System.out.println(c1.codigo);
		System.out.println("---------------------------------------------------------------");  		
		System.out.println(c2.correntista);
		System.out.println(c2.saldo); //AQUI SERÁ EXIBIDO O SEGUNDO  OBJETO DE CONTA
		System.out.println(c2.codigo);
		System.out.println("---------------------------------------------------------------");  		
	    System.out.println(p1.nome);
	    System.out.println(p1.nomeMae); //AQUI SERÁ EXIBIDO O PRIMEIRO  OBJETO DE PESSOA
	    System.out.println(p1.celular);
	    System.out.println(p1.idade);	    
	    System.out.println("---------------------------------------------------------------");  	    
	    System.out.println(p2.nome);
	    System.out.println(p2.nomeMae);   //AQUI SERÁ EXIBIDO O SEGUNDO  OBJETO DE PESSOA
	    System.out.println(p2.celular);
	    System.out.println(p2.idade);
	    System.out.println("---------------------------------------------------------------"); 
	}
}


