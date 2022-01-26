package com.poc.tostring;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String firstname;
    private String lastNamne;
    private LocalDate dob;

    public Person() {
    }

    public Person(String firstname, String lastNamne, LocalDate dob) {
        this.firstname = firstname;
        this.lastNamne = lastNamne;
        this.dob = dob;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastNamne() {
        return lastNamne;
    }

    public void setLastNamne(String lastNamne) {
        this.lastNamne = lastNamne;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastNamne='" + lastNamne + '\'' +
                ", dob=" + dob +
                '}';
    }
}
