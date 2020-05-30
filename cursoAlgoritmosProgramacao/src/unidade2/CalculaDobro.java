package unidade2;

import java.util.Scanner;

public class CalculaDobro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu Número");
		double numero = teclado.nextDouble();
		double dobro = numero * 2;
		System.out.println("O dobro do número é " + dobro);
	}

}
