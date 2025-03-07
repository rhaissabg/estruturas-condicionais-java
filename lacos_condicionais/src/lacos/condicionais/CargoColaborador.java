package lacos.condicionais;

import java.util.Scanner;

public class CargoColaborador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigoCargo;
		String nome, cargo = null;
		double salario, salarioReajustado, reajuste = 0;
		
		System.out.print("Nome do colaborador: ");
		nome = sc.nextLine();
		
		System.out.println("Cargo do colaborador: ");
		System.out.println("[1] Gerente");
		System.out.println("[2] Vendedor");
		System.out.println("[3] Supervisor");
		System.out.println("[4] Motorista");
		System.out.println("[5] Estoquista");
		System.out.println("[6] Técnico de TI");
		codigoCargo = sc.nextInt();
		
		System.out.print("Salário do colaborador: ");
		salario = sc.nextDouble();
		
		switch (codigoCargo) {
		
		case 1:
			cargo = "Gerente";
			reajuste = 0.10;
			break;
		
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07;
			break;
			
		case 3: 
			cargo = "Supervisor";
			reajuste = 0.09;
			break;
			
		case 4: 
			cargo = "Motorista";
			reajuste = 0.06;
			break;
		
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05;
			break;
		
		case 6: 
			cargo = "Técnico de TI";
			reajuste = 0.08;
			break;
			
		}
		
		salarioReajustado = salario + (reajuste * salario);
		
		System.out.println();
		System.out.printf("Nome do colaborador: %s%n", nome);
		System.out.printf("Cargo: %s%n", cargo);
		System.out.printf("Salário: %.2f%n", salarioReajustado);
		
		
		sc.close();
		
	}
	
}
