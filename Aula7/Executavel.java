package Aula7;

import java.util.Scanner;

public class Executavel {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Chefe c1 = new Chefe();
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("---------------------------------------");
		System.out.println("CHEFE");
		System.out.println("informe o nome do Chefe:");
		c1.setNome(input.nextLine());
		System.out.println("informe o número CPF do Chefe:");
		c1.setCpf(input.nextLong());
		System.out.println("informe o número de RG do Chefe:");
		c1.setRg(input.nextLong());
		System.out.println("informe o nível de hierarquia do Chefe:");
		c1.setNivelHierarquia(input.nextLine());
		System.out.println("informe o salário do Chefe:");
		c1.setSalario(input.nextFloat());
		System.out.println("informe o bônus do Chefe:");
		c1.setBonus(input.nextFloat());
		System.out.println("---------------------------------------");
		System.out.println("FUNCIONÁRIO");
		System.out.println("Informe o nome do funcionário:");
		f1.setNome(input.nextLine());
		System.out.println("Informe  o número CPF do funcionário:");
		f1.setCpf(input.nextLong());
		System.out.println("Informe o número de RG do funcionário:");
		f1.setRg(input.nextLong());
		System.out.println("Informe o nome do setor do funcionário:");
		f1.setSetor(input.nextLine());
		System.out.println("Informe o salário do funcionário:");
		f1.setSalario(input.nextFloat());
		System.out.println("Informe o id do funcionário:");
		f1.setId(input.nextInt());
		System.out.println("Informe a carga horária do funcionário:");
		f1.setCargaHoraria(input.nextInt());
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("CHEFE");
		System.out.println(c1.toString());
		System.out.println("Sálario do chefe com acréscimo"+c1.calcularSalario());
		System.out.println("---------------------------------------");
		System.out.println("FUNCIONÁRIO");
		System.out.println(f1.toString());
		System.out.println("Sálario do funcionário com acréscimo"+f1.calcularSalario());
	
	}
}