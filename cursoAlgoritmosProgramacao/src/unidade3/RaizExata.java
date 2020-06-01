package unidade3;

import java.util.Scanner;

public class RaizExata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double raiz_exata, maior_valor;
		int numero = teclado.nextInt();
		raiz_exata = Math.sqrt(numero);
		maior_valor = Math.round(raiz_exata);
		if(raiz_exata == maior_valor)
		{
			System.out.println("Existe uma raiz exata para o número " + numero);
		}
	}

}
