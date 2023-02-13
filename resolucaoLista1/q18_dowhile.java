package resolucaoLista1;

import java.util.Scanner;

public class q18_dowhile {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String senha = "senhaboa";
		String tentativa;
		

		do{
			System.out.println("Digite sua senha: ");
			tentativa = in.next();
			
			if(!(senha.equals(tentativa))) {
				System.out.println("Senha incorreta, tente novamente.");
			}
		}while (!(senha.equals(tentativa)));
		System.out.println("Login bem sucedido");
	}
}
