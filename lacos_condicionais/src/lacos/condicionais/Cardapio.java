package lacos.condicionais;

import java.util.Scanner;

public class Cardapio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigoProduto, quantidadeProduto = 0;
		String produto = null;
		double precoProduto = 0, valorTotal;
		
		System.out.println("Código do produto: ");
		System.out.println("[1] Cachorro Quente");
		System.out.println("[2] X-Salada");
		System.out.println("[3] X-Bacon");
		System.out.println("[4] Bauru");
		System.out.println("[5] Refrigerante");
		System.out.println("[6] Suco de Laranja");
		codigoProduto = sc.nextInt();
		

			System.out.print("Quantidade: ");
			quantidadeProduto = sc.nextInt();
			
			switch (codigoProduto) {
			
			case 1:
				produto = "Cachorro Quente";
				precoProduto = 10.00;
				break;
			
			case 2: 
				produto = "X-Salada";
				precoProduto = 15.00;
				break;
			
			case 3:
				produto = "X-Bacon";
				precoProduto = 18.00;
				break;
			
			case 4:
				produto = "Bauru";
				precoProduto = 12.00;
				break;
			
			case 5:
				produto = "Refrigerante";
				precoProduto = 8.00;
				break;
			
			case 6:
				produto = "Suco de Laranja";
				precoProduto = 13.00;
				break;
				
			}
			
			valorTotal = quantidadeProduto * precoProduto;
			
			System.out.println();
			System.out.printf("Produto: %s%n", produto);
			System.out.printf("Valor total: R$ %.2f%n", valorTotal);
		
		sc.close();
		
	}
	
}