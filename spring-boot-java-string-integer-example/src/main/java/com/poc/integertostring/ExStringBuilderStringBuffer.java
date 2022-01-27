package com.poc.integertostring;

public class ExStringBuilderStringBuffer {
    public void Example() {
        // StringBuffer est thread-safe mais plus lent,
        // alors qu'il StringBuilder n'est pas thread-safe mais est plus rapide.
        int i = 12345;

        String string = new StringBuilder().append(i).toString();
        String otherString = new StringBuffer().append(i).toString();

        System.out.println(string.equals(otherString));
        System.out.println(string == otherString);
        System.out.println(string);
        System.out.println(otherString);
    }
}
