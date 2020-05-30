package unidade2;

import java.util.Scanner;

public class LanHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		final int VALOR_POR_15_MINUTOS = 2;
		double horas, minutos, total_minutos, total_pagar;
		System.out.println("Digite a quantidade de horas usadas: ");
		horas = teclado.nextDouble();
		System.out.println("Digite a quantidade de minutos usados: ");
		minutos = teclado.nextDouble();
		total_minutos = horas*60 + minutos;
		total_pagar = Math.ceil(total_minutos/15)*VALOR_POR_15_MINUTOS;
		System.out.println("Valor a ser pago é de: R$" + total_pagar);
	}

}
