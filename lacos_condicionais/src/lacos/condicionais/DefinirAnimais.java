package lacos.condicionais;

import java.util.Scanner;

public class DefinirAnimais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String vertebradoOuNao, classeDoAnimal, alimentacao;
		
		System.out.print("O animal é vertebrado ou invertebrado? ");
		vertebradoOuNao = sc.nextLine();
		
		System.out.print("O animal é ave, mamífero, inseto ou anelídeo? ");
		classeDoAnimal = sc.nextLine();
		
		System.out.print("O animal é carnívoro, onívoro, herbívoro ou hematófago? ");
		alimentacao = sc.nextLine();
		
		System.out.println();
		
		if (vertebradoOuNao.equalsIgnoreCase("vertebrado")) {
			if (classeDoAnimal.equalsIgnoreCase("ave")) {
				if (alimentacao.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				} 
				else {
					System.out.println("Pomba");
				}
			}
			else {
				if (alimentacao.equalsIgnoreCase("onívoro")) {
					System.out.println("Homem");
				}
				else {
					System.out.println("Vaca");
				}
			}
			
		}
		else {
			if (classeDoAnimal.equalsIgnoreCase("inseto")) {
				if (alimentacao.equalsIgnoreCase("hematófago")) {
					System.out.println("Pulga");
				} 
				else {
					System.out.println("Lagarta");
				}
			}
			else {
				if (alimentacao.equalsIgnoreCase("hematófago")) {
					System.out.println("Sanguessuga");
				}
				else {
					System.out.println("Minhoca");
				}
			}

		}
		
		sc.close();

	}

}
