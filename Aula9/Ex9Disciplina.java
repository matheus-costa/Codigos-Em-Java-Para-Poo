package Aula9;

import java.util.Arrays;

public class Ex9Disciplina {
// Ex9Disciplina String nomedisciplina, int numAulas e numFaltas, float notas
	  private  String nomeDisciplina;
	 private int numAulas;
	  private  int numFaltas;
	  private  float[] notas = new float[3];
	  
	  public Ex9Disciplina() {}	//Strin nomeDisciplina, int numAulas, int numFlasta, []notas
	  public Ex9Disciplina(String nomeDisciplina,int numAulas, int numFaltas,float []notas) {
		  this.nomeDisciplina = nomeDisciplina;
		  this.numAulas = numAulas;
		  this.numFaltas = numFaltas;
		  this.notas = notas;
	  }
	  
	  @Override
	public String toString() {
		return "\nNome da Disciplina=" + nomeDisciplina +
				"\nNúmero de aulas = " + numAulas + 
				"\nNúmeros de faltas =" + numFaltas +
				"\nNotas da disciplina =" + Arrays.toString(notas);
	}
	public float Media() {
			float soma = 0;
			
			for(int i = 0 ; i < notas.length; i++) {
				soma = soma + notas[i];
			}
			return soma/notas.length;	  
	  }			  
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
    }
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public int getNumAulas() {
		return numAulas;
	}
	public void setNumAulas(int numAulas) {
		this.numAulas = numAulas;
	}
	public int getNumFaltas() {
		return numFaltas;
	}
	public void setNumFaltas(int numFaltas) {
		this.numFaltas = numFaltas;
	}
	  
}
