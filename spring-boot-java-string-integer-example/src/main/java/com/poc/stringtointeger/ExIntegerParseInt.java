package com.poc.stringtointeger;

public class ExIntegerParseInt {
    public void ExempleparseInt(){
        String string1 = "100";
        String string2 = "100";
        String string3 = "Google";
        String string4 = "20";

        // parseInt(String s)- Accepter la chaîne que nous aimerions analyser
        // parseInt(String s, int radix)- Accepter la chaîne ainsi que la base du système de numération

        int number1 = Integer.parseInt(string1);
        int number2 = Integer.parseInt(string2, 16);
        int number3 = Integer.parseInt(string3, 32);
        int number4 = Integer.parseInt(string4, 8);

        System.out.println("Parsing String \"" + string1 + "\": " + number1);
        System.out.println("Parsing String \"" + string1 + "\" in base 16 : " + number2);
        System.out.println("Parsing String \"" + string1 + "\" in base 32 : " + number3);
        System.out.println("Parsing String \"" + string1 + "\" in base 8 : " + number4);
    }
}
