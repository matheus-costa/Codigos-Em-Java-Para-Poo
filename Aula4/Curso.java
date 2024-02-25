package Aula4;

public class Curso {
	
private String nome;
private String codigo;
private Disciplina disciplina;


public Curso() {}
public Curso(String nome, String codigo, Disciplina disciplina) {
	super();
	this.nome = nome;
	this.codigo = codigo;
	this.disciplina = disciplina;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public Disciplina getDisciplina() {
	return disciplina;
}
public void setDisciplina(Disciplina disciplina) {
	this.disciplina = disciplina;
}

}
