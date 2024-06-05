package lacos.condicionais;

import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.print("Digite o nome do doador: ");
		nome = sc.nextLine();
		
		System.out.print("Digite a idade do doador: ");
		idade = sc.nextInt();
		
		System.out.print("Primeira doação de sangue? (true/false) ");
		primeiraDoacao = sc.nextBoolean();
		
		System.out.println();
		
		if (idade >= 18 && idade <= 69) {
			
			if (idade >= 60 && idade <= 69 && primeiraDoacao == true) {
				System.out.printf("%s não está apto(a) para doar sangue!", nome);
			}
			else if (primeiraDoacao == false) {
				System.out.printf("%s está apto(a) para doar sangue!", nome);
			}
			else {
				System.out.printf("%s está apto(a) para doar sangue!", nome);
			}
			
		}
		else {
			
			System.out.printf("%s não está apto(a) para doar sangue!", nome);
			
		}
		
		sc.close();
		
	}
	
}
