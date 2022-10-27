package lista1;


/*1. Implementar as classes com seus respectivos atributos;
2. Instanciar 3 objetos de cada classe;
3. Atribuir valores para os atributos dos objetos;
4. Mostrar as informações na tela;
classes disciplina e carro*/

import java.util.Scanner;

public class Exc2Executavel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num_alunos;
		int semestre;
		int carga_horaria;
		int ano;
		int motor;
        
    	Carro c1 = new Carro();
		Carro c2 = new Carro();
		Carro c3 = new Carro();
		
		Disciplina d1 = new Disciplina();
		Disciplina d2 = new Disciplina();
		Disciplina d3 = new Disciplina();
		
		c1.marca = "Fiat";
		c1.modelo = "Uno";
		c1.ano = 1;
		c1.motor = 200;
		
		c2.marca = "Volkswagem";
		c2.modelo = "Gol 1000";
		c2.ano = 1;
		c2.motor = 200;
		
		c3.marca = "Fiat";
		c3.modelo = "Kronos";
		
		d1.nome = "Programção Orentada a Objetos";
		d1.professor = "Droga é o Bryan";
		d1.curso = "Analise e Desenvolvimento de Sistemas";
		d1.num_alunos = 200;
		d1.semestre = 3;
		d1.carga_horaria = 30;
		
		d2.nome = "Banco de dados";
		d2.professor = " Thales";
		d2.curso = "Analise e Desenvolvimento de Sistemas";
		d2.num_alunos = 300;
		d2.semestre = 4;
		d2.carga_horaria = 40;
		
		d3.nome = "Redes de Computadores";
		d3.professor = "Anderson oh cria";
		d3.curso = "Analise e Desenvolvimento de Sistemas";
		
		System.out.println("Informe o número de alunos da disciplina:");   
	    num_alunos = input.nextInt();
	    System.out.println("Informe o semestre da disciplina:");   
	    semestre = input.nextInt();
	    System.out.println("Informe a carga horária da disciplina:");   
        carga_horaria = input.nextInt(); 
        
        System.out.println("---------------------------------------------------------------------  ");  
        
        System.out.println("Informe o ano do veículo:");   
	    ano = input.nextInt();
	    System.out.println("Informe o motor do veículo:");   
	    motor = input.nextInt();
	    
        System.out.println("---------------------------------------------------------------------  ");

        System.out.println("Este é o nome da primeira disciplina:"+d1.nome+","+" "+"presente no curso de: "+d1.curso+","+" "+"o professor desta disciplina é:"+" "+d1.professor+","+" "+"o número de alunos é:"+" "+d1.num_alunos+","+" "+"semestre em que os alunos estudam:"+" "+d1.semestre+" "+"e a sua carga horária é:"+" "+d1.carga_horaria+" "+"horas");
        System.out.println("Este é o nome da primeira disciplina:"+d2.nome+","+" "+"presente no curso de: "+d2.curso+","+" "+"o professor desta disciplina é:"+" "+d2.professor+","+" "+"o número de alunos é:"+" "+d2.num_alunos+","+" "+"semestre em que os alunos estudam:"+" "+d2.semestre+" "+"e a sua carga horária é:"+" "+d2.carga_horaria+" "+"horas"); //AQUI SERÁ EXEBIDO AS 3 DISCIPLINAS 
        System.out.println("Este é o nome da terceira disciplina: "+d3.nome+","+" "+"presente no curso de: "+d3.curso+","+" "+"o professor deste disciplina é:"+" "+d3.professor+","+" "+"o número de alunos é:"+" "+num_alunos+","+" "+"semestre em que os alunos estudam:"+" "+semestre+" "+"e a sua carga horaria é: "+" "+carga_horaria+" "+"horas ");
        
        System.out.println("---------------------------------------------------------------------  ");
        
        System.out.println("Esta é marca do primeiro veículo:"+c1.marca+","+" "+"seu modelo é:"+c1.modelo+" "+"o ano é:"+" "+c1.ano+" "+"o número do motor é:"+" "+c1.motor);
        System.out.println("Esta é marca do segundo veículo:"+c2.marca+","+" "+"seu modelo é:"+c2.modelo+" "+"o ano é:"+" "+c2.ano+" "+"o número do motor é:"+" "+c2.motor); //AQUI SERÁ EXEBIDO OS 3 CARROS
        System.out.println("Esta é marca do primeiro veículo:"+c3.marca+","+" "+"seu modelo é:"+c3.modelo+" "+" "+"o ano é:"+" "+ano+" "+"o número do motor é:"+" "+motor);
	}
}
