package unidade2;

import java.util.Scanner;

public class JantarPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double valor_jantar, valor_jantar_cliente;
		int clientes;
		System.out.println("Digite o valor do jantar:");
		valor_jantar = teclado.nextDouble();
		System.out.println("Digite o número de clientes:");
		clientes = teclado.nextInt();
		valor_jantar_cliente = valor_jantar/clientes;
		System.out.println("O vlaor do jantar por cliente é: " + valor_jantar_cliente);
	}

}