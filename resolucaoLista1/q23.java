package resolucaoLista1;

import java.util.Scanner;

public class q23 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite um número: ");
		int a = in.nextInt();
		int f = 1;
		for(int i = 1; i <= a; i++) {
			f *= i;
		}
		
		System.out.println("Fatorial: " + f);
	}
}
