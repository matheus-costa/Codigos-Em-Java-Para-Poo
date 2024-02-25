package Aula11;

public class Ex11Cliente extends Ex11PessoaFisica{
  private boolean vip;

 
public Ex11Cliente() {
	super();
}
public Ex11Cliente(String nome, long RG, long CPF,boolean vip) {
	super(nome, RG, CPF);
	this.vip = vip;
}
@Override
public String toString() {
	
	if(vip == true) {
		return 
				"\n Nome do cliente:"+getNome()+
				"\n RG do cliente:"+getRG()+
				"\n CPF do cleinte:"+getCPF()+
				"\n Este cliente é VIP.";
	}else
	return "\n Nome do cliente:"+getNome()+
			"\n RG do cliente:"+getRG()+
			"\n CPF do cleinte:"+getCPF()+
			"\n Este não é cliente é VIP.";
}

public boolean isVip() {
	return vip;
}
public void setVip(boolean vip) {
	this.vip = vip;
}
}