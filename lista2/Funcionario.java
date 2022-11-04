package lista2;

public class Funcionario { //MINHA CLASSE PRINCIPAL FUNCIONÁRIO
	
 private String nome;
 private String sobrenome; // TODOS ESTES MEUS ATRIBUTOS SÃO PRIVADOS, POR TANTO PRECISO UTILIZAR MÉTODOS DE ACESSO PARA PODER UTILIZA-LOS
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
public void setValorHora(float valorHora) { //ATÉ AQUI ESTOU UTILIZANDO OS MEUS GET AND SET, PARA ACESSAR E MODIFICAR ESSES ATRIBUTOS
	this.valorHora = valorHora; //COMO PARAMETRO EU ESTOU PASSANDO UM VARIÁVEL DO TIPO FLOAT
}
	public  String nomeCompleto() { //MEU MÉTODOS NESTE CASO NÃO SÃO VOID, POIS EU DECIDI RETORNAR O VALOR DESTES CALCULO
	    return   nome + sobrenome;  //UTILIZANDO O NOME DO MÉTODO, E COLOQUEI OS TIPOS CONFORME O TIPO DE VARIÁVEL DE CADA MÉTODO	
	 }
	 public float calcularSalario() {
		return horasTrabalhadas * valorHora;
	 }
	 public float incrementarHoras(int horas){	
		 horasTrabalhadas = horasTrabalhadas + horas;
		 return horasTrabalhadas;
	}

}
