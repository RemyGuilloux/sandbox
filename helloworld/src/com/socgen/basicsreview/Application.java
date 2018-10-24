package com.socgen.basicsreview;

public class Application {

    public static void main(String[] args) {

	String majorityStr = args[0];

	Integer majority = Integer.valueOf(majorityStr);
	int maj = majority.intValue();
	System.out.println("Majority= " + maj);

	Person Cecile = new Person("Cecile", "GUILLOUX");
	Person Diana = new Person("Diana", "DUGAREVA", 24);

	System.out.println(Cecile);
	System.out.println(Diana);

    }

}
