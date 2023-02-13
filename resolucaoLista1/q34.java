package resolucaoLista1;

import java.util.Scanner;

public class q34 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String frase = "estude muito sempre sempre estude";

		String[] palavras = frase.split(" ");

		DicioPalavra[] dicio = new DicioPalavra[palavras.length];

		for (int i = 0; i < palavras.length; i++) {
			dicio[i] = new DicioPalavra();
			dicio[i].palavra = palavras[i];
			dicio[i].vezes = 1;
		}

		for (int i = 0; i < palavras.length; i++) {
			for (int j = i + 1; j < palavras.length; j++) {
				if (dicio[i].palavra != null && dicio[i].palavra.equals(dicio[j].palavra)) {
					dicio[i].vezes++;
					dicio[j].palavra = null;
				}
			}
		}
		
		for(int i = 0; i < dicio.length; i++) {
			if (dicio[i].palavra != null) {
				System.out.println("Palavra: " + dicio[i].palavra);
				System.out.println("Vezes: " + dicio[i].vezes);
			}
		}

	}
}

class DicioPalavra {
	String palavra;;
	int vezes;
}
