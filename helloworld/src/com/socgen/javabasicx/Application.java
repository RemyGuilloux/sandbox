package com.socgen.javabasicx;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */
public class Application {
    /**
     * 
     * @param This method initialize this Class
     */

    public static void main(String[] args) {

	System.out.println("Erire un chiffre");
	Scanner clavier = new Scanner(System.in);
	double number = clavier.nextInt();
	System.out.println(number);

	System.out.println("Ecrire un autre chiffre");
	double number2 = clavier.nextInt();
	System.out.println(number2);
	clavier.close();

	// Instantiation new object
	TypePrimitive calc = new TypePrimitive(number, number2);
	// Impression on screen of method add
	System.out.println("la somme des deux chiffre ecrit est " + (calc.add()));

    }

}
