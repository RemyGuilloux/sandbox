package com.socgen.javabasicx;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

	System.out.println("Rentrer un mot");
	Scanner keyboard = new Scanner(System.in);

	String echo = keyboard.nextLine();
	System.out.println("Le mot que vous avez rentré est " + echo);

	char letter = echo.charAt(0);
	System.out.println("la lettre de l'index 0 est " + letter);
	keyboard.close();

    }

}
