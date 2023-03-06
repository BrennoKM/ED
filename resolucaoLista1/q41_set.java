package resolucaoLista1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class q41_set {
	public static void main (String[]args) {
		HashSet<String> set = new HashSet<>();

        set.add("banana");
        set.add("ma��");
        set.add("laranja");

        // Verifica se o elemento existe no conjunto
        System.out.println("O conjunto cont�m a palavra banana? " + set.contains("banana"));

        // Remove um elemento do conjunto
        set.remove("ma��");

        // Percorre todos os elementos do conjunto
        for (String fruta : set) {
            System.out.println(fruta);
        }
        
        
        LinkedHashSet<String> setLinkHashS = new LinkedHashSet<>();

        setLinkHashS.add("banana");
        setLinkHashS.add("ma��");
        setLinkHashS.add("laranja");

        // Verifica se o elemento existe no conjunto
        System.out.println("O conjunto cont�m a palavra banana? " + setLinkHashS.contains("banana"));

        // Remove um elemento do conjunto
        setLinkHashS.remove("ma��");

        // Percorre todos os elementos do conjunto na ordem em que foram inseridos
        for (String fruta : setLinkHashS) {
            System.out.println(fruta);
        }
        
        
        
        TreeSet<String> setTree = new TreeSet<>();

        setTree.add("banana");
        setTree.add("ma��");
        setTree.add("laranja");

        // Verifica se o elemento existe no conjunto
        System.out.println("O conjunto cont�m a palavra banana? " + setTree.contains("banana"));

        // Remove um elemento do conjunto
        setTree.remove("ma��");

        // Percorre todos os elementos do conjunto em ordem alfab�tica
        for (String fruta : setTree) {
            System.out.println(fruta);
        }
        
	}
	
	/*	HashSet: � a implementa��o mais r�pida e usa uma tabela de hash para armazenar os elementos, sem garantir 
	 * 	qualquer ordem espec�fica. Como n�o h� nenhuma ordem garantida, a ordem de inser��o dos elementos n�o �
	 *  mantida.

    	LinkedHashSet: � uma subclasse do HashSet e usa uma lista duplamente encadeada para armazenar os elementos,
    	mantendo a ordem de inser��o. Ele tamb�m � um pouco mais lento que o HashSet devido � necessidade de manter a lista encadeada.

    	TreeSet: � uma implementa��o que garante a ordem natural dos elementos (ou uma ordem definida
    	por um Comparator), tornando-o �til para situa��es em que a ordem � importante. Ele usa uma estrutura
    	de �rvore balanceada para armazenar os elementos, o que o torna mais lento do que o HashSet e o
    	LinkedHashSet em algumas opera��es.
    */
}
