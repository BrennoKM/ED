package resolucaoLista1;

import java.util.Scanner;

public class q28 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o tamanho do vetor: ");
		int tam = in.nextInt();
		
		int [] vetor = new int[tam];
		int maior = 0, menor = 0;
		for(int i = 0; i < tam; i++) {
			System.out.println("Digite a posição " + i + " do vetor: ");
			vetor[i] = in.nextInt();
		}
		
		for(int i = 0, j = tam-1; i< tam; i++, j--) {
			if(vetor[i] == vetor[j]) {
				maior = vetor[i];
				menor = vetor[i];
			}
			if(vetor[i] > vetor[j]) {
				if(vetor[i] > maior) {
					maior = vetor[i];
				}
				if(vetor[j] < menor) {
					menor = vetor[j];
				}
			}
			if(vetor[i] < vetor[j]) {
				if(vetor[j] > maior) {
					maior = vetor[j];
				}
				if(vetor[i] < menor) {
					menor = vetor[i];
				}
			}
			
		}
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
}
