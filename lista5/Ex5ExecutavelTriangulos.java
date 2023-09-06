package Ex5Formas;

public class Ex5ExecutavelTriangulos {
public static void main (String args[]) {
	
	Ex5Isoceles Iso = new Ex5Isoceles(5,10,15,20,25);
	Ex5TriRetangulo Trire = new Ex5TriRetangulo(30,35,40,45,50);
	Ex5Equilatero Equi = new Ex5Equilatero(55,60,65,70,75);
	Ex5Escaleno Esca = new 	Ex5Escaleno(80,85,90,95,100,105);
			
	System.out.println("Área do Triângulo Isoceles:"+" " +Iso.calcArea()
	+ " "+"."+"O Perímetro do Triângulo Isoceles:"+ " " +Iso.calcPerimetro());
	System.out.println("Área do Triângulo Retângulo:"+" " +Trire.calcArea()
	+ " "+"."+ "O Perímetro do Triângulo Retângulo: "+  " " +Trire.calcPerimetro());
	System.out.println("Área do Triângulo Equilatero:"+Equi.calcArea()
	+ " "+"."+"O Perímetro do Triângulo Equilatero: "+  " " +Equi.calcPerimetro());
	System.out.println("Área do Triângulo Escaleno:"+Esca.calcArea()
	+ " "+"."+"O Perímetro do Triângulo Escaleno:"+  " " +Esca.calcPerimetro());
}
}
