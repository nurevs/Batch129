package day03scanner;

import java.util.Scanner;

public class C02_Scanner {

    //Scanner classi kullanici ile etkilesim kurmamizi saglar
    // Scanner bir classtir. Java util kutuphanesinden getirildigi icin import ister

    public static void main(String[] args) {

        //Kullanicidan Data almak icin
        //1.Adim: Scanner Classindan Object olusturun
        Scanner input = new Scanner(System.in);

        // 2.Adim : Kullaniciya ne yapacagini soyle
        System.out.println("Lutfen yasinizi giriniz ");

        //3.Adim : Kullanicidan aldiginiz datayi variable icine koyun
        byte age= input.nextByte();



        //Kullaniciya ad ,memleket, yas ,boy,
        //yasadigi yeri sevip sevmedigini soran prog yaziniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi yaziniz= ");
        String isim = scan.nextLine();// Kullanicidan String deger istedik. Tum satisi almak icin nextLine() sectik
        System.out.println("Lutfen memleketinizi giriniz = ");
        String memleket= scan.nextLine();
        System.out.println("lutfen yasinizi giriniz =");
        int yas=scan.nextInt();
        System.out.println("lutfen boyunuzu giriniz= ");
        short boy=scan.nextShort();
        System.out.println("yasadiginiz yeri seviyor musunuz");
        boolean seviyorMu=scan.nextBoolean();


        System.out.println("**************************");
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);
        System.out.println("**************************");






    }
}
