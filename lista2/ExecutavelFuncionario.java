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
   
		f1.setNome("Pitoco"); //AQUI NESSE CASO ESTOU USANDO O M�TODO SETNOME,QUE VEM DA MINHA CLASSE FUNCIN�RIO
		f1.setSobrenome("Oliveira"); // DESTA FORMA EU POSSO ATRIBUIR O VALOR QUE EU QUISER PARA A VARI�VEL NOME
		f1.setHorasTrabalhadas(10);
		f1.setValorHora(50);	

		f2.setNome("Nicoco");
		f2.setSobrenome("Oliveira");		
		
		System.out.println("Valor de hora trabalhada:");//AQUI EU RECEBO OS DADOS DO FUNCION�RIO
	    f2.setValorHora(input.nextInt());//AQUI EU SETO VALOR HORA, E MODIFICO O VALOR DA VARI�VEL PELOS DADOS INFORMADOS PELO TECLADO
	                    //� NESTE LOCAL QUE RECEBO O "VALOR" INFORMADO PELO USU�RIO    
	    System.out.println("Horas de trabalho:");    
	    f2.setHorasTrabalhadas(input.nextInt());
	    
	    input.nextLine();
	    System.out.println("O funcion�rio fez hora extra?");    
	    String fazHora = input.nextLine();
	    if(fazHora.equals("Sim") || fazHora.equals("sim")){ //AQUI EU REALIZO UM TESTE PARA SABER SE O FUNCION�RIO FEZ HORA EXTRA
	    System.out.println("Horas Extra:");    
	    horas = input.nextInt();
	    } else {	    	
	    	  System.out.println("Este funcion�rio n�o fez hora extra:");   
	    }
	    System.out.println("--------------------------");
	    System.out.println("Este � o nome completo do primeiro funcion�rio:"+f1.nomeCompleto());
		System.out.println("Valor do sal�rio do primeiro funcin�rio:"+f1.calcularSalario()); 
		System.out.println("Valor do sal�rio com horas incrementadas"+f1.incrementarHoras(horas));//AQUI QUANDO VOU EXIBIR O VALOR INCREMENTADO. 
		System.out.println("--------------------------");//ACIMA PASSO O VALOR DA VAR�VEL QUE EST� O VALOR POR PAR�METRO	
		System.out.println("Este � o nome completo do primeiro funcion�rio:"+f2.nomeCompleto());
		System.out.println("Valor do sal�rio com horas incrementadas"+f2.incrementarHoras(horas));
		System.out.println("Valor do sal�rio do primeiro funcin�rio:"+f2.calcularSalario()); 
		 
	}
}
