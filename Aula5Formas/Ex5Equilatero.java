package Aula5Formas;

public class Ex5Equilatero extends Ex5Triangulo {
	


	public Ex5Equilatero() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Ex5Equilatero(float altura, float base, float lado1, float lado2, float lado3) {
		super(altura, base, lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}
	public float calcArea() {
		return (float) (lado1*lado1 * Math.sqrt(3)) / 4;
	}
}
