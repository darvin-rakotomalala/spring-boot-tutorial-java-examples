package com.poc.stringtointeger;

public class IntegerDecode {
    // decode(String s)- Accepte une chaîne et la décode en un entier
    public void ExempleDecode() {
        String string1 = "100";
        String string2 = "50";
        String string3 = "20";

        int number1 = Integer.decode(string1);
        int number2 = Integer.decode(string2);
        int number3 = Integer.decode(string3);

        System.out.println("Parsing String \"" + string1 + "\": " + number1);
        System.out.println("Parsing String \"" + string2 + "\": " + number2);
        System.out.println("Parsing String \"" + string3 + "\": " + number3);
    }
}
