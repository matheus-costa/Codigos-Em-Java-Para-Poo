package Ex5Formas;

public class Ex5Trapezio extends Ex5Quadrilatero {
	
	private float baseMenor;
	private float lado1;
	private float lado2;
	
	
	public Ex5Trapezio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ex5Trapezio(float base, float altura, float baseMenor, float lado1, float lado2) {
		super(base, altura);
		this.baseMenor = baseMenor;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public float calcArea() {
		return (altura*(base + baseMenor)) / 2;
	}
	
	public float calcPerimetro() {
		return base + baseMenor + lado1 + lado2;
	}
	
	public float getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}
	public float getLado1() {
		return lado1;
	}
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}
	public float getLado2() {
		return lado2;
	}
	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	
}
