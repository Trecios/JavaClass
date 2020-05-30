package unidade2;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o núnero:");
		int numero = teclado.nextInt();
		int anterior = numero - 1;
		int posterior = numero + 1;
		System.out.println("O valor do número anterior é " + anterior + " e do posterior é " + posterior);
		
	}

}
