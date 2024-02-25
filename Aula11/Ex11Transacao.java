package Aula11;

public interface Ex11Transacao extends Ex11PagamentoAvista, Ex11PagamentoAprazo {

	public void pagar(float valor);
	public void receber(float valor);
}
