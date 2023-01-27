package ssg.ssg21localdates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_dateTimeFormetter {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy mm:hh a");
        LocalDateTime bugun = LocalDateTime.now();
        System.out.println(dtf.format(bugun));

    }
}
