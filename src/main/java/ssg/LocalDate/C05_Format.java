package ssg.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_Format {
    public static void main(String[] args) {


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm a");
        LocalDateTime bugun=LocalDateTime.now();
        System.out.println(dtf.format(bugun.plusMonths(8)));//23/Eylül/26 01:45 ÖS


    }
}
