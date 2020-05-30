package unidade2;

import java.util.Scanner;

public class Locadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String titulo_filme;
		int horas_filme, minutos_filme, duracao_minutos;
		System.out.println("Digite o título do filme: ");
		titulo_filme = teclado.next();
		System.out.println("Digite o número de horas do filme: ");
		horas_filme = teclado.nextInt();
		System.out.println("Digite o número de minutos do filme: ");
		minutos_filme = teclado.nextInt();
		duracao_minutos = horas_filme*60 + minutos_filme;
		System.out.println("A duracao total do filme " + titulo_filme + ", em minutos, é de: " + duracao_minutos);
		
	}

}
