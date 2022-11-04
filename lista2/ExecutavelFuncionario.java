package lista2;

import java.util.Scanner;
import lista2.Funcionario;

@SuppressWarnings("unused")
public class ExecutavelFuncionario {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		 int horas = 0;	
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
   
		f1.setNome("Pitoco"); //AQUI NESSE CASO ESTOU USANDO O MÉTODO SETNOME,QUE VEM DA MINHA CLASSE FUNCINÁRIO
		f1.setSobrenome("Oliveira"); // DESTA FORMA EU POSSO ATRIBUIR O VALOR QUE EU QUISER PARA A VARIÁVEL NOME
		f1.setHorasTrabalhadas(10);
		f1.setValorHora(50);	

		f2.setNome("Nicoco");
		f2.setSobrenome("Oliveira");		
		
		System.out.println("Valor de hora trabalhada:");//AQUI EU RECEBO OS DADOS DO FUNCIONÁRIO
	    f2.setValorHora(input.nextInt());//AQUI EU SETO VALOR HORA, E MODIFICO O VALOR DA VARIÁVEL PELOS DADOS INFORMADOS PELO TECLADO
	                    //É NESTE LOCAL QUE RECEBO O "VALOR" INFORMADO PELO USUÁRIO    
	    System.out.println("Horas de trabalho:");    
	    f2.setHorasTrabalhadas(input.nextInt());
	    
	    input.nextLine();
	    System.out.println("O funcionário fez hora extra?");    
	    String fazHora = input.nextLine();
	    if(fazHora.equals("Sim") || fazHora.equals("sim")){ //AQUI EU REALIZO UM TESTE PARA SABER SE O FUNCIONÁRIO FEZ HORA EXTRA
	    System.out.println("Horas Extra:");    
	    horas = input.nextInt();
	    } else {	    	
	    	  System.out.println("Este funcionário não fez hora extra:");   
	    }
	    System.out.println("--------------------------");
	    System.out.println("Este é o nome completo do primeiro funcionário:"+f1.nomeCompleto());
		System.out.println("Valor do salário do primeiro funcinário:"+f1.calcularSalario()); 
		System.out.println("Valor do salário com horas incrementadas"+f1.incrementarHoras(horas));//AQUI QUANDO VOU EXIBIR O VALOR INCREMENTADO. 
		System.out.println("--------------------------");//ACIMA PASSO O VALOR DA VARÁVEL QUE ESTÁ O VALOR POR PARÂMETRO	
		System.out.println("Este é o nome completo do primeiro funcionário:"+f2.nomeCompleto());
		System.out.println("Valor do salário com horas incrementadas"+f2.incrementarHoras(horas));
		System.out.println("Valor do salário do primeiro funcinário:"+f2.calcularSalario()); 
		 
	}
}
