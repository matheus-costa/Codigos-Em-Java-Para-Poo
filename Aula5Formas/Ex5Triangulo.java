package Aula5Formas;

public  abstract class Ex5Triangulo extends Ex5Forma{
	
	protected float altura;
	protected float base;
	protected float lado1;
	protected float lado2;
	protected float lado3;
	
	public Ex5Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ex5Triangulo(float altura, float base, float lado1, float lado2, float lado3) {
		super();
		this.altura = altura;
		this.base = base;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public float calcPerimetro() {
		return lado1 + lado2 + lado3;
	}
}
