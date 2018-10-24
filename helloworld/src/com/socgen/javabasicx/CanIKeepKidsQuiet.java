package com.socgen.javabasicx;

public class CanIKeepKidsQuiet {

    public static void main(String[] args) {

	int gumballs;
	int kids;
	int gumballsPerKid;
	boolean eachKidGetsTen;

	gumballs = 140;
	kids = 15;
	gumballsPerKid = gumballs / kids;

	System.out.println("Vrai ou faux");
	System.out.println("Chaque enfant recoit 10 boules de gomme.");
	eachKidGetsTen = gumballsPerKid >= 10;
	System.out.println(eachKidGetsTen);

    }

}
