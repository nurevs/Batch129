package practice.variablesdatatime01.advanced_practice.practice01;

import java.util.Scanner;

public class Q03_Turnery_NoteSistemi {
    public static void main(String[] args) {
        /*
        Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.(Ternary kullanınız)
        (90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Diğerleri F)
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Notu giriniz");
        int notSayi=input.nextInt();

        String notHarf=notSayi>100?
                "0 ile 100 arasi not giriniz": notSayi>89?
                "A":notSayi>79?"B":notSayi>69?
                "C":notSayi>59?"D":notSayi>49?
                "E":notSayi>-1?
                "F":"0-100 arasi not giriniz";
        System.out.println(notHarf);
    }
}
