package Aula6;

public class Artigo extends Submissao {
	
    private String resumo;
    private int numeroArtigos;
    private Submissao submissao;
    
    public Artigo() {}
	public Artigo(String resumo, int numeroArtigos) {
		super();
		this.resumo = resumo;
		this.numeroArtigos = numeroArtigos;
	}
	
	@Override
	public String toString() {
		return "Titulo da palestra:"+submissao.getTitulo()+
			   "Informa o total de palestras:"+submissao.getTotal()+
			   "Informe a situação da palestra: 1- Aprovado, 2-rejeitado, 3- alterações:"+submissao.getSituacao()+
			   "Resumo do artigo:" + resumo + 
			   "Numero de artigos:" + numeroArtigos;
	}
	public float incrementarArtigos() {
		return numeroArtigos = numeroArtigos + 1;
	}
	
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public int getNumeroArtigos() {
		return numeroArtigos;
	}
	public void setNumeroArtigos(int numeroArtigos) {
		this.numeroArtigos = numeroArtigos;
	}

}