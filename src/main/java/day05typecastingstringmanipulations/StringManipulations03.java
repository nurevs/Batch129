package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*
            Exp1: Asagidaki kurallara gore kullanicinin girdigi passwordu kontrol et
                        i)En az 8 character
                        ii) Space olmasin
                        iii)en az bir tane buyuk harf olsun
                        iv)en az bir tahe kucuk harf olsun
                        v)en az bir tane sembol olsun
                        vi)en az bir tane rakam olsun

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd= input.nextLine();

        //i)En az 8 character
        boolean first = pwd.length()>7;
        System.out.println(first);
        //ii) Space olmasin
        boolean second=!pwd.contains(" ");
        System.out.println(second);
        //iii)en az bir tane buyuk harf olsun
        //NOTE: buyuk harf olmayanlari sil
        //kalan karakter sayisina bak
        //karaktr sayisi 0 ise buyuk harf yok demektir
        //0 dan buyukse, buyuk harf var demektir.

        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println(third);

        //iv)en az bir tahe kucuk harf olsun
        boolean fourth=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);

        //v)en az bir tane sembol olsun
        boolean fifth= pwd.replaceAll("[^a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        //vi)en az bir tane rakam olsun
        boolean sixth= pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);






    }
}
