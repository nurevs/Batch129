package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {

        //LinkedHashSet olusturma

        LinkedHashSet<String> artist=new LinkedHashSet<>();
        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Brad");
        artist.add("Angelina");
        artist.add("Tom");
        System.out.println(artist);//[Ajda, Tom, Brad, Angelina]/
        // Setler tekrarsiz eleman icerirler.Tekrarli elemani kabul etmez
        //ama biz yine ayni elemani tekrar koyarsak hata vermez

        LinkedHashSet<String> actress=new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist);//[Tom, Brad]





    }
}
