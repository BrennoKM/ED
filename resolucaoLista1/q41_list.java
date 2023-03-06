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

	        // Imprimindo o conte�do do ArrayList
	        System.out.println("ArrayList: " + arrayList);

	        // Criando um Vector de Integers
	        Vector<Integer> vector = new Vector<>();
	        vector.add(10);
	        vector.add(20);
	        vector.add(30);

	        // Imprimindo o conte�do do Vector
	        System.out.println("Vector: " + vector);

	        // Criando uma LinkedList de Doubles
	        List<Double> linkedList = new LinkedList<>();
	        linkedList.add(1.5);
	        linkedList.add(2.5);
	        linkedList.add(3.5);

	        // Imprimindo o conte�do da LinkedList
	        System.out.println("LinkedList: " + linkedList);

	        // Removendo o segundo elemento do ArrayList
	        arrayList.remove(1);

	        // Adicionando um novo elemento no �ndice 1 do Vector
	        vector.add(1, 25);

	        // Substituindo o segundo elemento da LinkedList
	        linkedList.set(1, 2.75);

	        // Imprimindo o conte�do atualizado das listas
	        System.out.println("ArrayList atualizado: " + arrayList);
	        System.out.println("Vector atualizado: " + vector);
	        System.out.println("LinkedList atualizado: " + linkedList);

	    }
	 
	 /*     ArrayList e Vector: s�o implementa��es de um vetor redimension�vel, ou seja, s�o listas indexadas.
	  *  Os elementos s�o armazenados em uma matriz interna que � redimensionada automaticamente quando o 
	  *  tamanho da lista � aumentado. A diferen�a principal entre eles � que o ArrayList n�o � sincronizado, 
	  *  enquanto o Vector � sincronizado. Isso significa que o Vector � uma escolha melhor em ambientes multithread.
	  

    		LinkedList: � uma lista duplamente encadeada. Cada elemento da lista cont�m refer�ncias ao elemento
    	anterior e posterior. Isso permite que a lista seja percorrida em ambas as dire��es e permite que a
    	lista seja modificada de maneira eficiente. � �til quando voc� precisa adicionar ou remover elementos
    	com frequ�ncia.
	*/
}
