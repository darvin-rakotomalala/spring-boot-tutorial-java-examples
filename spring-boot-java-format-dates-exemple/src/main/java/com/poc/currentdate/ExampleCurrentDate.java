package com.poc.currentdate;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class ExampleCurrentDate {

    // Exemple 1
    public void getCurrentDate1() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }

    // Exemple 2 en utilisant java.util.Date
    public void getCurrentDate2() {
        Date date = new Date(); // This object contains the current date value
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));
    }

    // Exemple 3 en utilisant API Calendar
    public void getCurrentDate3() {
        Calendar calendar = Calendar.getInstance(); // Returns instance with current date and time set
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(calendar.getTime()));
    }

    // Exemple 4 en utilisant API Date/Time LocalDate
    public void getCurrentDateWithLocalDate() {
        LocalDate date = LocalDate.now(); // Gets the current date
        // LocalDate dateZone = LocalDate.now(ZoneId.of("Europe/Paris")); // Gets current date in Paris
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(formatter));
    }

    // Exemple 5 en utilisant API Date/Time LocalTime
    public void getCurrentDateWithLocalTime() {
        LocalTime time = LocalTime.now(); // Gets the current time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(formatter));
    }

    // Exemple 6 en utilisant API Date/Time LocalDateTime
    public void getCurrentDateWithLocalDateTime() {
        LocalDateTime dateTime = LocalDateTime.now(); // Gets the current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateTime.format(formatter));
    }

    // Exemple 7 en utilisant API Date/Time ZonedDateTime
    public void getCurrentDateWithZonedDateTime() {
        ZonedDateTime dateTime = ZonedDateTime.now(); // Gets the current date and time, with your default time-zone
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateTime.format(formatter));
    }
}
