package resolucaoLista1;

import java.util.Scanner;

public class q26 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o tamanho do vetor: ");
		int tam = in.nextInt();
		
		int [] vetor = new int[tam];
		
		for(int i = 0; i < tam; i++) {
			System.out.println("Digite a posição " + i + " do vetor: ");
			vetor[i] = in.nextInt();
		}
		
		for(int i = 0; i< tam; i++) {
			System.out.println("Vetor[" +i+"] = " + vetor[i]);
		}
	}
}
