package unidade2;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double taxa_garcom = 0.1;
		double valor_jantar, valor_jantar_total;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor do jantar");
		valor_jantar = teclado.nextDouble();
		valor_jantar_total = valor_jantar + (valor_jantar*taxa_garcom);
		System.out.println("O valor total a ser pago é: " + valor_jantar_total);
		
		
	}

}
