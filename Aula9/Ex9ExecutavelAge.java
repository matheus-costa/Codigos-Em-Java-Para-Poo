package Aula9;



import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex9ExecutavelAge {
	//ADD,REMOVER,LISTAVAZIA,NAOENCONTRADO,ENCONTRADO
	public static void main(String[] args) {
		
		List<Ex9Agenda> ListaAgenda = new ArrayList<Ex9Agenda>();
		List<Ex9CompromissoAge> ListaCompromissos = new ArrayList<Ex9CompromissoAge>();
		
		//Ex9CompromissoAge,Ex9Agenda(
		for(int i = 0; i<2 ; i++) {
			 Ex9Agenda agenda = new  Ex9Agenda();
			
			agenda.setUsuario(JOptionPane.showInputDialog("Informe o nome do Usuário:"));
			
			for(int j = 0 ; j<2; j++) {
				Ex9CompromissoAge comp = new Ex9CompromissoAge();
				//String nome e Descricao, int dia e mês
				comp.setNome(JOptionPane.showInputDialog("Informe o número de faltas da disciplinas:"+j+1));//J+1 é para eu informar mais de umas discplinas
				comp.setDescricao(JOptionPane.showInputDialog("Informe o número de faltas da disciplinas:"+j+1));
				comp.setDia(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de faltas da disciplinas:"+j+1)));
				comp.setMes(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de faltas da disciplinas:"+j+1)));
				
			
				for(int k = 0 ; k < ListaCompromissos.size() ; k++) {
					ListaCompromissos[k] = (JOptionPane.showInputDialog("Informe ás notas da disciplinas:"+(k+1)));
				}
				agenda.setCompromissoAge(ListaCompromissos);
			}
			
			agenda.addCompromisso(null);//adiconando o meu aluno á lista de alunos
		}
		for (Ex9Aluno al:Alu) {
			if(al.Situacao() == Ex9Situacao.APROVADO) {
				AluAprovado.add(al);
			}else if(al.Situacao() == Ex9Situacao.RECUPERACAO) {
				AluRecuperacao.add(al);
			}else
				AluReprovado.add(al);
		}
	}

}
