package com.socgen.basicsreview;

public class Application {

//    private static void compare() {
//
//	boolean cond = false;
//
//	System.out.println();
//
//	System.out.println(cond);
//	System.out.println(true > false);
//	System.out.println(true == false);
//	System.out.println(true >= false);
//	System.out.println(true <= false);
//	System.out.println(true != false);
//
//    boolean cond = 10 < 0;
//
//    if(cond)
//    {
//	System.out.println("10 is not less than 0");
//
//    }else
//    {
//    }System.out.println("10 is betther than 0");

    int value = 10;
    {

	if (value == 0) {
	    System.out.println("value equal 0");
	} else if (value == 5) {
	    System.out.println("value equal 5");

	} else {
	    System.out.println("value equal" + value);
	}
    }

//
//	int value1 = 32;
//	Integer boxed = Integer.valueOf(value1);
//	Integer autoboxed = value1; // autoboxing
//	
//	int value2 = Integer.valueOf(32); // Unboxing
//	
//	
//	Integer boxeValue = null;
//	int unboxedValue = boxedValue;
//	System.out.println(unboxedValue);
//	System.out.println(boxedValue);
//	
//    }
//
    public static void main(String[] args) {
//
//	String cecileFirstname = args[1];
//	String cecileLastname = args[2];
//	String dianaFirstname = args[3];
//	String dianaLastname = args[3];
//	String cecileAge = args[4];
//
//	Integer age = Integer.valueOf(cecileAge);
//
//	Person Diana = new Person(args[0], dianaFirstname);
//	Person Cecile = new Person(cecileFirstname, cecileLastname, age.intValue());
//
//	Person Cecile = new Person("Cecile", "GUILLOUX", 33);
//	Person Diana = new Person("Diana", "DUGAREVA");
//
//	System.out.println(Cecile);
//	System.out.println(Diana);
//
//	compare();
//	autob;oxing();

	sum(2.2, 2.2, 2.2, 2.2, 2.2);
    }

    private static void sum(double... values) {

	double total = 0.0;
	for (double value : values) {
	    total += value;

	}

	System.out.println(total);
    }

}
