package exerciciosPOO;

import java.util.Scanner;

public class GastosMain {
	public GastosMain() {
		CalculadoraGastos gastos = new CalculadoraGastos();
		System.out.print("Este programa faz a media das suas despesas anuais.");
		for(int i=0; i<12; i++){
			System.out.println("\n\nInsira as despesas do m�s "+(i+1));
			System.out.print("Insira o valor das despesas da �gua: ");
			gastos.agua=(new Scanner(System.in)).nextInt();
			System.out.print("Insira o valor das despesas da luz: ");
			gastos.luz=(new Scanner(System.in)).nextInt();
			System.out.print("Insira o valor das despesas do g�s: ");
			gastos.gas=(new Scanner(System.in)).nextInt();
			System.out.print("Insira o valor das despesas das telecomunica��es: ");
			gastos.tele=(new Scanner(System.in)).nextInt();
			gastos.CalculaMedia();
		}
		gastos.CalculaGastos();
	}
}
