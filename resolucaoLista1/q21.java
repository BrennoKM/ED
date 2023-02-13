package resolucaoLista1;

import java.util.Scanner;

public class q21 {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		int num = in.nextInt();
		int cont = 0;
		for (int i = 1; i < num; i++) {
			if ((num % i) == 0) {
				cont++;
			}
			if (cont > 2) {
				System.out.println("Não é primo.");
				System.exit(0);
			}
		}
		System.out.println("É primo.");
	}

}
