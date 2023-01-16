package day03scanner;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //Exp1: Kullanicidan sayilari alarak toplama

        Scanner input= new Scanner(System.in);

        System.out.println("1.sayiyi giriniz");
        int sayi1= input.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sayi2= input.nextInt();

        System.out.println(sayi1+sayi2);

    }
}
