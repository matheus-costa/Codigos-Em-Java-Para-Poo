package Aula9;

import java.util.List;

public class Ex9Aluno implements Ex9VerificarSituacao {
	// Ex9Disciplina String nomedisciplina, int numAulas e numFaltas, float notas, Ex9Aluno String nome
   private String nome;
   List<Ex9Disciplina> disciplinas;
  
   
public Ex9Aluno() {}
public Ex9Aluno(String nome, List<Ex9Disciplina> disciplinas) {
	super();//Strin nomeDisciplina, int numAulas, int numFlasta, []notas
	this.nome = nome;
	this.disciplinas = disciplinas;
}

 @Override
public String toString() {
	return "\nNome  da Disciplina = " + nome +
			"\nLista de Disciplinas deste aluno = " + disciplinas;		
}
public String Situacao() {// AQUI DEVO RETORNAR AS CONTANTES DA CLASSE SITUAÇÃO
	 if(verificarFrequencia() == true) {		 
	              if(calculaMediaGeral() > 7) {
		               return Ex9Situacao.APROVADO;
	             }else if( calculaMediaGeral() >= 5|| calculaMediaGeral() < 7) {
		               return Ex9Situacao.RECUPERACAO;
	             }else
	             return Ex9Situacao.REPROVADO;
	 }else
		 return Ex9Situacao.REPROVADO;
 }
@Override
public float calculaMediaGeral() {
	float mediaG = 0;
	mediaG = mediaG +((Ex9Disciplina) disciplinas).Media();
	return mediaG;
}
@Override
public boolean verificarFrequencia() {//REVISAR PPOIS LINHA 25 PODE ESTAR ERRADA
	float frequente;
	frequente = (disciplinas.get(0).getNumAulas()) / (disciplinas.get(0).getNumFaltas());
	if(frequente  > 0.75) {
		return true;
	}else
	return false;
}
public Ex9Aluno(String nome){
	this.nome = nome;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public List<Ex9Disciplina> getDisciplinas() {
	return disciplinas;
}
public void setDisciplinas(List<Ex9Disciplina> disciplinas) {
	this.disciplinas = disciplinas;
}

}