package operadores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = input.nextFloat();
		System.out.println("\nDigite o abono: ");
		abono = input.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Seu salário com abono é: %.2f", novoSalario);

	}

}
