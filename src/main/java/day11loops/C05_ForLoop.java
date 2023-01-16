package day11loops;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {
        //5'ten 10'a kadar tam sayilarin toplamini bulan kod
        int toplam=0;

        for (int i=5;i<11;i++){

            toplam+=i;
  }
        System.out.println(toplam);

        //6dan 3 e kadar olan tam sayilarin carpimi

        int carpim=1;

        for (int i = 6; i >2 ; i--) {

            carpim*=i;

        }
        System.out.println(carpim);


        //Bir tam sayinin rakamlari toplani yazan kod

        int sonuc=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int num=input.nextInt();
        num=Math.abs(num);
        int onlar=0;
        int yuzler=0;


        for (int i=num;i>0;i/=10){

           sonuc+=i%10;
  }
        System.out.println(sonuc);





    }
}
