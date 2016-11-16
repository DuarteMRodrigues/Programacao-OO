package exerciciosPOO;

public class CalculadoraGastos {
	private float agua=0;
	private float luz=0;
	private float gas=0;
	private float tele=0;
	
	public float totalGastos(float soma){
		soma=agua+luz+gas+tele;
		return soma;
	}
	
	public void setAgua(float agua){
		this.agua=agua;
	}
	
	public void setLuz(float luz){
		this.luz=luz;
	}
	
	public void setGas(float gas){
		this.gas=gas;
	}
	
	public void setTele(float tele){
		this.tele=tele;
	}
	
	public float getAgua(){
		return this.agua;
	}
	public float getLuz(){
		return this.luz;
	}
	public float getGas(){
		return this.gas;
	}
	public float getTele(){
		return this.tele;
	}
}
