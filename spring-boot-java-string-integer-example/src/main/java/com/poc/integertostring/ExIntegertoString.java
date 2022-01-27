package com.poc.integertostring;

public class ExIntegertoString {
    public void ExampletoString() {
        int i = 12345;

        String string = Integer.toString(i);
        String otherString = new Integer(i).toString();

        System.out.println(string.equals(otherString));
        System.out.println(string == otherString);
        System.out.println(string);
        System.out.println(otherString);
    }
}
