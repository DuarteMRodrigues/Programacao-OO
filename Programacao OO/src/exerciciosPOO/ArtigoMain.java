package exerciciosPOO;

import java.util.Scanner;

public class ArtigoMain {
	public ArtigoMain() {
		
		Artigo artigo1 = new Artigo();
		Artigo artigo2 = new Artigo();
		Artigo artigo3 = new Artigo();
		
		Scanner scanner = new Scanner(System.in);
		float precoTotal = 0;
		
		System.out.print("Introduza o nome do primeiro artigo: ");
		artigo1.setNome(scanner.nextLine());
		System.out.print("Introduza o preço do primeiro artigo: ");
		artigo1.setPreco(scanner.nextFloat());
		scanner.nextLine();
		
		System.out.print("\nIntroduza o nome do segundo artigo: ");
		artigo2.setNome(scanner.nextLine());
		System.out.print("Introduza o preço do segundo artigo: ");
		artigo2.setPreco(scanner.nextFloat());
		scanner.nextLine();
		
		System.out.print("\nIntroduza o nome do terceiro artigo: ");
		artigo3.setNome(scanner.nextLine());
		System.out.print("Introduza o preço do terceiro artigo: ");
		artigo3.setPreco(scanner.nextFloat());
		scanner.nextLine();
		
		precoTotal = artigo1.getPreco() + artigo2.getPreco() + artigo3.getPreco();
		
		System.out.println("\nPrimeiro Artigo:\nNome: "+artigo1.getNome()+"\nPreço: "+artigo1.getPreco()+"€");
		System.out.println("\nSegundo Artigo:\nNome: "+artigo2.getNome()+"\nPreço: "+artigo2.getPreco()+"€");
		System.out.println("\nTerceiro Artigo:\nNome: "+artigo3.getNome()+"\nPreço: "+artigo3.getPreco()+"€");
		System.out.print("\n\nPreco Total: "+precoTotal+"€");
	}
}