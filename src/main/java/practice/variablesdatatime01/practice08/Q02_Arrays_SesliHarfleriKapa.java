package practice.variablesdatatime01.practice08;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays_SesliHarfleriKapa {
    /*Kullanıcıdan alınan bir kelimedeki sesli harfleri kapatıp her bir
     karakteri bir array elemanı olarak yazdıran bir kod yazınız.
    Örn:
    input: Merhaba
    output: [M, *, r, h, *, b, *]
    */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String str=input.nextLine();

        String[] arr = str.split("");

        for (int i = 0; i < arr.length; i++) {

            switch (arr[i]){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":

                    arr[i] = "*";
            }

        }
        System.out.println(Arrays.toString(arr));



    }


}
