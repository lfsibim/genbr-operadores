package operadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		nota2 = input.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		nota3 = input.nextFloat();
		System.out.println("\nDigite a quarta nota: ");
		nota4 = input.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nSua média final foi de: %.1f", media);		

	}

}
