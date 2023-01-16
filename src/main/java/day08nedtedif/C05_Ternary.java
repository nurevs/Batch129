package day08nedtedif;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C05_Ternary {
    /*
        kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=input.nextInt();

        System.out.println(sayi<=0 ? sayi* -1: sayi);


        System.out.println("Bir sayo girijniz");
        int sayi2=input.nextInt();

        System.out.println(sayi2>0? "Pozitif": "Negatif");



    }


}
