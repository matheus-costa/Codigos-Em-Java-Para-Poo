package lista2;

public class Circulo {
	private float raio;
	private float areaDisco;
	private float circunferencia;
	private float superficieEsfera;
	private float volumeEsfera;
	private double Pi = 3.14;
	
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float getAreaDisco() {
		return areaDisco;
	}
	public void setAreaDisco(float areaDisco) {
		this.areaDisco = areaDisco;
	}
	public float getCircunferencia() {
		return circunferencia;
	}
	public void setCircunferencia(float circunferencia) {
		this.circunferencia = circunferencia;
	}
	public float getSuperficieEsfera() {
		return superficieEsfera;
	}
	public void setSuperficieEsfera(float superficieEsfera) {
		this.superficieEsfera = superficieEsfera;
	}
	public float getVolumeEsfera() {
		return volumeEsfera;
	}
	public void setVolumeEsfera(float volumeEsfera) {
		this.volumeEsfera = volumeEsfera;
	}
	public double getPi() {
		return Pi;
	}
	public void setPi(double pi) {
		Pi = pi;
	}	
	public float calcularAreaDisco() {
		return (float) (Pi * raio);		
	}
	public float calcularCircunferencia() {
		return (float) (2 * Pi) * raio;
	}
	public float calcularSuperficieEsfera() {
		return (float) (4 * Pi ) * (raio * raio);		
	}
	public float volumeCirculo() {	
		return (float) (Pi * (raio *2));
	}
	
	
}
