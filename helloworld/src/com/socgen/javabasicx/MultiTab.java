package com.socgen.javabasicx;

public class MultiTab {

    public static void main(String[] args) {

	String[][] tableau2 = new String[][] { { "Calie", "Chien" }, { "Chouchou", "Lapin" } };
	for (int i = 0; i < tableau2.length; i++) {
	    for (int j = 0; j < tableau2[i].length; j++) {
		System.out.println(tableau2[i][j]);
	    }
	}

	Integer[][] tableau3 = new Integer[][] { { 1, 2 }, { 3, 4 } };
	for (int k = 0; k < tableau3.length; k++) {
	    for (int e = 0; e < tableau3[k].length; e++) {
		System.out.println(tableau2[k][e]);

	    }

	}
    }

}
