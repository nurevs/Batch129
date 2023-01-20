package day29Exceptions;

import java.util.Scanner;

public class C05_Exceptions {
    public static void main(String[] args) {

        //yasi ekrana yazdiran kodu yazdiriniz

        /*
        throw == Application'in kurallarini biz belirlemek istiyorsak throw exceptions kullanabiliriz
        throw key wordu 2 { } arasinda body 'de yer alir
        throw new keyworduyle constructor olusturur.
        throw bir kez kullanilir
        throws istenildigi kadar kullanilabilr
         */

        Scanner input=new Scanner(System.in);
        int yas=input.nextInt();

        System.out.println(yas);


        if (yas<0){
            throw new IllegalArgumentException("yas negatif olamaz");
        }else
            System.out.println("thros her sey yolunda "+yas);
    }
}
