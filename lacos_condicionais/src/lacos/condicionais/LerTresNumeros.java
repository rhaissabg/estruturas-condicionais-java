package lacos.condicionais;

import java.util.Scanner;

public class LerTresNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.print("Digite o número A: ");
		a = sc.nextInt();
		
		System.out.print("Digite o número B: ");
		b = sc.nextInt();
		
		System.out.print("Digite o número C: ");
		c = sc.nextInt();
		
		soma = a + b;
		
		System.out.println();
		
		if (soma > c) {
			System.out.printf("%d + %d = %d > %d", a, b, soma, c);
		}
		else if (soma < c) {
			System.out.printf("%d + %d = %d < %d", a, b, soma, c);
		}
		else {
			System.out.printf("%d + %d = %d = %d", a, b, soma, c);
		}
		
		sc.close();

	}

}
