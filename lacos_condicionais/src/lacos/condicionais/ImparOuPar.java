package lacos.condicionais;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		System.out.println();
		
		if (numero % 2 == 0 && numero > 0) {
			System.out.printf("O número %d é par e positivo!\n", numero);
		}
		else if (numero % 2 == 0 && numero < 0) {
			System.out.printf("O número %d é par e negativo!\n", numero);
		}
		else if (numero % 2 != 0 && numero > 0) {
			System.out.printf("O número %d é ímpar e positivo!\n", numero);
		}
		else {
			System.out.printf("O número %d é ímpar e negativo!\n", numero);
		}
		
		sc.close();

	}

}
