package exerciciosPOO;

public class Artigo {
	
	private String nome;
	private Float preco;
 
	public Artigo() {	
	
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setPreco(Float preco){
		this.preco = preco;
	}
	
	public String getNome(){
		return this.nome;	
	}
	public Float getPreco(){
		return this.preco;
	}
}