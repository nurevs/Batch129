package day08nedtedif;

import java.util.Scanner;

public class C01_NestedIf {
    /*
    TASK : Kullanicidan 3 tane pozitif bir tamsayi aliniz.
           Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
           Eger ucgen ise "eskenar"
           Ucgen olma durumunu
           kontrol ediniz.

           INFO :
           Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                            herhangi iki kenar farki ucuncu kenardan kucuk olmali

            a+b>c>a-b
            a+c>b>a-c
            b+c>a>b-c
            a=b=c ise eskenar ucgen
            
            Java nested kodlari calistirirken cok zaman harciyotr
            Buna "Time Complexity" deniyor
            Bu yuzden mumkunse nested kod yazilmamali
            

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {// Ucgen olma Durumu buyuk if

            if (a == b && b == c && a == c) {
                System.out.println("Eskenar Ucgen");
            } else {
                System.out.println("Ucgen ama Eskenar ucgen degildir.");
            }

        } else {//Ucgen Olmama durumu
            System.out.println("Ucgen Degildir");
        }


        //Exp2: Kullancidan bir ucgenon kenar uzunlugunuz al
        //uc kenari birbirine esit ise "Eskaner Ucgen" yazdiriniz
        //sadece iki kenari birbirine esitse "Ikizkenar Ucgen"yaz
        //tum kenarlari birbirinden farkli ise "Cesit Kenar Ucgen"yazdir


        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        int kenar1 = input.nextInt();
        int kenar2 = input.nextInt();
        int kenar3 = input.nextInt();

        if (kenar1 + kenar2 > kenar3 && kenar1 - kenar2 < kenar2 && kenar1 + kenar3 > kenar1 && kenar1 - kenar3 < kenar2 && kenar2 + kenar3 > kenar1 && kenar2 - kenar3 < kenar1) {
            if (kenar1 == kenar2 && kenar2 == kenar3) {
                System.out.println("Eskaner Ucgen");
            } else if (kenar1 == kenar2 || kenar2 == kenar3 || kenar3 == kenar1) {
                System.out.println("Ikizkenar Ucgen");
            } else System.out.println("Cesit kenar");
        }else System.out.println("Ucgen Degildir");

    }//main
}
