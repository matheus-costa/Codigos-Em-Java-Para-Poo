package Ex5Formas;

public class Ex5Quadrado extends Ex5Quadrilatero {
	
	private float lado;
	
	public Ex5Quadrado() {
		super();	// TODO Auto-generated constructor stub
	}
	public Ex5Quadrado(float base, float altura, float lado) {
		super(base, altura);// TODO Auto-generated constructor stub
		this.lado = lado;
	}
	public float calcArea() {
		return lado * lado;
	}
	
	public float calcPerimetro() {
		return lado * 4;
	}
	
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	
}
