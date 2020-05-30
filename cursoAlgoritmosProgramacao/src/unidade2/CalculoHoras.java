package unidade2;

import java.util.Scanner;

public class CalculoHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int dias, horas, total_horas;
		System.out.println("Informe o número de dias da viagem:");
		dias = teclado.nextInt();
		System.out.println("Informe o número de horas da viagem:");
		horas = teclado.nextInt();
		total_horas = horas + (dias*24);
		System.out.println("O valor total de horas da viagem foi de: " + total_horas);
	}

}
