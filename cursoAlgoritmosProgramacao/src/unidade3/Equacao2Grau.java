package unidade3;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		double delta, x1, x2;
		System.out.println("Digite o valor de a: ");
		a = teclado.nextInt();
		System.out.println("Digite o valor de b: ");
		b = teclado.nextInt();
		System.out.println("Digite o valor de c: ");
		c = teclado.nextInt();
		delta = (b*b)-(4*a*c);
		if(delta > 0)
		{
			x1 = ((-b) + Math.sqrt(delta))/(2*a);
			x2 = ((-b) - Math.sqrt(delta))/(2*a);
			System.out.println("X1 = " + x1 + " e X2 = " + x2);
		}
	}

}
