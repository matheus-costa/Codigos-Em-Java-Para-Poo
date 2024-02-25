package Aula5Formas;

public class Ex5ExecutavelQuadrado {
	public static void main(String[] args) {
		
		
		Ex5Quadrado Qua = new Ex5Quadrado(50,60,70);
		Ex5Retangulo Ret = new Ex5Retangulo(40,30);
		Ex5Losangulo Los = new Ex5Losangulo(50,40,30,20,10);
		Ex5Trapezio Tra = new Ex5Trapezio(10,20,30,40,50);
		Ex5Paralelogramo Para = new Ex5Paralelogramo(10,20);
		
		System.out.println("Valor da Área do Quadrado:" +Qua.calcArea()
		+ " "+"."+"O Perímetro do Quadrado:"+  " "+Qua.calcPerimetro());		
		System.out.println("Valor da Área do Retângulo:"+Ret.calcArea() 
		+ " "+"."+"O Perímetro do Retângulo:"+  " " + Ret.calcPerimetro());
		System.out.println("Valor da Área do Losangulo:"+Los.calcArea()
		+ " "+"."+"O Perímetro do Losangulo:"+  " " + Los.calcPerimetro());
		System.out.println("Valor da Área do Trapézio:" +Tra.calcArea()
		+ " "+"."+"O Perímetro do Trapézio:"+  " " 	+ Tra.calcPerimetro());
		System.out.println("Valor da Área do Paralelogramo:"+Para.calcArea()
		+ " "+"."+"O Perímetro do Paralelogramo:"+  " " + Para.calcPerimetro());
		
	}

}
