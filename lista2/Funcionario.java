package lista2;

public class Funcionario { //MINHA CLASSE PRINCIPAL FUNCION�RIO
	
 private String nome;
 private String sobrenome; // TODOS ESTES MEUS ATRIBUTOS S�O PRIVADOS, POR TANTO PRECISO UTILIZAR M�TODOS DE ACESSO PARA PODER UTILIZA-LOS
 private int horasTrabalhadas; //UTILIZA-LOS TANTO PARA PEGAR OS VALORES, QUANDO PARA MODIFICAR OS MESMO
 private float valorHora;
 
 


public String getNome() {
return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public int getHorasTrabalhadas() {
	return horasTrabalhadas;
}
public void setHorasTrabalhadas(int horasTrabalhadas) {
	this.horasTrabalhadas = horasTrabalhadas;
}
public float getValorHora() {
	return valorHora;
}
public void setValorHora(float valorHora) { //AT� AQUI ESTOU UTILIZANDO OS MEUS GET AND SET, PARA ACESSAR E MODIFICAR ESSES ATRIBUTOS
	this.valorHora = valorHora; //COMO PARAMETRO EU ESTOU PASSANDO UM VARI�VEL DO TIPO FLOAT
}
	public  String nomeCompleto() { //MEU M�TODOS NESTE CASO N�O S�O VOID, POIS EU DECIDI RETORNAR O VALOR DESTES CALCULO
	    return   nome + sobrenome;  //UTILIZANDO O NOME DO M�TODO, E COLOQUEI OS TIPOS CONFORME O TIPO DE VARI�VEL DE CADA M�TODO	
	 }
	 public float calcularSalario() {
		return horasTrabalhadas * valorHora;
	 }
	 public float incrementarHoras(int horas){	
		 horasTrabalhadas = horasTrabalhadas + horas;
		 return horasTrabalhadas;
	}

}
