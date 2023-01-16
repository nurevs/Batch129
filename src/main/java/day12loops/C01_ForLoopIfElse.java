package day12loops;

import java.util.Scanner;

public class C01_ForLoopIfElse {
    public static void main(String[] args) {


        /*

        Kullanicidan baslangic ve bitis degerlerini alin,
        baslangiz degerinden alip bitise kadar tum tam sayilari ekrana yazdirin
         */


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz");
        int basNum=input.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitisNum=input.nextInt();

        if (bitisNum>basNum) {
            for (int i = basNum; i < bitisNum; i++) {

                System.out.print(i + " ");
            }
        }else System.out.println("Lutfen bitis degerini , baslangic degerinden buyuk giriniz");


         /*
        HOMEWORK

        Kullanicidan baslangic ve bitis degerlerini alin,
        baslangiz degerinden alip bitise kadar tum cift sayilari ekrana yazdirin
         */











    }
}
