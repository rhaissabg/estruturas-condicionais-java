package lacos.condicionais;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigoOperacao;
		float valor = 0, saldo = 1000.0f;
		
		System.out.println("Operação: ");
		System.out.println("[1] Saldo");
		System.out.println("[2] Saque");
		System.out.println("[3] Depósito");
		codigoOperacao = sc.nextInt();
		
		if (codigoOperacao != 1 && codigoOperacao <= 3 ) {
			System.out.print("Valor: ");
			valor = sc.nextFloat();
		}
		
		System.out.println();
		
		switch (codigoOperacao) {
		
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f%n", saldo);
			break;
		
		case 2:
			System.out.println("Operação - Saque");
			
			if (saldo < valor) {
				System.out.println("Saldo insuficiente!");
			}
			else {
				saldo -= valor;
				System.out.printf("Novo saldo: R$ %.2f%n", saldo);
			}
			
			break;
		
		case 3:
			System.out.println("Operação - Depósito");
			saldo += valor;
			System.out.printf("Novo saldo: R$ %.2f%n", saldo);
			break;
			
		default:
			System.out.println("Operação inválida!");
			break;
		
		}
		
		sc.close();

	}

}
