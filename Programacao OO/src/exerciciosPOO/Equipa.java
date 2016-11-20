package exerciciosPOO;

public class Equipa {
	private String nome="";
	private String nomeFora="";
	private Integer golos=0;
	
	public Equipa(String nome, String nomeFora, Integer golos){
		this.nome=nome;
		this.nomeFora=nomeFora;
		this.golos=golos;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setNomeFora(String nomeFora) {
		this.nomeFora=nomeFora;
	}
	public void setGolos(Integer golos){
		this.golos=golos;
	}
	
	public String getNomeFora(){
		return this.nomeFora;
	}
	public String getNome(){
		return this.nome;
	}
	public int getGolos(){
		return this.golos;
	}
}
