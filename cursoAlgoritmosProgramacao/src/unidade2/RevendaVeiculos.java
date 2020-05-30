package unidade2;

import java.util.Scanner;

public class RevendaVeiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String modelo;
		double preco_carro, entrada, restante;
		System.out.println("Digite o modelo do carro: ");
		modelo = teclado.next();
		System.out.println("Digite o preço do carro: ");
		preco_carro = teclado.nextDouble();
		entrada = preco_carro * 0.5;
		restante = (preco_carro - entrada)/12;
		System.out.println("O valor do carro modelo " + modelo + " com 50% de entrada é de " + entrada + " com 12 parcelas de " + restante);
	}

}
