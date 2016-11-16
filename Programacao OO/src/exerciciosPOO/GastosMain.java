package exerciciosPOO;

import java.util.Scanner;

public class GastosMain {
	public GastosMain() {
		CalculadoraGastos gastos = new CalculadoraGastos();
		System.out.print("Este programa faz a media das suas despesas anuais.");
		for(int i=0; i<12; i++){
			System.out.println("\n\nInsira as despesas do mês "+(i+1));
			System.out.print("Insira o valor das despesas da água: ");
			gastos.agua=(new Scanner(System.in)).nextInt();
			System.out.print("Insira o valor das despesas da luz: ");
			gastos.luz=(new Scanner(System.in)).nextInt();
			System.out.print("Insira o valor das despesas do gás: ");
			gastos.gas=(new Scanner(System.in)).nextInt();
			System.out.print("Insira o valor das despesas das telecomunicações: ");
			gastos.tele=(new Scanner(System.in)).nextInt();
			gastos.CalculaMedia();
		}
		gastos.CalculaGastos();
	}
}
