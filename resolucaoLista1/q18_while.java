package resolucaoLista1;

import java.util.Scanner;

public class q18_while {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String senha = "senhaboa";

		System.out.println("Digite sua senha: ");
		String tentativa = in.next();

	

		while (!(senha.equals(tentativa))){
			System.out.println("Senha incorreta. Digite novamente.");
			tentativa = in.next();
		}
		System.out.println("Login bem sucedido");
	}
}
