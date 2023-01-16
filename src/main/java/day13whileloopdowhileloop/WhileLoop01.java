package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {


        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz


        Scanner input=new Scanner(System.in);
        System.out.println("Carpim toplosunu gormek icin bir sayi giriniz");

        int num=input.nextInt();
        int num2= Math.abs(num);

        int i=1;
        while (i<11){

            System.out.println(num+ "x"+ i +"="+(num*i));
            i++;
        }

        //Exp2:Verilen bir Strinde her harfin sonrasina * sembolunu ekleyiniz
        //Java==> J*a*v*a

        System.out.println("Bir kelime giriniz");
        String word=input.next();

        int k=0;

        while (k<word.length()){
            System.out.print(word.charAt(k)+"*");
            k++;

        }







    }
}
