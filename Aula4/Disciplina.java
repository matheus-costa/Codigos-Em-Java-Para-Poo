package Aula4;

public class Disciplina {
private String nome;
private String codigo;
private Aluno aluno;

public Disciplina() {}
public Disciplina(String nome, String codigo, Aluno aluno) {
	super();
	this.nome = nome;
	this.codigo = codigo;
	this.aluno = aluno;
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
public Aluno getAluno() {
	return aluno;
}
public void setAluno(Aluno aluno) {
	this.aluno = aluno;
}
}