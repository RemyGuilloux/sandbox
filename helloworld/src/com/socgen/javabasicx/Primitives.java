package com.socgen.javabasicx;

public class Primitives {

    public static void main(String[] salutLaCompagnie) {

	int a = 5;
	Integer b = Integer.valueOf(a);
	System.out.println(b);

	String c = "5";
	Integer d = Integer.valueOf(c);
	int e = d.intValue();
	System.out.println(e);
    }
}
