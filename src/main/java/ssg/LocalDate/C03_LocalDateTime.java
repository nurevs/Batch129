package ssg.LocalDate;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        /*
        soru 3)
bize bugunun tarihini ve su anki saati dondurun
bize 3 ay 100 saat sonraki tarih ve saati dondurun
bize 100 gun once 100 saat sonraki tarihi dondurun
bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
bize sadece bugunun tarihi dondurun
         */
        LocalDateTime bugun = LocalDateTime.now();
        System.out.println(bugun);//2023-01-26T10:23:16.885854100
        System.out.println(bugun.plusMonths(3).plusHours(100));//2023-04-30T14:24:35.145105200
        System.out.println(bugun.minusDays(100).plusHours(100));//2022-10-22T14:25:47.647533200
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(10).plusHours(1000).getDayOfWeek());//MONDAY
        System.out.println(bugun.toLocalDate());
        System.out.println(bugun.toLocalTime());
    }
}
