package practice.variablesdatatime01.practicedaytime;

import java.util.Scanner;

public class C01_StringManipulations {

    /*
    String Class Methodlari
                1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                            ii)equals() method'u "boolean" return eder.
                2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf
                                         kucuk harfe dikkat etmeden anlamamiza yarar.
                                      ii) equalsIgnoreCase() method'u "boolean" return eder.
                3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                                 ii) toLowerCase() method'u "String" return eder
                4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                                 ii) toUpperCase() method'u "String" return eder
                5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                             ii) charAt() method'u "char" return eder.
                6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                            ii) length() method'u "int" return eder.
                7)contains(): i)Bir String'de belli bir characterin veya
                                 characterlerin var olup olmadigini anlamak icin
                                 kullanilir
                              ii) contains() method'u "boolean" return eder.
                8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
                           ii)split() method'u "Array" return eder.
                9)replace () i)Metin icerisindeki karakter ya da karakterlerin,
                              istenilen karakter ya da metinle degistirilmesini saglar.
                              Sonuc String'dir..
                 10)replaceFirst()
                             i) Replace ile aynı sadece ilk bulunan karakteri değiştirir
     */
         /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar
             \\D    ==> tum rakam disi character ler
         2) \\w   ==> A->Z        a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
             \\W  ==> A->Z        a->z         0->9    _ disindaki hersey
         3) \\s   ==> space tum bosluklar
             \\S   ==> space disindaki hersey
               12) + Concat: Bir stringe diğerini ekler.
            Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
            her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.
        ONEMLI NOT=JAVA YUKARIDAN ASAGI SOLDAN SAGA CALISIR.
         */

    public static void main(String[] args) {


        System.out.println(15 + 20 + "Merhaba");//35Merhaba

        System.out.println("Merhaba" + 15 + 20);//Merhaba1520
        System.out.println("Merhaba" + (15 + 20));//Merhaba35
        System.out.println("Merhaba" + 15 * 20);//Merhaba300

        //Kullanicidan isim ve soymisini girmesini isteyin






        Scanner input = new Scanner(System.in);
        /*System.out.println("Lutfen isim soyisim veriniz");
        String isim = input.nextLine(), soyAd = input.nextLine();
        String tamIsim = isim = isim.concat("" + soyAd).toUpperCase();
        System.out.println("tamIsim=" + tamIsim);


        System.out.println();*/

        //rakam haricindekileri silin

        String str = "45.99 $";
        str = str.replaceAll("\\D", "");
        System.out.println("str = " + str);//4599

        //Verilen bir cumleyi * ile gizleyin ,10.karakterden sonrasini yazdirin

        String cumle="Her dert Java gibi olsa";
        System.out.println(cumle = cumle.replaceAll("\\w", "*")+cumle.substring(10));


        //aa harfi yerine @ isareti yerlstir

        String kelime="olaganustu";
        System.out.println(kelime.replace("a","@"));

        //a lari e ye cevir
        String txt="Merhaba Dunya";
        System.out.println(txt.replace("a","e"));

        //ilk a yi e ye cevir
        System.out.println(txt.replaceFirst("a","e"));

        //kalem yerine biber yazdir
        String str2="Dolma kalem ile bir dunya kalem aldik";
        System.out.println(str2.replaceAll("kalem","biber"));

        String str3="bugun hava yagmurlu";
        System.out.println(str3.length());//19

        String str4="";
        System.out.println(str4.length());//0

        //Kullanicidan isim ve soyisim girmesini isteyim
        //hangisinin daha uzun oldu yazdiran kodu olustur

        System.out.println("Isim ve soyisim giriniz");
        String name=input.next();
        String surname=input.next();

        if (name.length()>surname.length()){
            System.out.println(name);
        }else if (name.length()==surname.length()){
            System.out.println("esit");
        } else System.out.println(surname);







    }

}
