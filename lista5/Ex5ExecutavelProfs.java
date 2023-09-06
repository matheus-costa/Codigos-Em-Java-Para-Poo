package Aula5Profs;

public class Ex5ExecutavelProfs {
	public static void main(String[] args) {
		
		Ex5ProfHorista ProfH = new Ex5ProfHorista("Marcos","9293",40,20,30);
		Ex5ProfRegime ProfR = new Ex5ProfRegime("Ana","9080",30,40);
		
		System.out.println("Salario do professor:"+ProfH.retornaSalario());
		System.out.println("Salario do professor:"+ProfR.retornaSalario());
	}

}
