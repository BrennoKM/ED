package resolucaoLista1;

import java.util.Scanner;

public class q24 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		boolean menu = true;
		do {
			System.out.println("Escolha uma opção: \n1. Potenciação\n2. Raiz quadrada\n3. Fatorial\n4. Sair");
			int escolha = in.nextInt();

			if (escolha != 4) {
				System.out.println("Agora digite o número para o calculo: ");
				int num = in.nextInt();
				switch (escolha) {
				case 1:
					System.out.println("Digite o valor da potencia: ");
					int p = in.nextInt();

					System.out.println("Resultado da potenciação: " + Math.pow(num, p));
					break;
				case 2:
					System.out.println("Raiz quadrada: " + Math.sqrt(num));
					break;

				case 3:
					int f = 1;
					for (int i = 1; i <= num; i++) {
						f *= i;
					}
					System.out.println("Fatorial: " + f);
					break;
				}
			} else {
				menu = false;
			}
			System.out.println("\n");
		} while (menu == true);
	}
}
