package com.poc.formatDateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ExampleDateTimeFormatter {
    // Java 8 -  le DateTimeFormatter de Java pour formater les dates - LocalDate, LocalDatetime, LocalTime et ZonedDateTime.
    // Exemple Formatting LocalTime
    public void exampleFormattingLocalTime1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        LocalTime time = LocalTime.now();
        System.out.println(time.format(formatter));
    }

    public void exampleFormattingLocalTime2() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
        LocalTime time = LocalTime.now();
        System.out.println(time.format(formatter));
    }

    // Exemple Formatting LocalDate
    public void exampleFormattingLocalDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        LocalDate d = LocalDate.now();
        System.out.println(d.format(formatter));
    }

    // Exemple Formatting LocalDateTime
    public void exampleFormattingLocalDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(formatter));
    }

    public void exampleFormattingLocalDateTimeCustomPatterns() {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("eee, MMM dd. yyyy.\nHH:mm:ss a");
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.format(formatter));
    }

    // Exemple Formatting ZonedDateTime
    public void exampleFormattingZonedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        ZonedDateTime dateTime = ZonedDateTime.now();

        System.out.println(dateTime.format(formatter));
    }

    public void exampleFormattingZonedDateTimeCustomPatterns() {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("eee, MMM dd. yyyy.\nHH:mm:ss a - zzzz");
        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime.format(formatter));
    }

}
