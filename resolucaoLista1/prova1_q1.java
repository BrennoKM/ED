package resolucaoLista1;

public class prova1_q1 {

	public static void main(String[] args) {
		System.out.println(somaRec(5));
		System.out.println(fatoFor(5));
	}

	public static int somaRec(int n) {
		if (n == 0) {
			return 0;
		}

		return n + somaRec(n - 1);
	}
	
	public static int fatoFor(int n) {
		int fat = 1;
		for(int i = n; i > 1; i--) {
			fat *= i;
		}
		return fat;
	}
}
