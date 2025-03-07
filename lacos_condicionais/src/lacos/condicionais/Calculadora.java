package lacos.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoOperacao;
		float numero1, numero2, resultado;
		String operacao;
		
		System.out.print("Digite o 1º número: ");
		numero1 = sc.nextFloat();
		
		System.out.print("Digite o 2º número: ");
		numero2 = sc.nextFloat();
		
		System.out.println("Operação: ");
		System.out.println("[1] Soma (+)");
		System.out.println("[2] Subtração (-)");
		System.out.println("[3] Multiplicação (*)");
		System.out.println("[4] Divisão (/)");
		codigoOperacao = sc.nextInt();
		
		System.out.println();
		
		switch (codigoOperacao) {
		
		case 1:
			resultado = numero1 + numero2;
			operacao = "+";
			System.out.printf("%.1f %s %.1f = %.1f", numero1, operacao, numero2, resultado);
			break;
		
		case 2:
			resultado = numero1 - numero2;
			operacao = "-";
			System.out.printf("%.1f %s %.1f = %.1f", numero1, operacao, numero2, resultado);
			break;
			
		case 3:
			resultado = numero1 * numero2;
			operacao = "*";
			System.out.printf("%.1f %s %.1f = %.1f", numero1, operacao, numero2, resultado);
			break;
			
		case 4:
			resultado = numero1 / numero2;
			operacao = "/";
			System.out.printf("%.1f %s %.1f = %.1f", numero1, operacao, numero2, resultado);
			break;
			
		default:
			System.out.println("Operação inválida!");
		
		}
		
		sc.close();

	}

}
