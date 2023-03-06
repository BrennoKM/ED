package resolucaoLista1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class q41_list {
	
	
	 public static void main(String[] args) {

	        // Criando um ArrayList de Strings
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("primeiro");
	        arrayList.add("segundo");
	        arrayList.add("terceiro");

	        // Imprimindo o conteúdo do ArrayList
	        System.out.println("ArrayList: " + arrayList);

	        // Criando um Vector de Integers
	        Vector<Integer> vector = new Vector<>();
	        vector.add(10);
	        vector.add(20);
	        vector.add(30);

	        // Imprimindo o conteúdo do Vector
	        System.out.println("Vector: " + vector);

	        // Criando uma LinkedList de Doubles
	        List<Double> linkedList = new LinkedList<>();
	        linkedList.add(1.5);
	        linkedList.add(2.5);
	        linkedList.add(3.5);

	        // Imprimindo o conteúdo da LinkedList
	        System.out.println("LinkedList: " + linkedList);

	        // Removendo o segundo elemento do ArrayList
	        arrayList.remove(1);

	        // Adicionando um novo elemento no índice 1 do Vector
	        vector.add(1, 25);

	        // Substituindo o segundo elemento da LinkedList
	        linkedList.set(1, 2.75);

	        // Imprimindo o conteúdo atualizado das listas
	        System.out.println("ArrayList atualizado: " + arrayList);
	        System.out.println("Vector atualizado: " + vector);
	        System.out.println("LinkedList atualizado: " + linkedList);

	    }
	 
	 /*     ArrayList e Vector: são implementações de um vetor redimensionável, ou seja, são listas indexadas.
	  *  Os elementos são armazenados em uma matriz interna que é redimensionada automaticamente quando o 
	  *  tamanho da lista é aumentado. A diferença principal entre eles é que o ArrayList não é sincronizado, 
	  *  enquanto o Vector é sincronizado. Isso significa que o Vector é uma escolha melhor em ambientes multithread.
	  

    		LinkedList: é uma lista duplamente encadeada. Cada elemento da lista contém referências ao elemento
    	anterior e posterior. Isso permite que a lista seja percorrida em ambas as direções e permite que a
    	lista seja modificada de maneira eficiente. É útil quando você precisa adicionar ou remover elementos
    	com frequência.
	*/
}
