package day10switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        /*

         Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Ulke isminizi giriniz");
        String country= input.nextLine().toLowerCase();

        switch (country){

            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            default:
                System.out.println("Lutfen ulke ismi giriniz");





        }
    }
}
