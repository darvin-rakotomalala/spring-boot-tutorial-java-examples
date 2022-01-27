package com.poc.integertostring;

public class ExStringFormat {
    public void ExampleFormat() {
        /*
        Vous avez le choix entre plusieurs spécificateurs :
        %a - Sortie hexadécimale d'un nombre à virgule flottante
        %b - vrai si non nul, faux si nul
        %c - Caractère Unicode
        %d - Entier décimal
        %e - Notation scientifique d'un entier décimal
        %f - Nombre décimal à virgule flottante
        %g - Comme ci-dessus, mais éventuellement scientifique, selon la valeur
        %h- Chaîne hexadécimale de la valeur de retour hashCode()
        %n- Séparateur de ligne
        %o- Entier octal
        %s- Chaîne de caractères
        %t- Conversion date/heure
        %x- Chaîne hexagonale
        */

        int i = 12345;
        // exemple  concentrer sur %d
        String string = String.format("%d", i);
        System.out.println(string);

    }
}
