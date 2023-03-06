package resolucaoLista1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class q41_set {
	public static void main (String[]args) {
		HashSet<String> set = new HashSet<>();

        set.add("banana");
        set.add("maçã");
        set.add("laranja");

        // Verifica se o elemento existe no conjunto
        System.out.println("O conjunto contém a palavra banana? " + set.contains("banana"));

        // Remove um elemento do conjunto
        set.remove("maçã");

        // Percorre todos os elementos do conjunto
        for (String fruta : set) {
            System.out.println(fruta);
        }
        
        
        LinkedHashSet<String> setLinkHashS = new LinkedHashSet<>();

        setLinkHashS.add("banana");
        setLinkHashS.add("maçã");
        setLinkHashS.add("laranja");

        // Verifica se o elemento existe no conjunto
        System.out.println("O conjunto contém a palavra banana? " + setLinkHashS.contains("banana"));

        // Remove um elemento do conjunto
        setLinkHashS.remove("maçã");

        // Percorre todos os elementos do conjunto na ordem em que foram inseridos
        for (String fruta : setLinkHashS) {
            System.out.println(fruta);
        }
        
        
        
        TreeSet<String> setTree = new TreeSet<>();

        setTree.add("banana");
        setTree.add("maçã");
        setTree.add("laranja");

        // Verifica se o elemento existe no conjunto
        System.out.println("O conjunto contém a palavra banana? " + setTree.contains("banana"));

        // Remove um elemento do conjunto
        setTree.remove("maçã");

        // Percorre todos os elementos do conjunto em ordem alfabética
        for (String fruta : setTree) {
            System.out.println(fruta);
        }
        
	}
	
	/*	HashSet: é a implementação mais rápida e usa uma tabela de hash para armazenar os elementos, sem garantir 
	 * 	qualquer ordem específica. Como não há nenhuma ordem garantida, a ordem de inserção dos elementos não é
	 *  mantida.

    	LinkedHashSet: é uma subclasse do HashSet e usa uma lista duplamente encadeada para armazenar os elementos,
    	mantendo a ordem de inserção. Ele também é um pouco mais lento que o HashSet devido à necessidade de manter a lista encadeada.

    	TreeSet: é uma implementação que garante a ordem natural dos elementos (ou uma ordem definida
    	por um Comparator), tornando-o útil para situações em que a ordem é importante. Ele usa uma estrutura
    	de árvore balanceada para armazenar os elementos, o que o torna mais lento do que o HashSet e o
    	LinkedHashSet em algumas operações.
    */
}
