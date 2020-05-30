package unidade2;

import java.util.Scanner;

public class OpcoesPagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double preco_produto;
		System.out.println("Digite o preço do produto:");
		preco_produto = teclado.nextDouble();
		System.out.println("À vista por: " + preco_produto*0.9 + " ou parcelado em 3 vezes de: " + preco_produto/3);
	}

}
