package ssg.LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class C01_LocalDate {
    /*
       soru 1)
       -bugunun tarihini obje olusturarak yazdirin
       -bugun yilin kacinci gunu oldugunu yazdirin
       -hangi gunde oldugumuzu yazdirin
       -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
       sout(tarih.plusYears(3).plus.Months(5).plusDays(7))
       -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
       -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
       -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
        */
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        System.out.println(bugun);//2023-01-26
        System.out.println(bugun.getDayOfYear());//26
        System.out.println(bugun.getDayOfWeek());//THURSDAY
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7));//2026-07-03
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7).getDayOfMonth());//3
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7).getDayOfWeek());//FRIDAY

        LocalDate tarih=LocalDate.of(2021, Month.NOVEMBER,15);
        System.out.println(tarih);//2021-11-15
        System.out.println(bugun.isBefore(tarih));
        if (bugun.isBefore(tarih)){
            System.out.println(bugun);
        }else if(tarih.isBefore(bugun)){
            System.out.println(tarih);
        }else
            System.out.println("iki tarih birbirine esit");//2021-11-15


    }
}
