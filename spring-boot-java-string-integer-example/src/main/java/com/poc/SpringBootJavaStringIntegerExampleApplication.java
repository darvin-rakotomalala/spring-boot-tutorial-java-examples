package com.poc;

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
        System.out.println("1- Exemple méthode toString()");
        Person me = new Person("Adam", "McQuistan", LocalDate.parse("1987-09-23"));
        Person me2 = new Person("Adam", "McQuistan", LocalDate.parse("1987-09-23"));
        Person you = new Person("Jane", "Doe", LocalDate.parse("2000-12-25"));

        System.out.println("1. " + me);
        System.out.println("2. " + me2);
        System.out.println("3. " + you);

        System.out.println("==============================================");


    }
}
