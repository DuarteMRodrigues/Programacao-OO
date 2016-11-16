package exerciciosPOO;

public class EquipaMain {
	public EquipaMain(){
		Equipa panda = new Equipa();
		panda.setGolo(0,0);
		panda.setGolo(1,1);
		panda.setGolo(2,2);
		panda.setGolo(3,3);
		for(int i=0; i<4; i++){
			System.out.print("Golos: "+panda.getGolo(i));
		}
		
	}
}
