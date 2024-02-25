package Aula11;

public class Ex11Fornecedor extends Ex11PessoaJuridica {
 
	private boolean parceria;

	public Ex11Fornecedor(String nome, String razaoSocial, long CNPJ,boolean parceria) {
		super(nome,razaoSocial,CNPJ);
		this.parceria = parceria;
	}

	@Override
	public String toString() {
		if(parceria == true) {
			return "\n Nome do fornecedor: "+getNome()+ 
				   "\n Razão social do fornedor:"+getRazaoSocial()+
				   "\n CNPJ do fornedor:"+getCNPJ()+
			       "\n Este fornecedor tem parceria!";
		}
		return "\n Nome do fornecedor "+getNome()+ 
				   "\n Razão social do fornedor:"+getRazaoSocial()+
				   "\n CNPJ do fornedor:"+getCNPJ()+
			       "\n Este fornecedor não tem parceria!";
	}

	public boolean isParceria() {
		return parceria;
	}

	public void setParceria(boolean parceria) {
		this.parceria = parceria;
	}
}