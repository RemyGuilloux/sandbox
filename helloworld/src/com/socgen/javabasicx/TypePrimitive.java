package com.socgen.javabasicx;

public class TypePrimitive {

    // déclaration des variables
    private double numberOne, numberTwo;

    // intialisation des variables dans le constructor

    public TypePrimitive(double numberOne, double numberTwo) {

	this.numberOne = numberOne;
	this.numberTwo = numberTwo;

    }

// creation de la methode add qui additionne 2 entier de type int
    public double add() {
	return numberOne + numberTwo;
    }

}
