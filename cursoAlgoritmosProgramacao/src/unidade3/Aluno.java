package unidade3;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		final int numero_avaliacoes = 4;
		double nota1, nota2, nota3, nota4, media;
		System.out.println("Digite a primeira nota: ");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = teclado.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = teclado.nextDouble();
		System.out.println("Digite a quarta nota: ");
		nota4 = teclado.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4)/numero_avaliacoes;
		System.out.println("A média final é: " + media);
		
		if(media < 5)
		{
			System.out.println("Aluno Reprovado");
		}
	}

}
