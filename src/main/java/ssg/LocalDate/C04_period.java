package ssg.LocalDate;

import java.time.LocalDate;
import java.time.Period;

public class C04_period {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate tarih=LocalDate.of(2023,5,14);
        Period period= Period.between(bugun,tarih);
        System.out.println(period);
        LocalDate tarih2=LocalDate.of(2021,6,17);
        Period obj=Period.between(tarih2,tarih);
        System.out.println(obj.getMonths());

        System.out.println(obj);

    }
}
