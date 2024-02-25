package Aula6;

import java.util.Scanner;


public class Executavel {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);	
		
		Area area = new Area();
		Artigo artigo = new Artigo();
		Autor autor = new Autor();
		MiniCurso minicurso = new MiniCurso();
		Palestra palestra = new Palestra();
		Submissao submissao = new Submissao();
		
		
		System.out.println("---------------------------------------");
		System.out.println("SUBMISSÃO");
		submissao.setTitulo(input.nextLine());
		System.out.println("Informe o titulo da Submissao:");
		submissao.setTitulo(input.nextLine());
		System.out.println("Informe a situacao da submissao: 1-3");
		submissao.setSituacao(input.nextInt());
		System.out.println("Informe o total de submissões");
		submissao.setTotal(input.nextInt());
		System.out.println("---------------------------------------");
		System.out.println("ÁREA");
		System.out.println("Informe o nome da sua área:");
		area.setDescricao(input.nextLine());
		System.out.println("---------------------------------------");
		System.out.println("AUTOR");
		System.out.println("Infrome o nome do autor:");
		autor.setNome(input.nextLine());
		System.out.println("Infrome o email do autor:");
		autor.setEmail(input.nextLine());
		System.out.println("Infrome o número de telefone do autor:");
		autor.setCelular(input.nextLong());
		System.out.println("---------------------------------------");
		System.out.println("PALESTRA");
		System.out.println("Informe da descricao da palestra:");
		palestra.setDescricao(input.nextLine());
		System.out.println("Informe a data da palestra:");
		palestra.setData(null);
		System.out.println("Informe a hora da palestra:");
		palestra.setHora(null);
		System.out.println("Informe o número de palestras:");
		palestra.setNumeroPalestra(input.nextInt());
		System.out.println("---------------------------------------");
		System.out.println("MINI CURSO");
		System.out.println("Informe a carga horária do mini curso:");
		minicurso.setHoras(input.nextInt());
		System.out.println("Informe o numero do mini curso:");
		minicurso.setNumeroMiniCurso(input.nextInt());
		System.out.println("Informe a data do mini curso:");
		minicurso.setData(null);
		System.out.println("Informe o horário de início do mini curso:");
		minicurso.setHoraInicio(null);
		System.out.println("Informe o horário de fim do mini curso:");
		minicurso.setHoraFim(null);
		System.out.println("---------------------------------------");
		System.out.println("ARTIGO");
		System.out.println("Informe o título do artigo:");
		artigo.setTitulo(input.nextLine());
		System.out.println("Informe a situação do artigo:");
		artigo.setSituacao(input.nextInt());
		System.out.println("Informe a situação do artigo:");
		artigo.setTotal(input.nextInt());
		System.out.println("Informe o resumo do artigo:");
		artigo.setResumo(input.nextLine());
		System.out.println("Informe o numero de artigos:");
		artigo.setNumeroArtigos(input.nextInt());
		System.out.println("---------------------------------------");
		System.out.println("EXIBINDO INFORMAÇÕES QUE O USUÁRIO INFORMOU!!");
		System.out.println("SUBMISSÃO");
		System.out.println(submissao.toString());
		System.out.println("---------------------------------------");
		System.out.println("ARTIGO");
		System.out.println(artigo.toString());
		System.out.println("---------------------------------------");
		System.out.println("MINI CURSO");
		System.out.println(minicurso.toString());
		System.out.println("---------------------------------------");
		System.out.println("PALESTRA");
		System.out.println(palestra.toString());
		System.out.println("---------------------------------------");
		System.out.println("AUTOR");
		System.out.println(autor.toString());
		System.out.println("---------------------------------------");
		System.out.println("ÁREA");
		System.out.println(area.toString());
		System.out.println("---------------------------------------");		
	}
}