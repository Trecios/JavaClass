package unidade3;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		
		if(numero%2==0)
		{
			System.out.println("O número é par");
		}
		else
		{
			System.out.println("O número é ímpar");
		}
	}

}
