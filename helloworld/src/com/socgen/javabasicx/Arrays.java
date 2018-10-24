package com.socgen.javabasicx;

public class Arrays {
    public static void main(String[] args) {
	int[] ints = new int[10];

	for (int i = 0; i < ints.length; i = i++) {
	    ints[i] = i;
	    System.out.println("index" + i + "value=" + ints[i]);

	}
    }
}
