package Aula5Formas;

public abstract class Ex5Forma {

	protected float area;
	protected float perimetro;
	
	public float calcArea() {
		return area + perimetro;
	}
	public float calcPerimentro() {
		return area * perimetro;
	}
	
}
