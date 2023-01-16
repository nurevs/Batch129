package practice.variablesdatatime01.advanced_practice.practice01;

import java.util.Scanner;

public class Q06_WhileLoop_IlkveSonRakam {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.

        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi=input.nextInt();

        //1.yol
        int sonRakam=sayi%10;
        int ilkRakam=sayi;

        while (ilkRakam>9){
            ilkRakam/=10;
        }
        System.out.println("ilkRakam= "+ilkRakam);
        System.out.println("SonRakam= "+sonRakam);
        System.out.println("Toplam= "+(ilkRakam+sonRakam));

        //2.yol
        //String sayiString=sayi+"";
        String sayiString2=String.valueOf(sayi);
        int strIlkRakam=Integer.valueOf(sayiString2.substring(0,1));
        int strSonRakam=Integer.valueOf(sayiString2.substring(sayiString2.length()-1));

        System.out.println("Toplam= "+(strSonRakam+strIlkRakam));



    }
}
