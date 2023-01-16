package day03scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        //Exp2: Kullanicidan alacaginiz 5 basamakli bir sayinin
        // ilk iki ve son iki basamagindaki rakamlari toplamini yazdiran kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("5 basamakli sayi giriniz");
        int sayi=input.nextInt();
        int ilkIkiRkm=sayi/1000;
        System.out.println("ilk iki rakam "+ilkIkiRkm);

        int ilkIkiTop= (ilkIkiRkm%10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);

        int sonIkiRkm= sayi%100;
        System.out.println("son iki rakam"+ sonIkiRkm);
        
        int sonIkiTop= (sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiTop = " + sonIkiTop);



        System.out.println("ilk iki ve son iki bas toplami="+(ilkIkiTop+sonIkiTop));
    }
}
