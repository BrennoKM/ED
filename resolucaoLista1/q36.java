package resolucaoLista1;

import java.util.Scanner;

public class q36 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um número para calcular seu fatorial: ");
    int n = scan.nextInt();

    // Chama a função recursiva que calcula o fatorial
    int resultado = fatorial(n);
    System.out.println("O fatorial de " + n + " é " + resultado);
  }

  // Função recursiva para calcular o fatorial
  public static int fatorial(int n) {
    // Condição de parada da recursão
    if (n == 0) {
      return 1;
    }
    // Chama a si mesma, decrementando o valor de n a cada chamada
    // Até chegar ao caso base (n = 0)
    return n * fatorial(n - 1);
  }
}


