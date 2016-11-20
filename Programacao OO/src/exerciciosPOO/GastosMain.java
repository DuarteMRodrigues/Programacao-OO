package exerciciosPOO;

import java.util.Scanner;

public class GastosMain {
	public GastosMain() {
		CalculadoraGastos gastos = new CalculadoraGastos();
		
		System.out.print("Este programa faz a media das suas despesas anuais.");
		float soma=0,media=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n\nInsira a media das despesas por mês");
		
		System.out.print("Insira o valor das despesas da água: ");
		gastos.setAgua(scanner.nextFloat());
		System.out.print("Insira o valor das despesas da luz: ");
		gastos.setLuz(scanner.nextFloat());
		System.out.print("Insira o valor das despesas do gás: ");
		gastos.setGas(scanner.nextFloat());
		System.out.print("Insira o valor das despesas das telecomunicações: ");
		gastos.setTele(scanner.nextFloat());
		
		soma+=gastos.totalGastos(soma);
		media=soma/4;
		System.out.print("\n\nEm media, por ano você gasta: "+media+"€ em cada despesa");
	}
}
