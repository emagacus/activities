package com.epam.rdactivities;
import core.stringActivities.WithouEnd2;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
     withouEnd2("Hello") → "ell"
     withouEnd2("abc") → "b"
     withouEnd2("ab") → ""
     */
    public static void main(String[] args) {
        System.out.println(WithouEnd2.withouEnd2("hello"));
    }
}
