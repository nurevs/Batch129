package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {


        /*
        kullanicidan bir tam sayi aliniz
        Tam sayi 100den kucuk ise kullaniciya "Oyunu Kaybettiniz"mesaji vererek oyunu sonlaridiiniz
        //tam sayi 100 ve 100den buyukse "Oyunu Kazandiniz" mesaji versin
         */



        Scanner input=new Scanner(System.in);
        int num=0;

        int i=100;


        do {
            System.out.println("Bir sayi giriniz");
            num=input.nextInt();

            if (num>=100){
                System.out.println("Kazandiniz!");
            }

        }while (num>=100);

        System.out.println("Kaybettiniz!");
    }
}
