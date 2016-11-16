package exerciciosPOO;

public class CalculadoraGastos {
	int agua=0;
	int luz=0;
	int gas=0;
	int tele=0;
	float media;
	public void CalculaMedia(){
		media+=(agua+luz+gas+tele)/4;
	}
	public void CalculaGastos(){
		System.out.print("A media de despesas anual é: "+media);
	}
}
