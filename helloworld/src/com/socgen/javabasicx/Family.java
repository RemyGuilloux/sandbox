package com.socgen.javabasicx;

public class Family {

    public static void main(String[] args) {

	String lastname = "Sylvie, Marc, R�my, C�cile, Diana, Laurent";
	String[] board = new String[6];
	board = lastname.split(", ");

	for (int i = 0; i < board.length; i++) {
	    if (board[i].equals("Sylvie") || board[i].equals("C�cile") || board[i].equals("Diana"))

		System.out.println(board[i] + " est une fille");
	    else
		System.out.println(board[i] + " est un gar�on");
	}

    }

}
