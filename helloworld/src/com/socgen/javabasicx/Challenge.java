package com.socgen.javabasicx;

public class Challenge {

    /**
     * Créer un tableau de taille 10 Avec les 10 première lettre de l'alphabet
     * Afficher chaque lettre Transformer la première lettre en J et la derniere
     * lettre en z
     */

    public static void main(String[] args) {

	String mot = "ABCDEFJKLM";
	char[] tab = mot.toCharArray();
	for (int i = 0; i < tab.length; i++) {
	    System.out.println(tab[i]);
	}
	System.out.println("    ");
	tab[0] = 'J';
	tab[6] = 'Z';
	for (int i = 0; i < tab.length; i++) {
	    System.out.print(tab[i]);

	}

    }

}
