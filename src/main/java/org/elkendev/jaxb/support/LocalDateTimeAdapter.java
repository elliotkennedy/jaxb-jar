package org.elkendev.jaxb.support;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter {

    public static LocalDateTime parseDate(String s) {
        return LocalDateTime.parse(s, DateTimeFormatter.ISO_DATE_TIME);
    }

    public static String printDate(LocalDateTime date) {
        return date.format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
