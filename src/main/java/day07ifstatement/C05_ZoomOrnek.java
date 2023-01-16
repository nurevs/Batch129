package day07ifstatement;

import java.util.Scanner;

public class C05_ZoomOrnek {
    public static void main(String[] args) {

        /*

       Exp: kullanicidan girilen 3 sayinin en buyugunu yazdir
         */

        Scanner input=new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz");
        int sayi1=input.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int sayi2=input.nextInt();
        System.out.println("Ucuncu sayiyi giriniz");
        int sayi3=input.nextInt();

        if (sayi1>=sayi2 && sayi1>=sayi3){
            System.out.println("Birinci sayi buyuk");
        } else if (sayi2>=sayi1 && sayi2>=sayi3) {
            System.out.println("Ikinci sayi buyuk");

        }else if (sayi3>=sayi1 && sayi3>=sayi2){

            System.out.println("Ucuncu buyuk");
        }


    }
}

