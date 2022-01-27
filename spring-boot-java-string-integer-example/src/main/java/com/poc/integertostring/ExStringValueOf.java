package com.poc.integertostring;

public class ExStringValueOf {
    public void ExampleValueOf() {
        int i = 12345;

        String string = String.valueOf(i);
        String otherStrng = Integer.toString(i);

        System.out.println(string.equals(otherStrng));
        System.out.println(string == otherStrng);
        System.out.println(string);
        System.out.println(otherStrng);
    }
}
