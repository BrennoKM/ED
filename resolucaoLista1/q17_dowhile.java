package resolucaoLista1;

import java.util.Scanner;

public class q17_dowhile {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o numero A: ");
		int a = in.nextInt();

		System.out.println("Digite o numero B: ");
		int b = in.nextInt();

		do {
			if((a%2) ==0) {
			} else {
				System.out.println(a);
			}
			a++;
		} while (a <= b);

	}
}
