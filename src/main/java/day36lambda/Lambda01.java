package day36lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ayse", "Ada", "Okan", "Semih",
                "Gulsen", "Ali", "Zeynepx", "Semih", "bilal","nurevsan","suleyman"));


        alfBykTkrsz(isimler);//ADA ALİ AYSE BİLAL GULSEN OKAN SEMİH ZEYNEP
        System.out.println();
        chrctrTrsTkrsz(isimler);//6 5 4 3
        System.out.println();
        chrctrKckByk(isimler);//6 5 4 3
        System.out.println();
        elmnchrctrnoyedi(isimler);//list elemanlari 7 harften buyuk
        System.out.println();
        elmnWBs(isimler);//w ile baslayan yok
        System.out.println();
        xIleBtn(isimler);//x ile biten isimler
        System.out.println();
        karakterSayisiEnBuyuk(isimler);//[nurevsan]
        System.out.println();
        sonHarfineGore(isimler);//Ayse Semih Semih Ali bilal Okan Gulsen nurevsan suleyman Zeynepx
        System.out.println();
        karakterSayisiCift(isimler);//64 36 16



    }//main

    //Yazdir methodu
    public static void yazdir(String a) {

        System.out.println(a + " ");

    }


    // Task -1 : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.

    public static void alfBykTkrsz(List<String> isimler) {

        isimler.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }


    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..

    public static void chrctrTrsTkrsz(List<String> isimler) {
        isimler.
                stream().

                map(String::length).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));

    }

    // Task-3 : List elemanlarini, character sayisina gore kckten byk e gore print ediniz..

    public static void chrctrKckByk(List<String> isimler) {

        isimler.
                stream().
                map(String::length).
                sorted().forEach(t -> System.out.print(t+" "));

    }
    // Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void elmnchrctrnoyedi(List<String> isimler) {

        //1.yol
        isimler.
                stream().
                map(String::length).
                filter(t-> t<=7).
                forEach(t -> System.out.print(t+" "));

        //2.yol
        System.out.println( isimler.
                stream().//akisa alindi
                        allMatch(t->t.length()<=7) ? "list elemanlari 7 ve 7 den daha az harften olusuyor "
                : "list elemanlari 7 harften buyuk");

        //allMatch() Mukemmelliyetcidir. Buyun elemanlar true dondururse sonuc "true" doner.
        //Bir eleman false olsa ,sonuc "false" doner.
        //anyMatch() En az bir eleman sarti saglarsa "true" dondurur.
        //noneMatch() hicbir eleman sarti saglamazsa true dondurur.
    }
    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.

    public static void elmnWBs(List<String> isimler) {

        System.out.println(
                isimler.
                        stream().
                        noneMatch(t -> t.startsWith("w"))? "w ile baslayan yok"
                        : "w ile baslayan isimler");





    }

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mı kontrol ediniz.


    public static void xIleBtn(List<String> isimler) {

        System.out.println(isimler.
                stream().
                anyMatch(t -> t.endsWith("x"))? "x ile biten isimler"
                : "x ile biten yok");

    }
    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karakterSayisiEnBuyuk(List<String> isimler){
        Stream<String> sonIsim= isimler.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).
                        reversed()).
                limit(5);//limit() icerisinde hangi rakami yazarsaniz o kadar data getirir.
        //Stream<String> clasindan gelir
        System.out.println(Arrays.toString(sonIsim.toArray()));// stream olan akisi Array'e cevirdim.

    }


    // Task-8 : list elemanlarini son harfine göre siralayıp ilk
    // eleman hariç kalan elemanlari print ediniz.

    public static void sonHarfineGore(List<String> isimler) {

        isimler.
                stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                skip(1).forEach(t -> System.out.print(t + " "));

    }


    // Task-9 : Karakter sayilari cift olan elemanlarin karakter sayilarinin karelerini hesaplayan;
    // tekrarli olanlari sadece bir kere buyukten kucuge  yazdiran programi yaziniz

    public static void karakterSayisiCift(List<String> isimler){


        isimler.
                stream().
                filter(t-> t.length()%2==0).
                map(t-> t.length()*t.length()).
                distinct().sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));
    }
}
