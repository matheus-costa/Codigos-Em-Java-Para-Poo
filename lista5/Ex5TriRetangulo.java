package Ex5Formas;

public class Ex5TriRetangulo extends Ex5Triangulo{
	
	public Ex5TriRetangulo() {
		super();// TODO Auto-generated constructor stub
	}
	

	public Ex5TriRetangulo(float altura, float base, float lado1, float lado2, float lado3) {
		super(altura, base, lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}
	public float calcArea() {
		return base * altura /2;
	}
}
