package Aula5;

public class Ex5ExecutavelFuncionarios {
	public static void main(String[] args) {
		
		Ex5ProfessorFun ProFun = new Ex5ProfessorFun("Carlos","Teclogia","Doutorado",8,5,9990000,20,30,40);
		Ex5Medico Med = new Ex5Medico("Lucas",7,7770000,40,20,30);
		Ex5Policial Pol = new Ex5Policial("Amanda",9,8880000,50,60,40);
		
		System.out.println("Valor do Salário do Professor:"+ProFun.calcularSalario());
		System.out.println("Valor do Salário do Médico:"+Med.calcularSalario());
		System.out.println("Valor do Salário do Policial:"+Pol.calcularSalario());
	}

}
