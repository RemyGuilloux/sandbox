package com.socgen.javabasicx;

/**
 * 
 * @author Administrateur
 *
 */
public class ArrayN1 {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

	String word = "Bonjour"; // Déclaration et intialisation de la variable de type String

	char[] tab = word.toCharArray(); // Convertir un objet de type String en un tableau

	for (int i = 0; i < tab.length; i++) { // Boucle for sur la longeur du tableau

	    System.out.print(tab[i]);// Impression sur la console du tableau
	}

    }

}
