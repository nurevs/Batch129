package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    /*

       1)Interface'lerden object olusturulamaz cunku interface'lerin constructor'ı yoktur.
       2)Abstract Class'larda object olusturulamaz,constructor'lari vardir  ama constructor object olusturmakta kullanılamaz.
       3)Interface'lerin constructor'lari olmadıgından collection olusturuken interface isimleri "new" keyword'undan sonra kullanılamaz.
       4)class     --> class     ==> extends
         class     --> interface --> implements
         interface --> interface --> extends
         interface --> class     --> Bu munkun degildir.


 */




    public static void main(String[] args) {

/*
Note: ArrayLists'ler eleman ekleme ve eleman silme konusunda başarısızdırlar.
Bu yüzden yapılacak application'da fazlaca eleman eklenip çıkarılacaksa ArrayList kullanılması tavsie edilmez.
Java Bu tarz işlemler için LinkedList'i oluşturmuştur.
LinkedList index kullanmadığı için eleman ekleme ve çıkarma işlemini oldukça kolay yapar.

 *LinkedList'lerde eleman yerine "Node" kelimesi kullanilir. En bastaki Node'a "Head", en sondaki Node'a "Tail" denir.
 *LinkedList'ler yapiları dolayisiyla index kullanmadıklarından, eleman silmede ve eklemede re-index yapilmasına gerek yoktur.
   Bu da LinkedList'leri eleman ekleme ve silmede çok başarılı hale getirir, bu yüzden eleman ekleme ve silmenin çok yapılması
   gereken durumlarda LinkedList kullanmak tavsiye edilir.
   6)LinkList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
 leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
 durumlarda LinkList kullanmak tavsiye edilir.
 7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
 8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
 bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

 */

        List<String> cityNames=new LinkedList<>();

        LinkedList<String> names=new LinkedList<>();

        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);//[Steve, Carl, Raj, Megan, Brandon]



        names.addFirst("Cuneyt");
        System.out.println(names);//[Cuneyt, Steve, Carl, Raj, Megan, Brandon]

        names.addLast("Ajda");
        System.out.println(names);//[Cuneyt, Steve, Carl, Raj, Megan, Brandon, Ajda]


        names.add(3,"Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Carl, Raj, Megan, Brandon, Ajda]


        names.remove("Ajda");//ilk Ajdayi siler
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]


        names.add("Suleyman");
        String r1=names.remove();//birinci elemani siler
        System.out.println(r1);//Cuneyt
        System.out.println(names);//[Steve, Suleyman, Raj, Megan, Brandon, Ajda]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);//[Steve, Raj, Megan, Brandon, Ajda, Suleyman]

        //size verir,ama silmez(copy+paste)
        String r2=names.peek();
        System.out.println(r2);//Steve
        System.out.println(names);//[Steve, Raj, Megan, Brandon, Ajda, Suleyman]


        names.poll();
























    }
}
