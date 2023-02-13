package resolucaoLista1;

public class q37 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(sumRecursive(a, b));
		System.out.println(sumLoop(a, b));
	}
	
	public static int sumRecursive(int start, int end) {
	    if (start > end) {
	        return 0;
	    } else {
	        return start + sumRecursive(start + 1, end);
	    }
	}
	
	public static int sumLoop(int start, int end) {
	    int total = 0;
	    for (int i = start; i <= end; i++) {
	        total += i;
	    }
	    return total;
	}
	/*
	Prós da solução recursiva:

	    É uma solução elegante e concisa para problemas que são naturalmente recursivos.
	    Pode ser mais fácil de entender e explicar para outros programadores.

	Contras da solução recursiva:

	    Pode consumir muita memória devido à pilha de chamadas recursivas.
	    Pode ser mais lento do que uma solução com estrutura de repetição, especialmente para problemas de tamanho grande.

	Prós da solução com estrutura de repetição:

	    É mais eficiente em termos de uso de memória.
	    Pode ser mais rápido do que uma solução recursiva, especialmente para problemas de tamanho grande.

	Contras da solução com estrutura de repetição:

	    Pode ser menos elegante e mais difícil de entender e explicar para outros programadores.
	    Pode ser mais difícil de implementar corretamente para problemas que são naturalmente recursivos.

	*/
}
