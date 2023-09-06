package Ex5Formas;

public class Ex5Losangulo extends Ex5Quadrilatero {
	
private	float diagonalMaior;
private	float diagonalMenor;
private	float lado1;


public Ex5Losangulo() {
	super();// TODO Auto-generated constructor stub
}

public Ex5Losangulo( float base, float altura, float diagonalMaior,
		            float diagonalMenor, float lado1) {
	super(base, altura);// TODO Auto-generated constructor stub
	this.diagonalMaior = diagonalMaior;
	this.diagonalMenor = diagonalMenor;
	this.lado1 = lado1;
}

public float calcArea() {
	return diagonalMaior * diagonalMenor / 2;
}

public float calcPerimetro() {
	return lado1*4;
}
	public float getDiagonalMaior() {
		return diagonalMaior;
	}
	public void setDiagonalMaior(float diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}
	public float getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(float diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	public float getLado1() {
		return lado1;
	}
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}
	
	
}
