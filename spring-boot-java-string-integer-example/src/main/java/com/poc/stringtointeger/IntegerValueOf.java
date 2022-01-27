package com.poc.stringtointeger;

public class IntegerValueOf {

    // valueOf(String s) - Accepte une chaîne et l'analyse en un entier
    // valueOf(int i) - Accepte un int et l'analyse en un entier
    // valueOf(String s, int radix) - Accepte une chaîne et renvoie un entier représentant la valeur, puis l'analyse avec la base donnée

    public void ExemplevalueOf() {
        int i = 10;
        String string1 = "100";
        String string2 = "100";
        String string3 = "Google";
        String string4 = "20";

        int number1 = Integer.valueOf(i);
        int number2 = Integer.valueOf(string1);
        int number3 = Integer.valueOf(string3, 32);
        int number4 = Integer.valueOf(string4, 8);

        System.out.println("Parsing int " + i + ": " + number1);
        System.out.println("Parsing String \"" + string1 + "\": " + number2);
        System.out.println("Parsing String \"" + string3 + "\" in base 32 : " + number3);
        System.out.println("Parsing String \"" + string4 + "\" in base 8 : " + number4);
    }
}
