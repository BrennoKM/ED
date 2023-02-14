package resolucaoLista1;

import java.util.ArrayList;
import java.util.List;

public class prova1_q3 {
	public static void main(String[] args) {
		MinhaPilha<Integer> pilha = new MinhaPilha<Integer>();
		
		pilha.desempilhar();
		pilha.empilhar(0);
		pilha.empilhar(1);
		pilha.empilhar(2);
		int a = pilha.desempilhar();
		a = pilha.desempilhar();
		a = pilha.desempilhar();
	}
}

class MinhaPilha<T> {

	List<T> pilha;
	int topo;

	public MinhaPilha() {
		topo = 0;
		pilha = new ArrayList<T>();
	}

	public void empilhar(T element) {
		pilha.add(element);
		System.out.println("Empilhado: " + pilha.get(topo));
		topo++;
	}

	public T desempilhar() {
		T element;
		if (topo == 0) {
			System.out.println("Pilha vazia");
			return null;
		} else {
			element = pilha.get(topo-1);
			System.out.println("Desempilhado: " + element);
			pilha.remove(topo-1);
			topo--;
			return element;
		}
	}
}
