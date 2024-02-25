package Aula6;

public class Area {
	
private  String descricao;

public Area() {}
public Area(String descricao) {
	super();
	this.descricao = descricao;
}


@Override
public String toString() {
	return "Descricao da área:" + descricao;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}

}