package Aula5Formas;

public class Ex5Escaleno extends Ex5Triangulo {

	private float semiPerimetro;
		
	public Ex5Escaleno() {
		super();
	}		
	public Ex5Escaleno(float altura, float base, float lado1, float lado2, float lado3,
			           float semiPerimetro) {
		super(altura, base, lado1, lado2, lado3);
		this.semiPerimetro = semiPerimetro;
	}
	public float calcArea() {
		return (base * altura) * 2;
	}
	public float getSemiPerimetro() {
		return semiPerimetro;
	}
	public void setSemiPerimetro(float semiPerimetro) {
		this.semiPerimetro = semiPerimetro;
	}	
}