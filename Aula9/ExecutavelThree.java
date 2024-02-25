package Aula9;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class ExecutavelThree {

	public static void main(String args[]) {
		
		
		List<Ex9Aluno> Alu = new ArrayList<Ex9Aluno>();
		List<Ex9Aluno> AluAprovado = new ArrayList<Ex9Aluno>();
		List<Ex9Aluno> AluReprovado = new ArrayList<Ex9Aluno>();
		List<Ex9Aluno> AluRecuperacao = new ArrayList<Ex9Aluno>();
		

		for(int i = 0; i<2 ; i++) {
			Ex9Aluno aluno = new Ex9Aluno();
			
			aluno.setNome(JOptionPane.showInputDialog("Informe o nome do aluno:"));
			
			for(int j = 0 ; j<2; j++) {
				Ex9Disciplina disc = new Ex9Disciplina();
				disc.setNomeDisciplina(JOptionPane.showInputDialog("Informe o nome das disciplinas:"+j+1));//J+1 é para eu informar mais de umas discplinas
				disc.setNotas(null);
				disc.setNumAulas(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de aulas da disciplina:"+j+1)));
				disc.setNumFaltas(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de faltas da disciplinas:"+j+1)));
			
				float notas[] = new float[3];
				
				for(int k = 0 ; k < notas.length ; k++) {// aqui eu percorro o vetor notas
					notas[k] = Float.parseFloat(JOptionPane.showInputDialog("Informe ás notas da disciplinas:"+(k+1)));
				}
				disc.setNotas(notas);// coloquei o vetor dentro de disciplina
				aluno.setDisciplinas(disc);//colcando um aluno dentro da disciplina
			}
			
			Alu.add(aluno);//adiconando o meu aluno á lista de alunos
		}
		for (Ex9Aluno al:Alu) {
			if(al.Situacao() == Ex9Situacao.APROVADO) {
				AluAprovado.add(al);
			}else if(al.Situacao() == Ex9Situacao.RECUPERACAO) {
				AluRecuperacao.add(al);
			}else
				AluReprovado.add(al);
		}
		System.out.print("-------------------TODOS OS ALUNOS-------------------------");
		for(Ex9Aluno al:Alu) {
			System.out.println(al);
		}
		System.out.print("-------------------TODOS OS ALUNOS APROVADOS-------------------------");
		for(Ex9Aluno al:AluAprovado) {
			System.out.println(al);
		}
		System.out.print("-------------------TODOS OS ALUNOS EM RECUPERAÇÃO-------------------------");
		for(Ex9Aluno al:AluRecuperacao) {
			System.out.println(al);
		}
		System.out.print("-------------------TODOS OS ALUNOS REPROVADOS-------------------------");
		for(Ex9Aluno al:AluReprovado) {
			System.out.println(al);
		}
		
		
		
	}

}
