package resolucaoLista1;

import java.util.Scanner;

public class q03 {
	public static void main (String[]args) {
		try (Scanner in = new Scanner(System.in)) {
			int a, b;
			
			System.out.println("Digite um numero: ");
			a = in.nextInt();
			
			System.out.println("Digite outro numero: ");
			b = in.nextInt();
			
			System.out.println("Soma: " + (a+b));
			System.out.println("Subtracao: " + (a-b));
			System.out.println("Multiplicacao: " + (a*b));
			System.out.println("Quociente: " + (a/b));
			System.out.println("Resto: " + (a%b));
		}
		
	}
}