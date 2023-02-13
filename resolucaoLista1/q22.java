package resolucaoLista1;

import java.util.Scanner;

public class q22 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite o primeiro número do intervalo");
		int a = in.nextInt();
		
		System.out.println("Digite o segundo número do intervalo");
		int b = in.nextInt();
		
		int c = 0;
		for(int i = a; i <= b; i++) {
			c +=i;
		}
		
		System.out.println("Somatorio: " + c);
	}
}
