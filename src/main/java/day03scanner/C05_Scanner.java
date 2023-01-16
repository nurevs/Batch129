package day03scanner;

import java.awt.*;
import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin en ve boyunu
        // alan ve hsaplayan kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("Kisa kenar giriniz ");
        int kisaK= input.nextInt();
        System.out.println("Uzun kenar giriniz ");
        int uzunK=input.nextInt();

        int alan=kisaK*uzunK;
        int cevre=2*(kisaK+uzunK);

        System.out.println("Alan= "+ alan);
        System.out.println("Cevre= "+ cevre);
    }
}
