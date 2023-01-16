package day17arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {

       /*
     1) ArrayList(List)'ler coklu data depolamak icin kullanilir.
     2) ArrayList(List)'ler non-primitive data type'inda ki coklu datalari depolamak icin kullanilir.
        List'ler "non-primitive" data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder.
     3) ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
        List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flexible" degildirler.
     4) Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi?
          i) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
          ii) Array'ler cok hizli calisir.
          iii) Array'ler memory'de cok az yer kaplar.
    */

        //List nasil olusturulur ?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//[]

        //Listlere eleman nasil eklenir?
        //List'e eleman eklemek icin add() method'unu kullaniriz.
        //add() method'u elemanlari sizin verdiginiz sirada "List"e ekler.(Insertion Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);

        ages.add(1,656);//index 1 e, 656 koy
        System.out.println(ages);//[9, 656, 12, 10]

        ages.add(3,777);
        System.out.println(ages);//[9, 656, 12, 777, 10]


        //List' coklu eleman nasil eklenir?
        //Bir List'e coklu eleman eklemek icin o elemanlari once bir List'in icine koymalisiniz.
        ArrayList<Integer>newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);//[9, 656, 12, 777, 10, 888, 8, 9, 10]
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        //toArray() metodu: eleman sayisini degitirmeyecegimizden eminsek array' ye cevirip memory kullnimini azaltabiliriz

        //Bir List'teki tum elemanlari nasil silebilirim?
//        ages.clear();
//        System.out.println(ages);// []

        //contains() methodu: List'te elamanin var olup olmadigini nasil kontrol ederiz?
        boolean r=ages.contains(656);
        System.out.println(r);//true

       //Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki Listin esit olabilmesi icin,Ayni indexte ayni elemanlar olmalidir.
        ArrayList<String> names=new ArrayList<>();
        names.add("Tom");
        names.add("Jim");
        names.add("Kim");

        ArrayList<String> names2=new ArrayList<>();
        names.add("Tom");
        names.add("Kim");
        names.add("Jim");

        boolean s=names.equals(names2);
        System.out.println(s);//false


        //Example 1: Verilen iki Int Listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kod

        ArrayList<Integer> num=new ArrayList<>();
        num.add(16);
        num.add(17);
        num.add(18);
        num.add(19);

        ArrayList<Integer> num2=new ArrayList<>();

        num2.add(16);
        num2.add(17);
        num2.add(19);
        num2.add(18);

        Collections.sort(num);
        Collections.sort(num2);

        boolean r2=num.equals(num2);
        System.out.println(r2);//true







    }
}
