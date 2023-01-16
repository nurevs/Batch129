package day07ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        /*

        Iki tane String datanin birbirine esit olup olmadigini anlamak icin "==" degil; equals() kullaniriz
        i)equals() ==> Buyuk kucuk harf onemser
        ii)equalsIgnoreCase()==> Buyuk kucuk harf onemsemez
         */

        //Kullanicidan gun isimlerini aliniz haftaici mi
        //haftasonu mu old yazidirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");

        String gunIsmi = input.next();

        if (gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Haftasonu");

        } else if (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")) {

            System.out.println("Haftaici");

        } else System.out.println("Haftanin gunlerini giriniz");


        //2.yol

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi2 giriniz");

        String gunIsmi2 = input1.next();

        boolean haftaici=gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");
        boolean haftasonu=gunIsmi.equalsIgnoreCase("Cumartesi") ||
                gunIsmi.equalsIgnoreCase("Pazar");

        if(haftaici){
            System.out.println("Haftaici");
        }else if (haftasonu){
            System.out.println("Haftasonu");
        }else System.out.println("Gecerli gun girin");





    }
}
