package resolucaoLista1;

import java.util.ArrayList;
import java.util.List;

public class prova1_q2 {

	public static void main(String[] args) {
		int[] vetor = { 1, 3, 5, 1, 5, 1 };

		vetor = removeRep(vetor);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

	public static int[] removeRep(int[] vetor) {
		int[] v;
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] == vetor[j] && i != j) {
					vetor[j] = 7777777;
				}
			}
			if (vetor[i] != 7777777) {
				lista.add(vetor[i]);
			}
		}
		v = new int[lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			v[i] = lista.get(i);
		}

		return v;
	}
}
