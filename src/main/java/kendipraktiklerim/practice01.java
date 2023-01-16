package kendipraktiklerim;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */


        Scanner input = new Scanner(System.in);

//        System.out.println("Lutfen bir kelime giriniz");
//        String scr1=input.next();
//
//        System.out.println("Lutfen tekrarlanmasini istediginiz sayiyi giriniz");
//        int tekrarSayisi=input.nextInt();
//
//        char ilkHarf=scr1.charAt(0);//ilk harfi almak icin
//        String sonHarf=scr1.substring(scr1.length()-1);//son harfi almak icin
//
//        for (int i=0;i<tekrarSayisi;i++){
//
//            System.out.print(ilkHarf+sonHarf);
//        }
//        System.out.println();

          /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
//     */
//        System.out.println("Pozitif sayi giriniz");
//       int num1=input.nextInt();
//        num1=Math.abs(num1);
//        int sonuc=0;

//        if (num1>0){
//            if ((num1%2 !=0) && (num1%3 !=0)&& (num1%5!=0)&& (num1%7 !=0)){
//                System.out.println("Asal Sayi " + num1);
//            }else System.out.println("Asal degildir");
//
//        }else System.out.println("Pozitif sayi giriniz");



//        for (int i=0;i<num1;i++){
//
//            if ((num1%2 !=0) && (num1%3 !=0)&& (num1%5!=0)&& (num1%7 !=0)){
//
//            }
//        } System.out.println("Asal Sayi " + num1);



        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

//        System.out.println("Cumle giriniz");
//        String cumle1 = input.nextLine();
//
//        System.out.println("Hangi harfe bakacaksiniz");
//        char ch = input.next().charAt(0); //tek bir karakter aliyoruz
//        int sayac =0;
//
//        for (int i = 0; i < cumle1.length(); i++) {
//
//            if (cumle1.charAt(i) == ch) {
//                sayac++;
//            }
//        }
//        System.out.println(ch + " harfi " + sayac + " kere var");

         /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

        System.out.println("Lutfen bir sayi giriniz");
        int sayi2=input.nextInt();

        int fibonacci ;
        int num1=0;
        int num2=1;

       System.out.print(num1);

        //fibonacci=(sayi2 - 1) + (sayi2 - 2);
        for (int i=1;i<sayi2;++i) {
            fibonacci=num1+num2;
            System.out.print("-"+num2);
            num1=num2;
            num2=fibonacci;

        }

    }
}
