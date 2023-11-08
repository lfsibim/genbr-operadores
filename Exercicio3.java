package operadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horaExtra, desconto, salarioLiquido;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = input.nextFloat();
		System.out.println("\nDigite o adicional noturno: ");
		adicionalNoturno = input.nextFloat();
		System.out.println("\nDigite as horas extras: ");
		horaExtra = input.nextFloat();
		System.out.println("\nDigite os descontos: ");
		desconto = input.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra * 5) - desconto;
		
		System.out.printf("\nSeu salário líquido é de: R$ %.2f", salarioLiquido);

	}

}
