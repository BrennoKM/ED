package resolucaoLista1;

import java.util.Scanner;

public class q07 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite o num A: ");
		float a = in.nextFloat();
		
		System.out.println("Digite o num B: ");
		float b = in.nextFloat();
	
		if(b==0) {
			System.out.println("Impossível dividir por ZERO!");
		} else {
			System.out.println("A/B = " + (a/b));
		}
	
	}
}
