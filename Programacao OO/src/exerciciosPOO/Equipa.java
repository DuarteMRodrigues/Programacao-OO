package exerciciosPOO;

import java.util.Vector;

public class Equipa {
	private String nome="";
	private Vector<Integer> golos;
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setGolo(int golo,int i){
		if(this.golos.size()<i+1){
			for(int j=this.golos.size()-1;j<i;j++){
				this.golos.add(0);
			}
		}
		this.golos.set(i,golo);
	}
	
	public int getGolo(int i){
		return this.golos.get(i);
	}
	
}
