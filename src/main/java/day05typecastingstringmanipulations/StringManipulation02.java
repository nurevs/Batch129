package day05typecastingstringmanipulations;

public class StringManipulation02 {


    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //ex1 : " s " String inin "money" ile bitip bitmedigini kontrol ediniz

        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //ex2:" s " String inin "money" kelimesini dolar kelimesine ceviriniz

        String rePlace = s.replace("money", "dollar");
        System.out.println(rePlace);

        //ex3:earn change to win
        String rePlace2 = s.replace("earn", "win");
        System.out.println(rePlace2);//Lwin Java win money

        //ex a change to *
        //note : replace() methodunda coklu karakter kullanacaksaniz mecbur cift tirnak kullanacaksiniz
        //ama tek karakter ise cift ya da tek tirnak kullanabilirisniz
        //note:ama ya ikisi de cift tirnak olmali ya da ikisi de tek tirnak olmali

        String rePlace3 = s.replace("a", "*");
        System.out.println(rePlace3);//Le*rn J*v* e*rn money

        // n change to XXX
        String rePlace4 = s.replace("n", "XXX");
        System.out.println(rePlace4);

        //ex6 : butun e sil
        //note: "Hicbir sey" char data type inda yojtur o yuzden replace()methodu kullanarak silme islemi yaparsaniz mutlaka "" cift tinak kullanilir
        String rePlace5 = s.replace("e", "");
        System.out.println(rePlace5);


        String t = "Ali 13 yasindadir!...";

        //ex7:"t" Stringindeki tum rakamlari "*" a cevriirniz
        //note:bir grup data yi degistirmek icin rePlaceAll()kullanilir
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        /*
    Meshur Regex'ler
    1) Tum rakamlar ==> [0-9]
    2) Tum kucuk harfler ==> [a-z]
    3) Tum buyuk harfler ==> [A-Z]
    4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
    5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
    6) Tum noktalama isaretleri ==> \\p{Punct}
    7)Tum sesli harfler [aeiou]
          x,q,w harfleri [xqw]

    8)Kucuk harflerden farkli tum karakterler ==> [^a-z]
      ^ demek " den farkli" demek
    9)space disindaki tum karakterler \\S  burda S spacenin S'si ve buyuk harf olmasi degil anlaminda

 */

        //Exp8: "t" Stringindeki tum rakamlari ve harfler "!" cevir

        String t2=s.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);

        //Exp9: "t" Stringindeki tum sesli harfler
        String t3=t.replaceAll("[aeiouAEIOU]","!");
        System.out.println(t3);

        //Exp10: "t" Stringindeki kucuk farkler disindaki tum karakleri "<>" ceviriniz

        String t4=t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

        //Exp11: "t" Stringindeki tum harfler dizisindeki tum karakterleri "+" ceviriniz
        String t5=t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        //EXP 12: "t"deki tum Stringleri spaceler disindakinleri "tl"

        String t6=t.replaceAll("[^ ]","tl");
        System.out.println(t6);

        //EXP 13: "t"deki tum Stringleri sesli harfler disindaki tum kr "&"

        String t7=t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7);




    }
}