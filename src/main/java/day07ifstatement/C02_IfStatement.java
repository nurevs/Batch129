package day07ifstatement;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        //kullanici gun numarasini girsin ve kod gun ismini yazsin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun sayisini giriniz");
        int dayNo = input.nextInt();

        if (dayNo == 1) {
            System.out.println("Pazar");
        }else if (dayNo == 2) {
            System.out.println("Pazartesi");
        }else if (dayNo == 3) {
            System.out.println("Sali");
        }else if (dayNo == 4) {
            System.out.println("Carsamba");
        }else if (dayNo == 5) {
            System.out.println("Persembe");
        }else if (dayNo == 6) {
            System.out.println("Cuma");
        }else if (dayNo == 7) {
            System.out.println("Cumartesi");
        }

        //Exp2: verilen bir sayi coft sayi ise ekrana cift sayi yazdira kodu olusutnuz

        int sayi = 4;
        if (sayi % 2 == 0) {

            System.out.println("Cift");
        }

        //Exp3:verilen bir sayi 300den kucuk veya 1200den buyuk ise Harika sayi yazsin

        int sayi2 = 3000;

        if (sayi2 < 300 || sayi2 > 1200) {
            System.out.println("Harika Sayi");
        }

        //Exp4:Kullanicidan alinan sayinin tek mi cift mi olduunu yazin

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi Griniz");
        int sayi3 = input.nextInt();

        //1.yol
        if (sayi3 % 2 == 0) {
            System.out.println("Cift");
        }
        if (!(sayi3 % 2 == 0)) {
            System.out.println("Tek");
        }
        //2.yol
        if (sayi3 % 2 ==0){
            System.out.println("Cift");
        }else System.out.println("Tek");

        //Exp5; verilen bir sayinin negatif yada pozitif ya da notr oldu yaz

        int sayi4=3;

        if (sayi4<0){
            System.out.println("negatif");
        }else if (sayi4>0){
            System.out.println("pozitif");
        }else System.out.println("Notr");




    }
}
