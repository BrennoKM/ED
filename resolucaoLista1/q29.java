package resolucaoLista1;

public class q29 {
	private static int[] array = { 8, 2, 1, 6, 5 }; // Define o array de números
	private static int index = 2; // Define o índice a ser movido

	public static void main(String[] args) {
		System.out.println("Entrada: ");
		// Imprime o array de entrada
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}

		// O loop a seguir move o número na posição "index" para a primeira posição,
		// caso seja necessário
		while (index > 0 && (array[index] < array[index - 1])) {
			// Armazena o número na posição "index" em uma variável temporária
			int temp = array[index];
			// Move o número da posição "index - 1" para a posição "index"
			array[index] = array[index - 1];
			// Move o número armazenado na variável temporária para a posição "index - 1"
			array[index - 1] = temp;
			// Decrementa o índice para continuar comparando e movendo o número
			index--;
		}

		System.out.println("\nSaida: ");
		// Imprime o array de saída
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}
}
