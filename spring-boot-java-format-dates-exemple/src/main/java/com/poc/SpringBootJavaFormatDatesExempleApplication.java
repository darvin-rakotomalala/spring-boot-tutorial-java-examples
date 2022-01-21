package com.poc;

import com.poc.currentdate.ExampleCurrentDate;
import com.poc.formatDateTimeFormatter.ExampleDateTimeFormatter;
import com.poc.formatSimpleDateFormat.ExampleSimpleDateFormat;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJavaFormatDatesExempleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJavaFormatDatesExempleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("**********************************************************");
        System.out.println("I- Example get Current Date and Time in Java");
        System.out.println("I-1- Exemple 1 obtenir la date et l'heure actuelles");
        ExampleCurrentDate example1 = new ExampleCurrentDate();
        example1.getCurrentDate1();

        System.out.println("==========================================================");
        System.out.println("I-2- Exemple 2 obtenir la date et l'heure actuelles en utilisant java.util.Date");
        ExampleCurrentDate example2 = new ExampleCurrentDate();
        example2.getCurrentDate2();

        System.out.println("==========================================================");
        System.out.println("I-3- Exemple 3 obtenir la date et l'heure actuelles en utilisant API Calendar");
        ExampleCurrentDate example3 = new ExampleCurrentDate();
        example3.getCurrentDate3();

        System.out.println("==========================================================");
        System.out.println("I-4- Exemple 4 obtenir la date et l'heure actuelles en utilisant API Date/Time LocalDate");
        ExampleCurrentDate example4 = new ExampleCurrentDate();
        example4.getCurrentDateWithLocalDate();

        System.out.println("==========================================================");
        System.out.println("I-5- Exemple 5 obtenir la date et l'heure actuelles en utilisant API Date/Time LocalTime");
        ExampleCurrentDate example5 = new ExampleCurrentDate();
        example5.getCurrentDateWithLocalDateTime();

        System.out.println("==========================================================");
        System.out.println("I-6- Exemple 6 obtenir la date et l'heure actuelles en utilisant API Date/Time LocalDateTime");
        ExampleCurrentDate example6 = new ExampleCurrentDate();
        example6.getCurrentDateWithLocalDateTime();

        System.out.println("==========================================================");
        System.out.println("I-7- Exemple 7 obtenir la date et l'heure actuelles en utilisant API Date/Time ZonedDateTime");
        ExampleCurrentDate example7 = new ExampleCurrentDate();
        example7.getCurrentDateWithZonedDateTime();

        System.out.println("**********************************************************");
        System.out.println("II-1- Exemple Formatting System.currentTimeMillis()");
        ExampleSimpleDateFormat exampleSDF1 = new ExampleSimpleDateFormat();
        exampleSDF1.FormattingCurrentTimeMillis();

        System.out.println("==========================================================");
        System.out.println("II-2- Exemple Formatting java.util.Date");
        ExampleSimpleDateFormat exampleSDF2 = new ExampleSimpleDateFormat();
        exampleSDF2.FormattingJavaUtilDate();

        System.out.println("==========================================================");
        System.out.println("II-3- Exemple Formatting java.util.Calendar");
        ExampleSimpleDateFormat exampleSDF3 = new ExampleSimpleDateFormat();
        exampleSDF3.FormattingJavaUtilCalendar();

        System.out.println("**********************************************************");
        System.out.println("III-1- Exemple Formatting LocalTime 1");
        ExampleDateTimeFormatter exampleDTF1 = new ExampleDateTimeFormatter();
        exampleDTF1.exampleFormattingLocalTime1();

        System.out.println("==========================================================");
        System.out.println("III-2- Exemple Formatting LocalTime 2");
        ExampleDateTimeFormatter exampleDTF2 = new ExampleDateTimeFormatter();
        exampleDTF2.exampleFormattingLocalTime2();

        System.out.println("==========================================================");
        System.out.println("III-3- Exemple Formatting LocalDate");
        ExampleDateTimeFormatter exampleDTF3 = new ExampleDateTimeFormatter();
        exampleDTF3.exampleFormattingLocalDate();

        System.out.println("==========================================================");
        System.out.println("III-4- Exemple Formatting LocalDateTime");
        ExampleDateTimeFormatter exampleDTF4 = new ExampleDateTimeFormatter();
        exampleDTF4.exampleFormattingLocalDateTime();

        System.out.println("==========================================================");
        System.out.println("III-5- Exemple Formatting LocalDateTime custom patterns");
        ExampleDateTimeFormatter exampleDTF5 = new ExampleDateTimeFormatter();
        exampleDTF5.exampleFormattingLocalDateTimeCustomPatterns();

        System.out.println("==========================================================");
        System.out.println("III-6- Exemple Formatting ZonedDateTime");
        ExampleDateTimeFormatter exampleDTF6 = new ExampleDateTimeFormatter();
        exampleDTF6.exampleFormattingZonedDateTime();

        System.out.println("==========================================================");
        System.out.println("III-7- Exemple Formatting ZonedDateTime custom patterns");
        ExampleDateTimeFormatter exampleDTF7 = new ExampleDateTimeFormatter();
        exampleDTF7.exampleFormattingZonedDateTimeCustomPatterns();
    }
}
