package resolucaoLista1;

import java.util.Scanner;

public class q02 {
	public static void main(String[] args) {
		int idade;
		double altura;
		char pLetra;
		String nome;

		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Digite seu nome: ");
			nome = in.nextLine();
			pLetra = nome.charAt(0);
			
			System.out.println("Digite sua idade: ");
			idade = in.nextInt();
			
			System.out.println("Digite sua altura: ");
			altura = in.nextDouble();
		}
		
		System.out
				.println("Nome: " + nome + "\nPrimeira Letra: " + pLetra + "\nIdade: " + idade + "\nAltura: " + altura);
	}
}
