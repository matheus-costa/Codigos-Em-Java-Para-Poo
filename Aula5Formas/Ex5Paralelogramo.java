package Aula5Formas;

public class Ex5Paralelogramo extends Ex5Quadrilatero{
		
	public Ex5Paralelogramo() {
		super();// TODO Auto-generated constructor stub
	}
	public Ex5Paralelogramo(float base, float altura) {
		super(base, altura);// TODO Auto-generated constructor stub
	}
	public float calcArea() {
		return base*altura;
	}	
	public float calcPerimetro() {
		return 2*(base + altura);
	}
}