package Aula11;

import java.util.ArrayList;
import java.util.List;

public class Ex11Executavel {
	public static void main(String[] args) {
		
		List<Ex11Produto> ListaProdutos = new ArrayList();
		List<Ex11Cliente> ListaClientes = new ArrayList();
		List<Ex11Fornecedor> ListaFornecedores = new ArrayList();
		
		List<Ex11Produto> ListaProdutos12 = new ArrayList();
		List<Ex11Cliente> ListaClientes12 = new ArrayList();
		List<Ex11Fornecedor> ListaFornecedores12 = new ArrayList();
		
		Ex11Cliente cliente1 = new Ex11Cliente("Fael",122,44521,false);
		
		ListaClientes.add(cliente1);
		ListaClientes.add(new Ex11Cliente("Jão",122,7771,false));
		ListaClientes.add(new Ex11Cliente("Gabriel",2020,321,false));
		
		ListaFornecedores.add(new Ex11Fornecedor("Peruzão","glu glu",434343421,true));
		ListaFornecedores.add(new Ex11Fornecedor("Nicolini","bla bla",77777777,true));
		
		ListaProdutos.add(new Ex11Produto("sla",20.0f));
		
	    Ex11Cliente cliente12 = new Ex11Cliente("FaFA",122,44521,false);
		
		ListaClientes12.add(cliente12);
		ListaClientes12.add(new Ex11Cliente("Tupac",122,7771,true));
		ListaClientes12.add(new Ex11Cliente("Big small",2020,321,true));
		
		ListaFornecedores12.add(new Ex11Fornecedor("West Side","num sei",88888888,true));
		ListaFornecedores12.add(new Ex11Fornecedor("tanto faz","não faço idéia",99999999,true));
		
		ListaProdutos12.add(new Ex11Produto("Rap",120.0f));
		
		Ex11Empresa empresa = new Ex11Empresa(ListaProdutos,ListaClientes,ListaFornecedores);
		Ex11Empresa empresa12 = new Ex11Empresa(ListaProdutos12,ListaClientes12,ListaFornecedores12);
		
		empresa12.vender(ListaProdutos12.get(0), ListaClientes12.get(0), empresa12.AVISTA);
		empresa.vender(ListaProdutos.get(0), ListaClientes.get(0), empresa.AVISTA);
		
		System.out.print("\n EMPRESA DUS GURI");
		System.out.print("\n");		
		System.out.print(empresa);
		System.out.print("---------------------------");
		System.out.print("\n EMPRESA DUS PIA");
		System.out.print("\n");	
		System.out.print(empresa12);
		
	}
}