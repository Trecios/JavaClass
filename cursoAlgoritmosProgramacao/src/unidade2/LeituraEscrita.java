package unidade2;

import java.util.Scanner;

public class LeituraEscrita {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		String nome = teclado.next();
		System.out.println("Seja bem-vindo "+nome);
	}

}
