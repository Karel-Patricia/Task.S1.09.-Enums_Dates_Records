package nivel1.exercise1;

public class WhatDay {
    public static void printDayType(Day day) {
        switch (day) {
            case SATURDAY, SUNDAY -> System.out.println(day + " is a weekend.");
            default -> System.out.println(day + " is a weekday.");
        }
    }
}
