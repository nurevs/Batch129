package kendipraktiklerim;

import java.util.Scanner;

public class Discord_2012 {
    public static void main(String[] args) {

         /*
    EXAMPLE 12:

    Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdiriniz
     */


//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen bir karakter giriniz");
//        char ch = input.next().charAt(0);
//
//
//        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//            System.out.println("Girdiginiz " + ch + " karakteri bir harftir.");
//        } else
//            System.out.println("Girdiginiz " + ch + " karakteri bir harf değildir.");
//

            int arr[] = { 1, 3, 5 };
            int x = 0;
            for (int w : arr) {
                x = x + w * w;
            }
            System.out.print(x);


    }
}
