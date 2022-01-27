package com.poc;

import com.poc.integertostring.ExIntegertoString;
import com.poc.integertostring.ExStringBuilderStringBuffer;
import com.poc.integertostring.ExStringFormat;
import com.poc.integertostring.ExStringValueOf;
import com.poc.stringtointeger.ExIntegerParseInt;
import com.poc.stringtointeger.IntegerDecode;
import com.poc.stringtointeger.IntegerValueOf;
import com.poc.tostring.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class SpringBootJavaStringIntegerExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJavaStringIntegerExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("==============================================");
        System.out.println("I-1- Exemple méthode toString()");
        Person me = new Person("Adam", "McQuistan", LocalDate.parse("1987-09-23"));
        Person me2 = new Person("Adam", "McQuistan", LocalDate.parse("1987-09-23"));
        Person you = new Person("Jane", "Doe", LocalDate.parse("2000-12-25"));

        System.out.println("1. " + me);
        System.out.println("2. " + me2);
        System.out.println("3. " + you);

        System.out.println("==============================================");
        System.out.println("I-2.1- Exemple conversion String en Integer - Integer.parseInt()");
        ExIntegerParseInt exParseInt = new ExIntegerParseInt();
        exParseInt.ExempleparseInt();

        System.out.println("==============================================");
        System.out.println("I-2.2- Exemple conversion String en Integer - Integer.valueOf()");
        IntegerValueOf exValueOf = new IntegerValueOf();
        exValueOf.ExemplevalueOf();

        System.out.println("==============================================");
        System.out.println("I-2.3- Exemple conversion String en Integer - Integer.decode()");
        IntegerDecode exDecode = new IntegerDecode();
        exDecode.ExempleDecode();

        System.out.println("**********************************************");
        System.out.println("II-1- Exemple méthode String.valueOf()");
        ExStringValueOf exStringValueOf = new ExStringValueOf();
        exStringValueOf.ExampleValueOf();

        System.out.println("**********************************************");
        System.out.println("II-2- Exemple méthode Integer.toString()");
        ExIntegertoString exIntegertoString = new ExIntegertoString();
        exIntegertoString.ExampletoString();

        System.out.println("**********************************************");
        System.out.println("II-3- Exemple méthode String.format()");
        ExStringFormat exStringFormat = new ExStringFormat();
        exStringFormat.ExampleFormat();

        System.out.println("**********************************************");
        System.out.println("II-4- Exemple méthode StringBuilder and StringBuffer");
        ExStringBuilderStringBuffer exStringBuilderStringBuffer = new ExStringBuilderStringBuffer();
        exStringBuilderStringBuffer.Example();
    }
}
