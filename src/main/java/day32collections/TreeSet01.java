package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        long one=System.nanoTime();
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);//[3, 8, 12, 25, 32]==> Natural Order yapti,sayilari aldiktan sonra
        //ama bu cok zaman alir,o yuzden yavastir.
        long two=System.nanoTime();
        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);

        //TreeSet yavas oldugu icin elemanlari eklerken hashset kullanip sonrasinda
        //HashSet'i TreeSet'e cevirdik.
        TreeSet<Integer> hts=new TreeSet<>(hs);//HashSet i , TreeSet'e cevirdik.


        System.out.println(hs);//[32, 3, 8, 25, 12] ==>Random
        long three=System.nanoTime();

        System.out.println("TreeSetin uygulama suresi "+(two-one));
        System.out.println("Hashsetin uygulama suresi "+(three-two));

        int first=ts.first();
        System.out.println(first);//3 ==> ilk eleman

        int last=ts.last();
        System.out.println(last);//32 ==> son eleman

        int floor1=ts.floor(15);
        System.out.println(floor1);//12.. 15i arrayde eklesek 12den sonra gelecegi icin, bir oncesindeki degeri yaziyor

        int floor2=ts.floor(12);
        System.out.println(floor2);//12.. Ayni degerlerde yine o degeri yazdirir.
        //floor() methodunda kullanabilecegimiz sayi en kucuk elemandan az olamaz.


        int ceiling1=ts.ceiling(15);//25==> 15 elemanlardan biri degil ama olsaydi ustundeki 25 olacakti o yuzden 25 yazdi
        System.out.println(ceiling1);

        int ceiling2=ts.ceiling(25);
        System.out.println(ceiling2);//25==> 25 elemanlarda oldugu icin yine kendisini yazdi
        //ceiling() methodunda kullanabilecegimiz sayi en buyuk elemandan buyuk olamaz.


       SortedSet<Integer>tailSet1= ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32] ==> bizim verdigimiz eleman ve buyuklerini verdi

        SortedSet<Integer>tailSet2= ts.tailSet(15);
        System.out.println(tailSet2);//[25, 32]==> bizim verdimiz eleman yok ,olsaydi ondan sonrakileri veriridi.

        NavigableSet<Integer> tailSet3= ts.tailSet(12,false);
        System.out.println(tailSet3);//[25, 32]==> 12yi baktik, "false" diyerek onu yazdirma dedik

        SortedSet<Integer> headSet1 = ts.headSet(12);
        System.out.println(headSet1);// [3, 8]==> 12 elemanlardan biri "onceki elemanlar" bir Set icinde yazdirildi. 12 yazdirilmadi

        SortedSet<Integer> headSet2 = ts.headSet(12, true);
        System.out.println(headSet2);// [3, 8, 12]

        //Generic Method: Normal method'lar parametrelerde belirtilen data type'lari ile calisirlar.
        //                Generic Method'lar ise verilen her turlu data type ile calisma becerisine sahiptirler.
        Integer higher1 = ts.higher(12);
        System.out.println(higher1);// 25 ==> 12 den bir sonraki elemani verir

        Integer lower1 = ts.lower(12);
        System.out.println(lower1);// 8 ==> 12 den bir onceki elemani verir











    }

}

