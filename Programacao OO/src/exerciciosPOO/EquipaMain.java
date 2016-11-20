package exerciciosPOO;

import java.util.Scanner;

public class EquipaMain{
	public EquipaMain(){
		float media=0;
		Scanner scanner = new Scanner(System.in);
		Equipa[] jogo = new Equipa[6];
		System.out.print("Insira a quantidade total de golos do jogo Panda-Caricas: ");
		jogo[0] = new Equipa("Panda","Caricas", scanner.nextInt());
		System.out.print("\nInsira a quantidade total de golos do jogo Panda-Bob: ");
		jogo[1] = new Equipa("Panda","Bob", scanner.nextInt());
		System.out.print("\nInsira a quantidade total de golos do jogo Panda-Pocoyo: ");
		jogo[2] = new Equipa("Panda","Pocoyo", scanner.nextInt());
		System.out.print("\nInsira a quantidade total de golos do jogo Caricas-Bob: ");
		jogo[3] = new Equipa("Caricas","Bob", scanner.nextInt());
		System.out.print("\nInsira a quantidade total de golos do jogo Caricas-Pocoyo: ");
		jogo[4] = new Equipa("Caricas","Pocoyo", scanner.nextInt());
		System.out.print("\nInsira a quantidade total de golos do jogo Bob-Pocoyo: ");
		jogo[5] = new Equipa("Bob","Pocoyo", scanner.nextInt());
		
		for(int i=0; i<6; i++){
			media+=jogo[i].getGolos();
		}
		media/=6;
		System.out.print("A media de golos é: "+media);
	}
}