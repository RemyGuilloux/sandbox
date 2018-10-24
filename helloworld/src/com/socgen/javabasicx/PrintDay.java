package com.socgen.javabasicx;

public class PrintDay {

    public static void main(String[] args) {

	Days[] tab = Days.values();
	for (int i = 0; i < tab.length; i++) {
	    System.out.println(tab[i]);
	}
    }

}
