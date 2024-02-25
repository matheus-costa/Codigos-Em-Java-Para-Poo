package Aula9;

import java.util.List;
import java.util.ArrayList;

public class Ex9Agenda {
   private  String usuario;
   private  int ano;
   private List<Ex9CompromissoAge> CompromissoAge =  new ArrayList <Ex9CompromissoAge>();
   private List<Ex9Agenda>  listaAgenda =  new ArrayList <Ex9Agenda>();

   public Ex9Agenda() {}
   public Ex9Agenda(String usuario, int ano) {
	   this.ano = ano;
	   this.usuario = usuario;   
   } 
   
   
   @Override
public String toString() {
	return "\nNome do usuario =" + usuario +
			"\nno=" + ano + 
			"\nCompromissoAge=" + CompromissoAge;
}
public Ex9Agenda(String usuario, int ano, List<Ex9CompromissoAge> compromissoAge) {
	super();
	this.usuario = usuario;
	this.ano = ano;
	this.CompromissoAge = compromissoAge;

}
   public String addCompromisso(Ex9CompromissoAge compromissoAge) {
		CompromissoAge.add(compromissoAge);
		return Ex9SituacaoAge.ADD;// método ADD, utilizado obviamente para adiconar
	}   
   public String removerCompromisso(int dia, int mes) {
		List<Ex9CompromissoAge> aux = CompromissoAge; //pego minha lista e coloco em uma variável AUX para poder usar depois no FOREAT
		for(Ex9CompromissoAge c:aux) {
			if(dia==c.getDia() && mes==c.getMes()) { //comparo ás variáveis de mês e dia, para saber se corresponde com o que o usuário me passou
				 CompromissoAge.remove(c);//uso o método remove, para remover esse compromisso com base no mês/dia informado
				return Ex9SituacaoAge.REMOVER;//método remover
			}
		}	
		return Ex9SituacaoAge.NAOENCONTRADO;
	}	
	public String removerCompromisso(String nome) {
		//aqui é a mesma lógica que o método acima, exceto pela forma de exlusão
		List<Ex9CompromissoAge> aux= CompromissoAge;//for para percorrer a lista de compromisso
		for(Ex9CompromissoAge c:aux) {
			if(nome==c.getNome()) {
				CompromissoAge.remove(c);
				return Ex9SituacaoAge.REMOVER;
			}
		}	
		return Ex9SituacaoAge.NAOENCONTRADO;
	}
	
	public List<Ex9CompromissoAge> getCompromisso() {
		return this. CompromissoAge;
	}
		public String getCompromisso(String nome) {
			for(Ex9CompromissoAge c:CompromissoAge) {
				if(nome==c.getNome()) {
					return Ex9SituacaoAge.ENCONTRADO;
				}
			}			
			return Ex9SituacaoAge.NAOENCONTRADO;
		}   
    public boolean hasCompromisso() {
		if(CompromissoAge.size()==0) {
			return true;
		}else {
			return false;
		}
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public List<Ex9CompromissoAge> getCompromissoAge() {
		return CompromissoAge;
	}
	public void setCompromissoAge(List<Ex9CompromissoAge> compromissoAge) {
		CompromissoAge = compromissoAge;
	}
	public List<Ex9Agenda> getListaAgenda() {
		return listaAgenda;
	}
	public void setListaAgenda(List<Ex9Agenda> listaAgenda) {
		this.listaAgenda = listaAgenda;
	}   


}