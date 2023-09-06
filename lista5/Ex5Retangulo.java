package Ex5Formas;

public class Ex5Retangulo extends Ex5Quadrilatero {
	
	public Ex5Retangulo() {
		super();// TODO Auto-generated constructor stub
	}

	public Ex5Retangulo(float base, float altura) {
		super(base, altura);// TODO Auto-generated constructor stub
	}

	public float calcArea() {
		return base*altura;
	}
	
	public float calcPerimetro() {
		return 2*(base + altura);
	}
}
