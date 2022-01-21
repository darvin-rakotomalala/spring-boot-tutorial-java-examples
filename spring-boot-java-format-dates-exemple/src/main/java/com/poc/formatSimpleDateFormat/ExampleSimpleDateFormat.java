package com.poc.formatSimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleSimpleDateFormat {

    // Exemple Formatting System.currentTimeMillis()
    public void FormattingCurrentTimeMillis() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM dd. yyyy. -- H:mm aa");
        String formatted = formatter.format(System.currentTimeMillis());
        System.out.println(formatted);
    }

    // Exemple Formatting java.util.Date
    public void FormattingJavaUtilDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM dd. yyyy. -- H:mm aa");
        Date date = new Date();
        String formatted = formatter.format(date);
        System.out.println(formatted);
    }

    // Exemple Formatting java.util.Calendar
    public void FormattingJavaUtilCalendar() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM dd. yyyy. -- H:mm aa");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1969, Calendar.AUGUST, 15, 17, 35, 27);

        // SimpleDateFormat works with Dates
        Date date = calendar.getTime();

        String formatted = formatter.format(date);
        System.out.println(formatted);
    }
}
